package hw8.generics;

import java.util.Arrays;

/**
 * 2. Задача на дженерик метод
 * Условие задачи: Напишите дженерик метод printArray, который принимает массив
 * элементов любого типа и выводит каждый элемент массива на консоль.
 */
public class Task2 {

    public <T> void printArray(T[] array) {
        if (array == null) {
            System.out.println("Массив не должен быть равен null");
            return;
        }
        Arrays.stream(array).forEach(System.out::println);
    }
}
