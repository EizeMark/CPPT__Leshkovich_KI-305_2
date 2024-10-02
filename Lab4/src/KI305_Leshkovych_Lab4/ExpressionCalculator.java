package KI305_Leshkovych_Lab4;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Клас для обчислення виразу y = (x - 4) / sin(3 * x - 1).
 * Цей клас забезпечує методи для обчислення значення виразу
 * та запису результату в файл.
 */
public class ExpressionCalculator {

    /**
     * Метод обчислення виразу y = (x - 4) / sin(3 * x - 1).
     *
     * @param x значення змiнної x.
     * @return результат обчислення виразу.
     * @throws IllegalArgumentException якщо sin(3 * x - 1) дорiвнює 0.
     */
    public double calculate(double x) throws IllegalArgumentException {
        double denominator = Math.sin(3 * x - 1);
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменник дорiвнює нулю, обчислення неможливе.");
        }
        return (x - 4) / denominator;
    }

    /**
     * Метод для запису результату у файл.
     *
     * @param result результат обчислення.
     * @throws IOException якщо виникла помилка запису у файл.
     */
    public void writeResultToFile(double result) throws IOException {
        String filename = "result.txt";
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Результат обчислення: " + result);
        }
    }
}