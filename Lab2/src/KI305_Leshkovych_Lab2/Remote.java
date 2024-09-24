package KI305_Leshkovych_Lab2;

/**
 * Клас Remote описує функціональність пульта.
 * Дозволяє виконувати дії, вказуючи команди для виконання.
 */
public class Remote {
    /**
     * Виконує задану дію, виводячи її опис на екран.
     *
     * @param action Дія, яку має виконати пульт.
     */
    public void executeAction(String action) {
        System.out.println("Виконання дiї: " + action);
    }
}