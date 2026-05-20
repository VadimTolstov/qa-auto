package hw7.set.linkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

/*
Задача 1:
Создайте LinkedHashSet и добавьте в него 5 строк. Проверьте порядок элементов при выводе.
 */
public class Task1 {
    private final Set<String> linkedSet;

    public Task1() {
        this.linkedSet = new LinkedHashSet<>();
    }

    public void addStringInSet(String item) {
        linkedSet.add(item);
    }

    public void printLinkedSet() {
        System.out.println(linkedSet);
        System.out.println();
        linkedSet.forEach(System.out::println);
    }
}
