package hw_7.set.hashSet;

import java.util.List;

public class HashSetMain {
    public static void main(String[] args) {

        System.out.println(Task1.convertListToSet(List.of("Привет", "Пока", "Привет", "Как дела", "Пока")));

        final Task2 task2 = new Task2();

        task2.addName("Cергей");
        task2.addName("Cергей");
        task2.addName("Олег");
        task2.addName("Виктор");
        task2.addName("Олег");
    }


}
