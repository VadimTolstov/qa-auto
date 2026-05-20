package hw8.generics;

import java.util.List;

/**
 * Обобщённый метод
 * Задача: Реализуйте метод printList(List<T>), который принимает список любого типа и выводит его элементы.
 */
public class Task5 {

    public <T> void printList(List<T> list) {
        if (list == null) {
            System.out.println("List не должен быть null");
            return;
        }
        list.forEach(System.out::println);
    }
}
