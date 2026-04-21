package hw_7.map.treeMap;

import java.util.Map;
import java.util.TreeMap;

/*
Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы). Выведите отсортированные данные.
 */
public class Task1 {
    private final Map<String, Integer> userRatingTreeMap;

    public Task1() {
        this.userRatingTreeMap = new TreeMap<>();
    }

    public void addKeyAndValue(String user, Integer scores) {
        userRatingTreeMap.put(user, scores);
    }

    public void printUserRatingTreeMap() {
        userRatingTreeMap.entrySet().forEach(System.out::println);
    }
}
