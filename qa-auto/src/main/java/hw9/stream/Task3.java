package hw9.stream;

import java.util.List;

/**
 * 3. Преобразование строк в их длины
 * Задача: Напишите программу, которая принимает список строк и заменяет каждую строку на её длину, используя Stream API.
 */
public class Task3 {

    public void stringMap(List<String> list) {
        list.stream()
                .map(String::length)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        new Task3().stringMap(List.of("ASSS","12345","123456","1234567"));
    }
}
