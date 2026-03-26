package hw4;

import java.util.Scanner;

public class IfElseTask {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        comparingNumbers();
        largestNumber();
        estimation();
        checkingForParity();
        discounts();
        testResult();
    }


    static void comparingNumbers() {
        final int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Число положительное.");
        } else if (number < 0) {
            System.out.println("Число отрицательное.");

        } else {
            System.out.println("Число равно нулю.");
        }
    }

    static void largestNumber() {
        System.out.print("Введите первое число: ");
        final int number1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        final int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }
    }

    static void estimation() {
        System.out.print("Введите число: ");
        final int estimation = scanner.nextInt();
        switch (estimation) {
            case 1, 2 -> System.out.println("Неудовлетворительно");
            case 3 -> System.out.println("Удовлетворительно");
            case 4 -> System.out.println("Хорошо");
            case 5 -> System.out.println("Отлично");
            default -> System.out.println("Введено некорректное значение");
        }
    }

    static void checkingForParity() {
        System.out.print("Введите число: ");
        final int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число не четное");
        }
    }

    static void discounts() {
        System.out.print("Введите число: ");
        final int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Скидка 25%");
        } else if (age >= 65) {
            System.out.println("Скидка 30%");
        } else {
            System.out.println("Без скидки");
        }
    }

    static void testResult() {
        System.out.print("Введите число от 0 - 100: ");
        final int result = scanner.nextInt();

        if (result > 100 || result < 0) {
            System.out.println("Введено некорректное число");
        } else if (result >= 90) {
            System.out.println("Отлично");
        } else if (result >= 75) {
            System.out.println("Хорошо");
        } else if (result >= 60) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Неудовлетворительно");
        }
    }
}

