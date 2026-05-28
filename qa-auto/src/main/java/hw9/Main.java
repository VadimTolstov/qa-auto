package hw9;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        MathOperation sum = Integer::sum;
        MathOperation difference = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        System.out.println(sum.operations(2, 3));
        System.out.println(difference.operations(2, 3));
        System.out.println(multiplication.operations(2, 3));
        System.out.println(division.operations(6, 3));


/**
 * 2. Использование анонимного класса
 * Задача: Создайте анонимный класс, реализующий интерфейс Runnable, который выводит сообщение "Hello from anonymous class!".
 */
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };

        r.run();

/**
 * 3. Лямбда-выражение с Predicate
 * Задача: Напишите лямбду, которая проверяет, является ли число чётным.
 */
        Predicate<Integer> predicate = i -> {
            if (i % 2 == 0) {
                System.out.println("Число четное");
                return true;
            } else {
                System.out.println("Число не четное");
                return false;
            }
        };
        predicate.test(2);
        predicate.test(3);

        /**
         * 4. Лямбда-выражение с Function
         * Задача: Создайте лямбду, которая принимает строку и возвращает её длину.
         */
        Function<String, Integer> function = String::length;
        System.out.println(function.apply("ASDASD"));

        /**
         *5. Использование Consumer
         * Задача: Напишите лямбду, которая принимает строку и печатает её в консоль
         */
        Consumer<String> consumer = System.out::println;
        consumer.accept("consumer печатает строку");
    }


}
