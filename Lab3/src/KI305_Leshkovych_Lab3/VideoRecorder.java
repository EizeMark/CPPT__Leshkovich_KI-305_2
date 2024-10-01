package KI305_Leshkovych_Lab3;

import KI305_Leshkovych_Lab3.VideoPlayer;

/**
 * Клас VideoRecorder реалiзує функцiональнiсть вiдеозаписувача.
 */
public class VideoRecorder extends VideoPlayer implements Recordable {

    /**
     * Записує вiдео з вказаним iм'ям.
     *
     * @param videoName Назва вiдео, яке потрiбно записати.
     */
    @Override
    public void recordVideo(String videoName) {
        log("Запис вiдео: " + videoName);
        System.out.println("Запис вiдео: " + videoName);
    }

    /**
     * Зупиняє запис вiдео.
     */
    @Override
    public void stopRecording() {
        log("Запис зупинено.");
        System.out.println("Запис зупинено.");
    }
}