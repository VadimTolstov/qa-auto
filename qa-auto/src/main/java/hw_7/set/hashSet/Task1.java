package hw_7.set.hashSet;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Задача 3:
Реализуйте метод, который принимает List<String> и возвращает Set<String> без дубликатов.
 */
public class Task1 {


    public static Set<String> convertListToSet(List<String> stringList) {
        return  new HashSet<>(stringList);
    }
}
