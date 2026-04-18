package hw_7.set.treeSet;

import java.util.TreeSet;

/*
Задача 3:
Найдите ближайшее большее и меньшее число к заданному в TreeSet.
 */
public class Task1 {
    private final TreeSet<Integer> treeSetIntegers;

    public Task1() {
        this.treeSetIntegers = new TreeSet<>();
    }

    public void addNumberFromTreeSet(Integer number) {
        treeSetIntegers.add(number);
    }

    public void printMinAndMaxNumber(Integer item) {
        System.out.println("Наименьший элемент " + treeSetIntegers.lower(item) + " от item = " + item);
        System.out.println("Наибольший элемент " + treeSetIntegers.higher(item) + " от item = " + item);
    }
}
