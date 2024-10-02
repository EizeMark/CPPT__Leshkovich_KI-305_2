package KI305.Leshkovych.Lab3;

/**
 * Клас Speaker описує функцiональнiсть динамiкiв.
 */
public class Speaker {
    private int volume = 50;

    /**
     * Вiдтворює вказаний звук.
     *
     * @param sound Звук, який потрiбно вiдтворити.
     */
    public void playSound(String sound) {
        System.out.println("Вiдтворення звуку: " + sound);
    }

    /**
     * Припиняє вiдтворення поточного звуку.
     */
    public void stopSound() {
        System.out.println("Звук припинено.");
    }

    /**
     * Збiльшує гучнiсть на 10, до максимуму 100.
     */
    public void increaseVolume() {
        volume = Math.min(volume + 10, 100);
        System.out.println("Гучнiсть збiльшена до: " + volume);
    }

    /**
     * Зменшує гучнiсть на 10, до мiнiмуму 0.
     */
    public void decreaseVolume() {
        volume = Math.max(volume - 10, 0);
        System.out.println("Гучнiсть зменшена до: " + volume);
    }

    /**
     * Отримує поточний рiвень гучностi.
     *
     * @return Поточний рiвень гучностi.
     */
    public int getVolume() {
        return volume;
    }
}