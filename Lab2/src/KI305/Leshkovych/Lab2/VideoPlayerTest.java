package KI305.Leshkovych.Lab2;

/**
 * Клас VideoPlayerTest демонструє тестування роботи відеоплеєра.
 * Виконує різні операції над об'єктом VideoPlayer, такі як відтворення, пауза, регулювання гучності, використання пульта тощо.
 */
public class VideoPlayerTest {
    /**
     * Головний метод, що запускає тестування відеоплеєра.
     *
     * @param args Аргументи командного рядка (не використовується).
     */
    public static void main(String[] args) {
        VideoPlayer player = new VideoPlayer();
        player.playVideo("Приклад.mp4");
        player.increaseVolume();
        player.decreaseVolume();
        player.pauseVideo();
        player.useRemote("Наступне вiдео");
        player.stopVideo();
        player.shutdown();
    }
}