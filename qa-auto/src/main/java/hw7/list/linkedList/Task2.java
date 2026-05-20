package hw7.list.linkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
Задача 5:
Используйте ListIterator для прохода по LinkedList в обоих направлениях.
 */
public class Task2 {
    private final List<Integer> list;

    public Task2() {
        this.list = new LinkedList<>();
    }

    public void addList(Integer item) {
        list.add(item);
    }

    public void iteratorList() {
        ListIterator<Integer> iterator = list.listIterator();

        System.out.println("==== Обход ВПЕРЕД ===");
        while (iterator.hasNext()) {
            Integer firstItem = iterator.next();
            int index = iterator.previousIndex();
            System.out.println(" Индекс = " + index + " Элемент = " + firstItem);
        }

        System.out.println("==== Обход НАЗАД ===");
        while (iterator.hasPrevious()) {
            Integer lastItem = iterator.previous();
            int index = iterator.nextIndex();
            System.out.println(" Индекс = " + index + " Элемент = " + lastItem);
        }
    }
}
