package KI305.Leshkovych.Lab2;

/**
 * Клас Screen описує функціональність екрану.
 * Дозволяє відображати відео, ставити на паузу та очищати екран.
 */
public class Screen {

    /**
     * Відображає задане відео на екрані.
     *
     * @param videoName Назва відео, яке потрібно відобразити.
     */
    public void displayVideo(String videoName) {
        System.out.println("Вiдображення вiдео: " + videoName);
    }

    /**
     * Призупиняє відтворення відео.
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