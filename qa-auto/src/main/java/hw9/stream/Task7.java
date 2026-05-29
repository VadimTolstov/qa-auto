package hw9.stream;

import java.util.List;

/**
 *2. Поиск минимального элемента
 * Задача: Напишите программу, которая принимает список чисел и находит в нем наименьшее число, используя Stream API.
 */
public class Task7 {

    public Integer minNumber(List<Integer> list) {
       return list.stream()
                .min(Integer::compareTo)
                .stream()
                .findFirst()
                .orElseGet(() -> {
                    System.out.println("Лист пуст, возвращаем 0");
                    return 0;
                });
    }

    public static void main(String[] args) {
        System.out.println(new Task7().minNumber(List.of(1, 4, 5, -10, 10, 3, 15, 3, 15)));
        System.out.println(new Task7().minNumber(List.of(1, 4, 5, 10, 10, 3, 15, 3, 150)));
        System.out.println(new Task7().minNumber(List.of(-1, -4, -9)));
        System.out.println(new Task7().minNumber(List.of()));
    }
}
