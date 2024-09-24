package KI305_Leshkovych_Lab2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Клас VideoPlayer, який описує роботу відеоплеєра.
 * Відеоплеєр керує екраном, динаміками та пультом, а також веде логування дій.
 */
public class VideoPlayer {
    private Screen screen;
    private Speaker speaker;
    private Remote remote;
    private BufferedWriter logWriter;

    /**
     * Конструктор класу VideoPlayer. Ініціалізує екран, динаміки та пульт, а також налаштовує логування.
     */
    public VideoPlayer() {
        this.screen = new Screen();
        this.speaker = new Speaker();
        this.remote = new Remote();
        setupLogger();
    }

    /**
     * Налаштовує логування, створюючи або відкриваючи файл для запису дій відеоплеєра.
     */
    private void setupLogger() {
        try {
            logWriter = new BufferedWriter(new FileWriter("videoplayer_log.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Відтворює відео з заданою назвою, відображаючи його на екрані та відтворюючи звук.
     *
     * @param videoName Назва відео, яке потрібно відтворити.
     */
    public void playVideo(String videoName) {
        log("Відображення вiдео: " + videoName);
        screen.displayVideo(videoName);
        speaker.playSound("Звук вiдео для " + videoName);
        log("Вiдтворення звуку: Звук вiдео для " + videoName);
    }

    /**
     * Призупиняє відтворення відео.
     */
    public void pauseVideo() {
        log("Відео призупинено.");
        screen.pause();
    }

    /**
     * Зупиняє відтворення відео, очищує екран і зупиняє звук.
     */
    public void stopVideo() {
        screen.clearScreen();
        log("Екран очищено.");
        speaker.stopSound();
        log("Звук припинено.");
    }

    /**
     * Збільшує гучність звуку на 10 одиниць, але не більше 100.
     */
    public void increaseVolume() {
        speaker.increaseVolume();
        log("Гучнiсть збiльшена до: " + speaker.getVolume());
    }

    /**
     * Зменшує гучність звуку на 10 одиниць, але не менше 0.
     */
    public void decreaseVolume() {
        speaker.decreaseVolume();
        log("Гучнiсть зменшена до: " + speaker.getVolume());
    }

    /**
     * Виконує дію за допомогою пульта дистанційного керування.
     *
     * @param action Дія, яку потрібно виконати пультом.
     */
    public void useRemote(String action) {
        log("Виконання дії: " + action);
        remote.executeAction(action);
    }

    /**
     * Закриває файл логів після завершення роботи відеоплеєра.
     */
    private void closeLogger() {
        try {
            if (logWriter != null) {
                logWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Записує повідомлення у файл логів.
     *
     * @param message Повідомлення для логування.
     */
    private void log(String message) {
        try {
            logWriter.write(message);
            logWriter.newLine();
            logWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Вимикає відеоплеєр, закриваючи файл логів.
     */
    public void shutdown() {
        log("Вимкнення вiдеоплеєра");
        System.out.println("Вимкнення вiдеоплеєра");
        closeLogger();
    }
}