from project import generate_jagged_array, print_jagged_array

def main():
    """
    Основна функція для запуску програми.
    """
    try:
        # Введення розміру матриці
        n = int(input("Введіть розмір квадратної матриці (n >= 4): "))
        if n < 4:
            print("Помилка: розмір матриці повинен бути не меншим за 4.")
            return
        
        # Введення символу заповнювача
        fill_char = input("Введіть символ-заповнювач: ")
        if len(fill_char) != 1:
            print("Помилка: необхідно ввести лише один символ.")
            return
        
        # Генерація зубчатого масиву
        jagged_array = generate_jagged_array(n, fill_char)
        
        # Виведення масиву на екран
        print("Сформований зубчатий масив:")
        print_jagged_array(jagged_array)

    except ValueError:
        print("Помилка: введіть ціле число для розміру матриці!")

# Запуск програми
if __name__ == "__main__":
    main()