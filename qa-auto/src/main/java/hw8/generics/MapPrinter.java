package hw8.generics;

import java.util.Map;

/**
 * Коллекция с обобщёнными типами
 * Задача: Создайте Map<K, V> и реализуйте метод, который принимает обобщённые ключи и значения, а затем выводит их.
 */
public class MapPrinter<K, V> {
    public static <K, V> void printMap(Map<K, V> map) {
        if (map == null) {
            System.out.println("Map is null");
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
