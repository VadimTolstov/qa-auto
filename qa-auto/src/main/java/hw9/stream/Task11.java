package hw9.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 1. Группировка строк по первой букве
 * Задача: Напишите программу, которая принимает список строк и группирует их по первой букве, используя Stream API.
 */
public class Task11 {

    public Map<String, List<String>> groupingByStringFirstItem(List<String> list) {
        return list.stream()
                .filter(s -> s != null && !s.isEmpty())
                .collect(Collectors.groupingBy(s -> s.substring(0, 1)));
    }

    public static void main(String[] args) {
        System.out.println(new Task11().groupingByStringFirstItem(List.of("AA", "AB", "", "BB","BE","CE")));
        System.out.println(new Task11().groupingByStringFirstItem(List.of()));
    }
}
