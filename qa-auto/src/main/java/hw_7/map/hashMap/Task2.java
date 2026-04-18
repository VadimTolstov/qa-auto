package hw_7.map.hashMap;

import java.util.HashMap;
import java.util.Map;

/*
Задача 3:
Реализуйте метод, который печатает из HashMap всех пользователей младше 18 лет.
 */
public class Task2 {
    private final Map<String, Integer> userNameAndAgeHashMap;

    public Task2() {
        this.userNameAndAgeHashMap = new HashMap<>();
    }

    public void addKeyAndValue(String userName, Integer userAge) {
        userNameAndAgeHashMap.put(userName, userAge);
    }

    public void printUserYoungerEighteen() {
        userNameAndAgeHashMap.entrySet()
                .stream()
                .filter(user -> user.getValue() < 18)
                .forEach(user -> System.out.println(user.getKey() + " имеет возраст " + user.getValue()));
    }
}
