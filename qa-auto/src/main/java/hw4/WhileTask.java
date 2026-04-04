package hw4;

import java.util.Scanner;

public class WhileTask {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        factorial();
        evenNumber();
        countdown();
    }

    static void factorial() {
        System.out.println("Введите число: ");
        final int number = scanner.nextInt();
        int factorial = 1;
        int i = 1;
        while (i <= number) {
            factorial = factorial * i;
            i++;
        }
        System.out.println(factorial);
    }

    static void evenNumber() {
        System.out.println("Введите число: ");
        final int number = scanner.nextInt();
        int i = 1;

        while (i <= number) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    static void countdown() {
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        while (number > 0) {
            System.out.println(number);
            number--;
        }
    }
}
