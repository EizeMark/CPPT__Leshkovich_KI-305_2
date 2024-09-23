package KI305_Leshkovych_Lab2;

public class VideoPlayerTest {
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