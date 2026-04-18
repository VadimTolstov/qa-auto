package hw_7.list.arrayList;

import java.util.ArrayList;
import java.util.List;

/*
Задача 1:
Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.
 */
public class Task1 {
    private final List<Integer> list;

    public Task1() {
        this.list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
    }

    public void addIntegerInList(Integer i) {
        list.add(i);
    }

    public void printList() {
        list.forEach(System.out::println);
    }
}
