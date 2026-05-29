package hw9.stream;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 2. Группировка чисел по чётности
 * Задача: Напишите программу, которая принимает список чисел и группирует их на чётные и нечётные, используя Stream API.
 */
public class Task12 {

    public Map<Boolean, List<Integer>> groupingByIspParity(List<Integer> list) {
        return list.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(s -> s % 2 == 0));
    }

    public static void main(String[] args) {
        System.out.println(new Task12().groupingByIspParity(List.of(1, 4, 5, 10, 10, 3, 15, 3, 15)));
        System.out.println(new Task12().groupingByIspParity(List.of(1, 5, 3, 15, 3)));
        System.out.println(new Task12().groupingByIspParity(List.of(-1, -4, -9)));
        System.out.println(new Task12().groupingByIspParity(List.of()));
    }
}
