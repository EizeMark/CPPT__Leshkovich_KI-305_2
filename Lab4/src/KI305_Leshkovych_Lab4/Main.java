package KI305_Leshkovych_Lab4;

import java.io.IOException;
import java.util.Scanner;

/**
 * Головний клас програми для тестування обчислень виразу.
 * 
 * <p>Ця програма дозволяє користувачу ввести значення для змінної x, обчислює
 * результат виразу y = (x - 4) / sin(3 * x - 1) та записує результат у файл.
 * Програма обробляє виключення для недопустимих значень введення (наприклад, коли
 * знаменник дорівнює нулю) і помилок при записі файлу.</p>
 */
public class Main {

    /**
     * Точка входу в програму. Запитує у користувача значення x,
     * обчислює вираз і записує результат у файл. 
     * 
     * <p>Обробляє виключення, які можуть виникнути внаслідок недопустимих
     * обчислень або помилок при запису файлу.</p>
     * 
     * @param args Командні аргументи (не використовуються в цій програмі).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpressionCalculator calculator = new ExpressionCalculator();

        System.out.print("Введiть значення x: ");
        double x = scanner.nextDouble();

        try {
            double result = calculator.calculate(x);
            System.out.println("Результат: " + result);
            
            calculator.writeResultToFile(result);
            System.out.println("Результат записано у файл: result.txt");
        } catch (IllegalArgumentException e) {
            System.err.println("Помилка: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Помилка запису у файл: " + e.getMessage());
        }
    }
}