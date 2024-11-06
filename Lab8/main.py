from project import calculate_expression, write_text_file, write_binary_file, read_text_file, read_binary_file

def main():
    x = float(input("Введіть значення x: "))
    result = calculate_expression(x)
    
    if result is not None:
        # Збереження у текстовий файл
        write_text_file('result.txt', result)
        print("Результат збережено у текстовий файл result.txt.")
        
        # Збереження у двійковий файл
        write_binary_file('result.bin', result)
        print("Результат збережено у двійковий файл result.bin.")
        
        # Зчитування з текстового файлу
        text_content = read_text_file('result.txt')
        print("Зміст текстового файлу:")
        print(text_content)
        
        # Зчитування з двійкового файлу
        binary_content = read_binary_file('result.bin')
        print("Результат з двійкового файлу:", binary_content)

if __name__ == "__main__":
    main()