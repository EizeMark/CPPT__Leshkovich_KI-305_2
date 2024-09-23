package KI305_Leshkovych_Lab2;

/**
 * Клас Screen описує роботу екрану
 */
public class Screen {
    public void displayVideo(String videoName) {
        System.out.println("Вiдображення вiдео: " + videoName);
    }

    public void pause() {
        System.out.println("Вiдео призупинено.");
    }

    public void clearScreen() {
        System.out.println("Екран очищено.");
    }
}