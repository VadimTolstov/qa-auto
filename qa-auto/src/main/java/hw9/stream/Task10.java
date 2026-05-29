package hw9.stream;

import java.util.List;

/**
 * 5. Проверка наличия хотя бы одного элемента по условию
 * Задача: Напишите программу, которая проверяет, есть ли хотя бы один элемент в списке,
 * который удовлетворяет заданному условию (например, является чётным числом), используя Stream API.
 */
public class Task10 {

    public boolean anyMatchIspParity(List<Integer> list) {
        return list.stream()
                .anyMatch(i -> i % 2 == 0);
    }

    public static void main(String[] args) {
        System.out.println(new Task10().anyMatchIspParity(List.of(1, 4, 5, 10, 10, 3, 15, 3, 15)));
        System.out.println(new Task10().anyMatchIspParity(List.of(1, 5, 3, 15, 3)));
        System.out.println(new Task10().anyMatchIspParity(List.of(-1, -4, -9)));
        System.out.println(new Task10().anyMatchIspParity(List.of()));
    }
}
