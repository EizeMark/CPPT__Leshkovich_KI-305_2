package KI305_Leshkovych_Lab2;

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
        player.playVideo("Приклад.mp4"); // Відтворення відео
        player.increaseVolume();         // Збільшення гучності
        player.decreaseVolume();         // Зменшення гучності
        player.pauseVideo();             // Пауза відео
        player.useRemote("Наступне вiдео"); // Використання пульта для виконання дії
        player.stopVideo();              // Зупинка відео
        player.shutdown();               // Вимкнення відеоплеєра
    }
}