package KI305.Leshkovych.Lab6;

import java.util.ArrayList;
import java.util.List;

/**
 * Параметризований клас Кошик, який моделює контейнер для зберiгання елементiв.
 *
 * @param <T> тип елементiв, якi може мiстити кошик
 */
public class Basket<T extends Comparable<T>> {
    private List<T> items;

    public Basket() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public T getMaxItem() {
        if (items.isEmpty()) {
            return null;
        }
        T maxItem = items.get(0);
        for (T item : items) {
            if (item.compareTo(maxItem) > 0) {
                maxItem = item;
            }
        }
        return maxItem;
    }

    public int getSize() {
        return items.size();
    }

    public void clear() {
        items.clear();
    }
}