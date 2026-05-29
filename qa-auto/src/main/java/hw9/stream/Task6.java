package hw9.stream;

import java.util.List;

/**
 * 1. Поиск максимального элемента
 * Задача: Напишите программу, которая принимает список чисел и находит в нём самое большое число, используя Stream API.
 */
public class Task6 {

    public Integer maxNumber(List<Integer> list) {
       return list.stream()
                .max(Integer::compareTo)
                .stream()
                .findFirst()
                .orElseGet(() -> {
                    System.out.println("Лист пуст, возвращаем 0");
                    return 0;
                });
    }

    public static void main(String[] args) {
        System.out.println(new Task6().maxNumber(List.of(1, 4, 5, 10, 10, 3, 15, 3, 15)));
        System.out.println(new Task6().maxNumber(List.of(1, 4, 5, 10, 10, 3, 15, 3, 150)));
        System.out.println(new Task6().maxNumber(List.of(-1, -4, -9)));
        System.out.println(new Task6().maxNumber(List.of()));
    }
}
