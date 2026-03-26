package hw4;

import java.util.Scanner;

public class BreakAndContinueTask {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //  sum();
        //  continueNumber3();
       // positiveNumbersPrint();
        stop();
    }

    static void sum() {
        int sum = 0;

        while (true) {
            System.out.println("Введите число: ");
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            sum = sum + number;
            System.out.println("Сумма чисел равна " + sum);
        }
    }

    static void continueNumber3() {

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    static void positiveNumbersPrint() {
        int number = 0;

        do {
            System.out.println("Введите число: ");
            number = scanner.nextInt();
            if (number < 0) {
                continue;
            }
            System.out.println(number);
        } while (!(number == 0));
    }

    static void stop() {

        while (true) {
            System.out.println("Введите слово: ");
            String name = scanner.nextLine();
            if (name.equals("stop")) {
                break;
            }
        }
    }
}
