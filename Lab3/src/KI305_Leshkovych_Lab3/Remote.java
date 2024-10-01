package KI305_Leshkovych_Lab3;

/**
 * Клас Remote описує функцiональнiсть пульта дистанцiйного керування.
 */
public class Remote {
    /**
     * Виконує дiю, задану як рядок.
     *
     * @param action Дiя, яку потрiбно виконати пультом.
     */
    public void executeAction(String action) {
        System.out.println("Виконання дiї: " + action);
    }
}