import java.io.*;
import java.util.*;

/**
 * Клас Lab1LeshkovichKI305 реалізує приклад програми до лабораторної роботи №1.
 * 
 * Ця програма генерує квадратну матрицю заданого розміру, заповнену вказаним символом
 * по периметру, і записує зубчасту матрицю у файл "MyFile.txt".
 * 
 */

public class Lab1LeshkovichKI305 {
    /**
     * Статичний метод main є точкою входу в програму.
     * 
     * @param args масив рядків, який може містити параметри командного рядка (не використовується у цій програмі).
     * @throws IOException якщо виникає помилка при запису у файл.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введiть розмiр квадратної матрицi (бiльше 3): ");
        int size = in.nextInt();
        in.nextLine();

        if (size < 4) {
            System.out.println("Розмiр матрицi має бути бiльше 3.");
            System.exit(0);
        }

        System.out.print("Введiть символ-заповнювач: ");
        char filler = in.nextLine().charAt(0);

        int border = size / 4;

        System.out.println("Згенерована матриця:");
        try (BufferedWriter fout = new BufferedWriter(new FileWriter("MyFile.txt"))) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i < border || i >= size - border || j < border || j >= size - border) {
                        System.out.print(filler + " ");
                        fout.write(filler + " ");
                    } else {
                        System.out.print("  ");
                        fout.write("  ");
                    }
                }
                System.out.println();
                fout.newLine();
            }
            System.out.println("Матриця успiшно записана у файл MyFile.txt.");
        } catch (IOException e) {
            System.out.println("Помилка запису у файл.");
            e.printStackTrace();
        }

        in.close();
    }
}
