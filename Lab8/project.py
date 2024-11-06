import math
import struct

def calculate_expression(x):
    """
    Обчислює значення виразу y = (x-4) / sin(3*x - 1).
    
    Параметри:
        x (float): Вхідне значення змінної.
        
    Повертає:
        float: Результат обчислення виразу.
    """
    try:
        y = (x - 4) / math.sin(3 * x - 1)
        return y
    except ZeroDivisionError:
        print("Помилка: синус дорівнює нулю. Введіть інше значення x.")
        return None

def write_text_file(filename, result):
    """
    Записує результат у текстовий файл.
    
    Параметри:
        filename (str): Назва файлу.
        result (float): Результат обчислення.
    """
    with open(filename, 'w') as file:
        file.write(f"Результат обчислення: {result}\n")

def write_binary_file(filename, result):
    """
    Записує результат у двійковий файл.
    
    Параметри:
        filename (str): Назва файлу.
        result (float): Результат обчислення.
    """
    with open(filename, 'wb') as file:
        file.write(struct.pack('f', result))

def read_text_file(filename):
    """
    Зчитує результат із текстового файлу.
    
    Параметри:
        filename (str): Назва файлу.
    
    Повертає:
        str: Зміст файлу.
    """
    with open(filename, 'r') as file:
        return file.read()

def read_binary_file(filename):
    """
    Зчитує результат із двійкового файлу.
    
    Параметри:
        filename (str): Назва файлу.
    
    Повертає:
        float: Результат обчислення.
    """
    with open(filename, 'rb') as file:
        result = struct.unpack('f', file.read())[0]
        return result
