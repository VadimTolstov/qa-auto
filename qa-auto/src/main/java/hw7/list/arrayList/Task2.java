package hw7.list.arrayList;

import java.util.ArrayList;
import java.util.List;

/*
Задача 3:
Создайте ArrayList из строк. Найдите в нём самую длинную строку и выведите её.
 */
public class Task2 {
    private final List<String> list;

    public Task2() {
        this.list = new ArrayList<>();
    }

    public void addStringInList(String item) {
        list.add(item);
    }

    public void printLongestStringFromList() {
        String startString = "";
        for (String item : list) {
            if (item.length() > startString.length()) {
                startString = item;
            }
        }
        System.out.println(startString);
    }
}
