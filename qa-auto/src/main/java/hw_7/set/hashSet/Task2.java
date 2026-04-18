package hw_7.set.hashSet;

import java.util.HashSet;
import java.util.Set;

/*
Задача 4:
Создайте HashSet, содержащий набор имен. Напишите программу, которая проверяет, содержится ли ваше имя в множестве, и выводит соответствующее сообщение.
 */
public class Task2 {
    private final Set<String> userNameSet;

    public Task2() {
        this.userNameSet = new HashSet<>();
    }

    public void addName(String name) {
        if (userNameSet.add(name)) {
            System.out.println("Имя " + name + " добавлено в список");
        } else {
            System.out.println("Имя " + name + " уже есть в списке");
        }
    }
}
