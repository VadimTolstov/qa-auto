package hw9.stream;

import java.util.List;

/**
 * 4. Создание списка квадратов чисел
 * Задача: Напишите программу, которая принимает список чисел и преобразует его в новый список, где каждое число заменено на его квадрат, используя Stream API.
 */
public class Task4 {

    public void squareNumber(List<Integer> list) {
        list.stream()
                .map(s -> s * s)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        new Task4().squareNumber(List.of(1,4 , 5 , 10 ,3 ,15));
    }
}
