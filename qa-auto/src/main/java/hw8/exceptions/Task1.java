package hw8.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 1. Обработка проверяемого исключения
 * Условие задачи:
 * Напишите программу, которая пытается открыть файл с именем "data.txt". Если файл не найден, программа должна обработать исключение и вывести сообщение: "Файл не найден".
 */
public class Task1 {

    public void read() {
        try (Reader reader = new FileReader("data.txt")) {
            reader.read();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Программа продолжила работать");
    }
}
