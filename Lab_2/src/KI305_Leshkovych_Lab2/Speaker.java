package KI305_Leshkovych_Lab2;

/**
 * Клас Speaker описує роботу динаміків
 */
public class Speaker {
    private int volume = 50;

    public void playSound(String sound) {
        System.out.println("Вiдтворення звуку: " + sound);
    }

    public void stopSound() {
        System.out.println("Звук припинено.");
    }

    public void increaseVolume() {
        volume = Math.min(volume + 10, 100);
        System.out.println("Гучнiсть збiльшена до: " + volume);
    }

    public void decreaseVolume() {
        volume = Math.max(volume - 10, 0);
        System.out.println("Гучнiсть зменшена до: " + volume);
    }

    // Додайте метод для отримання поточного рівня гучності
    public int getVolume() {
        return volume;
    }
}