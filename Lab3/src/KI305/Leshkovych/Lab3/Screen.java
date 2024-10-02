package KI305.Leshkovych.Lab3;

/**
 * Клас Screen описує функцiональнiсть екрану.
 */
public class Screen {
    /**
     * Вiдображає вказане вiдео на екранi.
     *
     * @param videoName Назва вiдео, яке потрiбно вiдобразити.
     */
    public void displayVideo(String videoName) {
        System.out.println("Вiдображення вiдео: " + videoName);
    }

    /**
     * Призупиняє вiдео, що вiдображається.
     */
    public void pause() {
        System.out.println("Вiдео призупинено.");
    }

    /**
     * Очищає екран.
     */
    public void clearScreen() {
        System.out.println("Екран очищено.");
    }
}