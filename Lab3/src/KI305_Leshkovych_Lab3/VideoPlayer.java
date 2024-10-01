package KI305_Leshkovych_Lab3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Абстрактний клас VideoPlayer описує функцiональнiсть вiдеоплеєра.
 * Вiдеоплеєр керує екраном, динамiками та пультом дистанцiйного керування,
 * а також веде логування виконаних дiй.
 */
public abstract class VideoPlayer {
    protected Screen screen;
    protected Speaker speaker;
    protected Remote remote;
    private BufferedWriter logWriter;

    /**
     * Конструктор, що iнiцiалiзує компоненти вiдеоплеєра та налаштовує логування.
     */
    public VideoPlayer() {
        this.screen = new Screen();
        this.speaker = new Speaker();
        this.remote = new Remote();
        setupLogger();
    }

    private void setupLogger() {
        try {
            logWriter = new BufferedWriter(new FileWriter("videoplayer_log.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Вiдтворює вказане вiдео.
     *
     * @param videoName Назва вiдео, яке потрiбно вiдтворити.
     */
    public void playVideo(String videoName) {
        log("Вiдображення вiдео: " + videoName);
        screen.displayVideo(videoName);
        speaker.playSound("Звук для вiдео " + videoName);
        log("Вiдтворення звуку: Звук для вiдео " + videoName);
    }

    /**
     * Призупиняє поточне вiдео.
     */
    public void pauseVideo() {
        log("Вiдео призупинено.");
        screen.pause();
    }

    /**
     * Припиняє вiдтворення поточного вiдео та очищає екран.
     */
    public void stopVideo() {
        screen.clearScreen();
        log("Екран очищено.");
        speaker.stopSound();
        log("Звук припинено.");
    }

    /**
     * Збiльшує гучнiсть динамiкiв.
     */
    public void increaseVolume() {
        speaker.increaseVolume();
        log("Гучнiсть збiльшена до: " + speaker.getVolume());
    }

    /**
     * Зменшує гучнiсть динамiкiв.
     */
    public void decreaseVolume() {
        speaker.decreaseVolume();
        log("Гучнiсть зменшена до: " + speaker.getVolume());
    }

    /**
     * Використовує пульт для виконання вказаної дiї.
     *
     * @param action Дiя, яку потрiбно виконати за допомогою пульта.
     */
    public void useRemote(String action) {
        log("Виконання дiї: " + action);
        remote.executeAction(action);
    }

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
     * Логує повiдомлення у файл журналу.
     *
     * @param message Повiдомлення, яке потрiбно зафiксувати.
     */
    protected void log(String message) {
        try {
            logWriter.write(message);
            logWriter.newLine();
            logWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Вимикає вiдеоплеєр, фiксуючи дiю вимкнення.
     */
    public void shutdown() {
        log("Вимкнення вiдеоплеєра");
        System.out.println("Вимкнення вiдеоплеєра");
        closeLogger();
    }
}