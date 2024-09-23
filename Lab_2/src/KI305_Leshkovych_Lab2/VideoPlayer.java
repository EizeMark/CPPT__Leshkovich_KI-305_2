package KI305_Leshkovych_Lab2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Клас VideoPlayer, який описує роботу відеоплеєра
 */
public class VideoPlayer {
    private Screen screen;
    private Speaker speaker;
    private Remote remote;
    private BufferedWriter logWriter;

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

    public void playVideo(String videoName) {
        log("Відображення вiдео: " + videoName);
        screen.displayVideo(videoName);
        speaker.playSound("Звук вiдео для " + videoName);
        log("Вiдтворення звуку: Звук вiдео для " + videoName);
    }

    public void pauseVideo() {
        log("Відео призупинено.");
        screen.pause();
    }

    public void stopVideo() {
        screen.clearScreen();
        log("Екран очищено.");
        speaker.stopSound();
        log("Звук припинено.");
    }

    public void increaseVolume() {
        speaker.increaseVolume();
        log("Гучнiсть збiльшена до: " + speaker.getVolume());
    }

    public void decreaseVolume() {
        speaker.decreaseVolume();
        log("Гучнiсть зменшена до: " + speaker.getVolume());
    }

    public void useRemote(String action) {
        log("Виконання дії: " + action);
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

    private void log(String message) {
        try {
            logWriter.write(message);
            logWriter.newLine();
            logWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void shutdown() {
        log("Вимкнення вiдеоплеєра");
        System.out.println("Вимкнення вiдеоплеєра");
        closeLogger();
    }
}