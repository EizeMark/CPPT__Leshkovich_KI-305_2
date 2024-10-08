import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Програма для генерацiї зубчатого масиву з квадратної матрицi,
 * де зберiгаються лише заштрихованi областi.
 */
public class Lab1Leshkovych305 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введiть розмiр квадратної матрицi (n >= 4): ");
        int n = scanner.nextInt();
        scanner.nextLine();

        if (n < 4) {
            System.out.println("Помилка: розмiр матрицi повинен бути не меншим за 4.");
            return;
        }

        System.out.print("Введiть символ-заповнювач: ");
        String input = scanner.nextLine();

        if (input.length() != 1) {
            System.out.println("Помилка: необхiдно ввести лише один символ.");
            return;
        }

        char fillChar = input.charAt(0);

        char[][] jaggedArray = new char[n][];

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                jaggedArray[i] = new char[n];
                for (int j = 0; j < n; j++) {
                    jaggedArray[i][j] = fillChar;
                }
            } else {
                jaggedArray[i] = new char[2];
                jaggedArray[i][0] = fillChar;
                jaggedArray[i][1] = fillChar;
            }
        }

        // Виводимо масив на екран
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                for (char ch : jaggedArray[i]) {
                    System.out.print(ch + " ");
                }
            } else {
                System.out.print(jaggedArray[i][0] + " ");
                for (int j = 1; j < n - 1; j++) {
                    System.out.print("  ");
                }
                System.out.print(jaggedArray[i][1] + " ");
            }
            System.out.println();
        }

        try (FileWriter writer = new FileWriter("output.txt")) {
            for (int i = 0; i < n; i++) {
                if (i == 0 || i == n - 1) {
                    for (char ch : jaggedArray[i]) {
                        writer.write(ch + " ");
                    }
                } else {
                    writer.write(jaggedArray[i][0] + " ");
                    for (int j = 1; j < n - 1; j++) {
                        writer.write("  ");
                    }
                    writer.write(jaggedArray[i][1] + " ");
                }
                writer.write("\n");
            }
        } catch (IOException e) {
            System.out.println("Помилка при записi у файл: " + e.getMessage());
        }

        scanner.close();
    }
}