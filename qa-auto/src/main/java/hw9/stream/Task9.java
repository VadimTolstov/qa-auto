package hw9.stream;

import java.util.List;

/**
 * 4. Поиск первого элемента, начинающегося на "Б"
 * Задача: Напишите программу, которая принимает список строк и находит первую строку, начинающуюся на букву "Б", используя Stream API.
 */
public class Task9 {

    public String indFirstB(List<String> list) {
        return list.stream()
                .filter(s -> s.startsWith("Б"))
                .findFirst()
                .orElseGet(() -> {
                    System.out.println("Лист пуст или в нем нет совпадений");
                    return "";
                });

    }


    public static void main(String[] args) {
        System.out.println(new Task9().indFirstB(List.of("ФВАВЫ", "12345", "", "Бры")));
        System.out.println(new Task9().indFirstB(List.of("фВЫФыфф", "ыва44", "123456", "1234567")));
        System.out.println(new Task9().indFirstB(List.of("ФВАВЫ", "12345", "123456", "1234567")));
        System.out.println(new Task9().indFirstB(List.of("фыа343", "Бры", "123456", "бр")));
        System.out.println(new Task9().indFirstB(List.of("ФВАВЫ", "12345", "Бры", "1234567")));
        System.out.println(new Task9().indFirstB(List.of()));
    }
}
