package KI305.Leshkovych.Lab3;

/**
 * iнтерфейс Recordable для функцiональностi запису вiдео.
 */
public interface Recordable {
    /**
     * Метод для запису вiдео.
     *
     * @param videoName Назва вiдео для запису.
     */
    void recordVideo(String videoName);

    /**
     * Метод для зупинки запису вiдео.
     */
    void stopRecording();
}