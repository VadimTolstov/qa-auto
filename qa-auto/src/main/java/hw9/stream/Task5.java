package hw9.stream;

import java.util.List;

/**
 * 5. Удаление дубликатов из списка
 * Задача: Напишите программу, которая принимает список элементов и удаляет из него все дубликаты, используя Stream API.
 */
public class Task5 {

    public void distinctNumber(List<Integer> list) {
        list.stream()
                .distinct()
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        new Task5().distinctNumber(List.of(1, 4, 5, 10, 10, 3, 15, 3, 15));
    }
}
