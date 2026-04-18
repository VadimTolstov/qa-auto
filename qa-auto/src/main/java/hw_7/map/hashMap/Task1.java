package hw_7.map.hashMap;

import java.util.HashMap;
import java.util.Map;

/*
Задача 2:
Проверьте, есть ли определённое имя в HashMap.
 */
public class Task1 {
    private final Map<String, Integer> userNameAndAgeHashMap;

    public Task1() {
        userNameAndAgeHashMap = new HashMap<>();
    }

    public void addKeyAndValue(String userName, Integer userAge) {
        userNameAndAgeHashMap.put(userName, userAge);
    }

    public void isPresentUserName(String userName) {
        if (userNameAndAgeHashMap.containsKey(userName)) {
            System.out.println("Имя " + userName + " присутствует в Map");
        } else {
            System.out.println("Имени " + userName + " нет в Map");
        }
    }
}
