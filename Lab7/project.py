def generate_jagged_array(n, fill_char): 
    """
    Функція для створення зубчатого масиву з квадратної матриці,
    де зберігаються лише заштриховані області.
    """
    jagged_array = []

    for i in range(n):
        if i == 0 or i == n - 1:
            # Верхній та нижній ряди повністю заповнені символом
            jagged_array.append([fill_char] * n)
        else:
            # Інші ряди мають лише два символи на краях
            row = [fill_char, fill_char]
            jagged_array.append(row)

    return jagged_array

def print_jagged_array(jagged_array):
    """
    Функція для виведення зубчатого масиву на екран.
    """
    n = len(jagged_array)
    for i, row in enumerate(jagged_array):
        if i == 0 or i == n - 1:
            print(" ".join(row))
        else:
            print(row[0] + " " + "  " * (n - 2) + row[1])

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