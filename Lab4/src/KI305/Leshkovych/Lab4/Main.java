package KI305.Leshkovych.Lab4;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Головний клас програми для тестування обчислень виразу.
 * 
 * <p>Ця програма дозволяє користувачу ввести значення для змiнної x, обчислює
 * результат виразу y = (x - 4) / sin(3 * x - 1) та записує результат у файл.
 * Програма обробляє виключення для недопустимих значень введення (наприклад, коли
 * знаменник дорiвнює нулю) i помилок при записi файлу.</p>
 */
public class Main {

    /**
     * Точка входу в програму. Запитує у користувача значення x,
     * обчислює вираз i записує результат у файл. 
     * 
     * <p>Обробляє виключення, якi можуть виникнути внаслiдок недопустимих
     * обчислень або помилок при запису файлу.</p>
     * 
     * @param args Команднi аргументи (не використовуються в цiй програмi).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpressionCalculator calculator = new ExpressionCalculator();
        double x = 0.0;
        boolean validInput = false;

        // Цикл для перевiрки правильностi введення
        while (!validInput) {
            System.out.print("Введiть значення x: ");
            try {
                x = scanner.nextDouble();
                validInput = true; // Введення правильне, виходимо з циклу
            } catch (InputMismatchException e) {
                System.err.println("Помилка: Введiть дiйсне число.");
                scanner.next(); // очищаємо некоректний ввiд
            }
        }
        
        try {
            double result = calculator.calculate(x);
            System.out.println("Результат: " + result);
            
            calculator.writeResultToFile(result);
            System.out.println("Результат записано у файл: result.txt");
        } catch (IllegalArgumentException e) {
            System.err.println("Помилка: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Помилка запису у файл: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}