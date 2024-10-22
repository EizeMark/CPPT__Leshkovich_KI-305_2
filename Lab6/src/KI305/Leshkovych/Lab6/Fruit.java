package KI305.Leshkovych.Lab6;

/**
 * Клас для представлення фрукта.
 */
public class Fruit implements Comparable<Fruit> {
    private String name;
    private int weight;

    public Fruit(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Fruit other) {
        return Integer.compare(this.weight, other.weight);
    }

    @Override
    public String toString() {
        return name + ": " + weight + "г";
    }
}