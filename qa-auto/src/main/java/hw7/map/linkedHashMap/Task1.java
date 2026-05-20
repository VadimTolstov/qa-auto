package hw7.map.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

/*
Задача 2:
Реализуйте телефонную книгу с LinkedHashMap. Добавьте и найдите контакт.
 */
public class Task1 {
    private final Map<String, String> userNameAndPhoneNumberLinkedHashMap;

    public Task1() {
        userNameAndPhoneNumberLinkedHashMap = new LinkedHashMap<>();
    }

    public void addKeyAndValue(String userName, String phoneNumber) {
        userNameAndPhoneNumberLinkedHashMap.put(userName, phoneNumber);
    }

    public void getValueByKey(String userName) {
        System.out.println(
                !userNameAndPhoneNumberLinkedHashMap.isEmpty()
                        ? userNameAndPhoneNumberLinkedHashMap.get(userName)
                        : "LinkedHashMap пуст"
        );
    }
}
