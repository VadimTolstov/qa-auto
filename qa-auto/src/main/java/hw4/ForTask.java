package hw4;

import java.util.Scanner;

public class ForTask {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        fissile3();
        sum();
        multiplicationTable();
        checkPrime();
        iterator();
    }

    static void iterator() {
        for (int i = 1; i < 11; i++){
            System.out.println(i);
        }
    }

    static void checkPrime() {
        System.out.println("Введите число: ");
        final int number = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Число простое");
        } else {
            System.out.println("Число не простое");
        }
    }

    static void multiplicationTable() {
        System.out.println("Введите число: ");
        final int number = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(number * i);
        }
    }

    static void sum() {
        System.out.println("Введите число: ");
        final int number = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            count = count + i;
        }
        System.out.println(count);
    }

    static void fissile3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
