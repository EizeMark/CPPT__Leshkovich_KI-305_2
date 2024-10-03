package KI305.Leshkovych.Lab5;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpressionCalculator calculator = new ExpressionCalculator();
        FileHandler fileHandler = new FileHandler();
        double x = 0.0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Введiть значення x: ");
            try {
                x = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.err.println("Помилка: Введiть дiйсне число.");
                scanner.next();
            }
        }

        try {
            double result = calculator.calculate(x);
            System.out.println("Результат: " + result);

            fileHandler.writeTextFile("result.txt", result);
            System.out.println("Результат записано у текстовий файл: result.txt");

            fileHandler.writeBinaryFile("result.bin", result);
            System.out.println("Результат записано у двiйковий файл: result.bin");

            double textResult = fileHandler.readTextFile("result.txt");
            double binaryResult = fileHandler.readBinaryFile("result.bin");
            System.out.println("Прочитано з текстового файлу: " + textResult);
            System.out.println("Прочитано з двiйкового файлу: " + binaryResult);
            
        } catch (IllegalArgumentException e) {
            System.err.println("Помилка: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Помилка файлу: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}