package hw8.generics;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static hw8.generics.MapPrinter.printMap;

public class Main {
    public static void main(String[] args) {
//        String[] words = {"Привет", "мир", "Java"};
//        Integer[] numbers = {1, 2, 3, 4, 5};
//        Double[] doubles = {1.1, 2.2, 3.3};
//        new Task2().printArray(words);
//        new Task2().printArray(numbers);
//        new Task2().printArray(doubles);

//        new Task5().printList(List.of(1,2,3,4,5));
//        new Task5().printList(List.of("Привет", "Пока", "Как дела?"));

        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 30);
        ages.put("Bob", 25);
        System.out.println("Ages map:");
        printMap(ages);

        Map<Integer, String> idToName = new HashMap<>();
        idToName.put(1, "Product A");
        idToName.put(2, "Product B");
        System.out.println("\nID to Name map:");
        printMap(idToName);
    }
}
