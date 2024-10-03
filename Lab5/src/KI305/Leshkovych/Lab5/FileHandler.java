package KI305.Leshkovych.Lab5;

import java.io.*;

/**
 * Клас для запису та читання результатiв у текстовому та двiйковому форматах.
 */
public class FileHandler {

    /**
     * Запис результату у текстовий файл.
     *
     * @param fileName iм'я файлу.
     * @param result Результат обчислення.
     * @throws IOException Якщо виникає помилка пiд час запису.
     */
    public void writeTextFile(String fileName, double result) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(Double.toString(result));
        }
    }

    /**
     * Читання результату з текстового файлу.
     *
     * @param fileName iм'я файлу.
     * @return Прочитане значення.
     * @throws IOException Якщо виникає помилка пiд час читання.
     */
    public double readTextFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return Double.parseDouble(reader.readLine());
        }
    }

    /**
     * Запис результату у двiйковий файл.
     *
     * @param fileName iм'я файлу.
     * @param result Результат обчислення.
     * @throws IOException Якщо виникає помилка пiд час запису.
     */
    public void writeBinaryFile(String fileName, double result) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeDouble(result);
        }
    }

    /**
     * Читання результату з двiйкового файлу.
     *
     * @param fileName iм'я файлу.
     * @return Прочитане значення.
     * @throws IOException Якщо виникає помилка пiд час читання.
     */
    public double readBinaryFile(String fileName) throws IOException {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            return dis.readDouble();
        }
    }
}