package hw_7.set.hashSet;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Задача 3:
Реализуйте метод, который принимает List<String> и возвращает Set<String> без дубликатов.
 */
public class Task1 {
    private final Set<String> hashSet;

    public Task1() {
        this.hashSet = new HashSet<>();
    }

    public Set<String> convertListToSet(List<String> stringList) {
        hashSet.addAll(stringList);
        return hashSet;
    }
}
