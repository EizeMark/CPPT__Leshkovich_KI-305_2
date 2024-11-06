def generate_jagged_array(n, fill_char):
    """
    Функція для створення зубчатого масиву з квадратної матриці,
    де зберігаються лише заштриховані області.
    
    Параметри:
        n (int): Розмір квадратної матриці.
        fill_char (str): Символ-заповнювач для заштрихованих областей.
    
    Повертає:
        list: Зубчатий масив з потрібним заповненням.
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
    
    Параметри:
        jagged_array (list): Зубчатий масив для виведення.
    """
    n = len(jagged_array)
    for i, row in enumerate(jagged_array):
        if i == 0 or i == n - 1:
            print(" ".join(row))
        else:
            print(row[0] + " " + "  " * (n - 2) + row[1])