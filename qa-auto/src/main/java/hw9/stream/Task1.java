package hw9.stream;

import java.util.List;

/**
 * 1. Фильтрация строк по длине больше 5
 * Задача: Напишите программу, которая принимает список строк и удаляет из него все строки длиной 5 символов и менее, используя Stream API.
 */
public class Task1 {

    public List<String> filteringStringsByLength(List<String> list) {
        return list.stream()
                .filter(s -> s.length() > 5)
                .toList();
    }

    public static void main(String[] args) {
        new Task1().filteringStringsByLength(List.of("ASSS","12345","123456","1234567")).forEach(System.out::println);
    }
}
