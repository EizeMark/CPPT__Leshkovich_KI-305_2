package KI305.Leshkovych.Lab6;

/**
 * Клас-драйвер для тестування класу Кошик.
 */
public class BasketDriver {
    public static void main(String[] args) {
        // Створюємо кошик для продуктiв
        Basket<Product> productBasket = new Basket<>();
        productBasket.addItem(new Product("Ноутбук", 1500));
        productBasket.addItem(new Product("Телефон", 700));
        productBasket.addItem(new Product("Монiтор", 300));

        System.out.println("Розмiр кошика з продуктами: " + productBasket.getSize());
        System.out.println("Найдорожчий продукт: " + productBasket.getMaxItem());

        // Створюємо кошик для фруктiв
        Basket<Fruit> fruitBasket = new Basket<>();
        fruitBasket.addItem(new Fruit("Яблуко", 150));
        fruitBasket.addItem(new Fruit("Банан", 120));
        fruitBasket.addItem(new Fruit("Кавун", 3000));

        System.out.println("Розмiр кошика з фруктами: " + fruitBasket.getSize());
        System.out.println("Найважчий фрукт: " + fruitBasket.getMaxItem());
    }
}