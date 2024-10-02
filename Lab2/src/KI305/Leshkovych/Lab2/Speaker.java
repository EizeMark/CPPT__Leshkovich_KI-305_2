package KI305.Leshkovych.Lab2;

/**
 * Клас Speaker описує функціональність динаміків.
 * Дозволяє відтворювати та зупиняти звук, а також регулювати рівень гучності.
 */
public class Speaker {
    private int volume = 50;

    /**
     * Відтворює звук із заданою назвою.
     *
     * @param sound Назва звуку, який потрібно відтворити.
     */
    public void playSound(String sound) {
        System.out.println("Вiдтворення звуку: " + sound);
    }

    /**
     * Припиняє відтворення звуку.
     */
    public void stopSound() {
        System.out.println("Звук припинено.");
    }

    /**
     * Збільшує гучність на 10 одиниць, але не більше 100.
     */
    public void increaseVolume() {
        volume = Math.min(volume + 10, 100);
        System.out.println("Гучнiсть збiльшена до: " + volume);
    }

    /**
     * Зменшує гучність на 10 одиниць, але не менше 0.
     */
    public void decreaseVolume() {
        volume = Math.max(volume - 10, 0);
        System.out.println("Гучнiсть зменшена до: " + volume);
    }

    /**
     * Повертає поточний рівень гучності.
     *
     * @return Поточний рівень гучності.
     */
    public int getVolume() {
        return volume;
    }
}