package hw9.stream;

import java.util.List;

/**
 * 2. Фильтрация чисел, кратных 5
 * Задача: Напишите программу, которая принимает список чисел и отбирает только те, которые делятся на 5 без остатка, используя Stream API.
 */
public class Task2 {

    public void filteringNumber(List<Integer> list) {
        list.stream()
                .filter(s -> s % 5 == 0)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        new Task2().filteringNumber(List.of(1,4 , 5 , 10 ,3 ,15));
    }
}
