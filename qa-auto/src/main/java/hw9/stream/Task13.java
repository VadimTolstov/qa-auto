package hw9.stream;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 3. Поиск среднего значения чисел
 * Задача: Напишите программу, которая принимает список чисел и находит их среднее значение, используя Stream API.
 */
public class Task13 {

    public double averaging(List<Integer> list) {
        return list.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.averagingInt(Integer::intValue));
    }

    public static void main(String[] args) {
        System.out.println(new Task13().averaging(List.of(1, 4, 5, 10, 10, 3, 15, 3, 15)));
        System.out.println(new Task13().averaging(List.of(1, 5, 3, 15, 3)));
        System.out.println(new Task13().averaging(List.of(-1, -4, -9)));
        System.out.println(new Task13().averaging(List.of()));
    }
}
