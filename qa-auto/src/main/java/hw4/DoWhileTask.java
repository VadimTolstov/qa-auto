package hw4;

import java.util.Scanner;

public class DoWhileTask {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        requestPositiveNumber();
        checkPassword();
        counter();
        exit();
        numberOfDigits();
    }

    static void numberOfDigits() {
        System.out.println("Введите число: ");
        int count = 0;
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("В числе 1 цифра");
            ;
            return;
        }

        do {
            number = number / 10;
            count++;
        } while (number > 0);
        System.out.println("В числе " + count + " цифр");
    }

    static void requestPositiveNumber() {
        int number;
        do {
            System.out.println("Введите число: ");
            number = scanner.nextInt();
        } while (number <= 0);
    }

    static void checkPassword() {
        String password;
        do {
            System.out.println("Введите пароль: ");
            password = scanner.nextLine();
        } while (!password.equals("abs"));
    }

    static void counter() {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i < 11);
    }

    static void exit() {
        String team;

        do {
            System.out.println("Введите команду: ");
            team = scanner.nextLine();
        } while (!team.equals("exit"));
    }
}
