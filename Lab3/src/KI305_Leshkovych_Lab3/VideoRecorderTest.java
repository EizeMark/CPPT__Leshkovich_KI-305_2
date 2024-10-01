package KI305_Leshkovych_Lab3;

/**
 * Тестовий клас для VideoRecorder, який демонструє його функцiональнiсть.
 */
public class VideoRecorderTest {
    /**
     * Головний метод, що виконує тестування функцiй VideoRecorder.
     *
     * @param args Аргументи командного рядка (не використовуються).
     */
    public static void main(String[] args) {
        VideoRecorder recorder = new VideoRecorder();
        recorder.playVideo("Вiдео_1.mp4");
        recorder.increaseVolume();
        recorder.decreaseVolume();
        recorder.pauseVideo();
        recorder.useRemote("Наступне вiдео");
        recorder.stopVideo();
        recorder.recordVideo("Вiдео_2.mp4");
        recorder.stopRecording();
        recorder.shutdown();
    }
}