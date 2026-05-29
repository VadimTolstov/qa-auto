package hw9.stream;

import java.util.List;

/**
 * 3. Сумма всех элементов списка
 * Задача: Напишите программу, которая принимает список чисел и вычисляет их сумму, используя Stream API.
 */
public class Task8 {

    public Integer sumNumber(List<Integer> list) {
        return list.stream()
                .mapToInt(x -> x)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(new Task8().sumNumber(List.of(1, 4, 5, 10, 10, 3, 15, 3, 15)));
        System.out.println(new Task8().sumNumber(List.of(1, 4, 5, 10, 10, 3, 15, 3, 150)));
        System.out.println(new Task8().sumNumber(List.of(-1, -4, -9)));
        System.out.println(new Task8().sumNumber(List.of()));
    }
}
