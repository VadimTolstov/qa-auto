package hw4;

import java.util.Scanner;

public class SwitchTask {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        week();
        ticketPrice();
        convertingNumerical();
        textCommandProcessing();
        calculator();
    }

    static void calculator() {
        System.out.println("Введите первое число: ");
        final int number1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        final int number2 = scanner.nextInt();
        System.out.println("Введите оператор (+, -, *, /): ");
        scanner.nextLine();
        final String operator = scanner.nextLine();
        if (operator.equals("/")) {
            if (number2 == 0) {
                System.out.println("Делить на ноль нельзя!");
                return;
            }
        }

        switch (operator) {
            case "+" -> System.out.println(number1 + number2);
            case "-" -> System.out.println(number1 - number2);
            case "*" -> System.out.println(number1 * number2);
            case "/" -> System.out.println(number1 / number2);
            default -> System.out.println("Введено некорректное значение!");
        }
    }

    static void textCommandProcessing() {
        System.out.println("Введите значение start, stop, restart или status :");
        final String teams = scanner.nextLine();

        switch (teams) {
            case "start" -> System.out.println("Система запущена");
            case "stop" -> System.out.println("Система остановлена");
            case "restart" -> System.out.println("Система перезагружена");
            case "status" -> System.out.println("Система работает");
            default -> System.out.println("Введено некорректное значение!");
        }

    }

    static void convertingNumerical() {
        System.out.println("Введите значение от 0 - 100: ");
        final int ratings = scanner.nextInt();

        if (ratings > 100) {
            System.out.println("Введено некорректное значение!");
        } else if (ratings > 89) {
            System.out.println("A");
        } else if (ratings > 79) {
            System.out.println("B");
        } else if (ratings > 69) {
            System.out.println("C");
        } else if (ratings > 60) {
            System.out.println("D");
        } else if (ratings >= 0) {
            System.out.println("F");
        } else {
            System.out.println("Введено некорректное значение!");
        }

    }

    static void ticketPrice() {
        System.out.println("Введите значение от 1 - 7: ");
        final int day = scanner.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println(300);
            case 6, 7 -> System.out.println(450);
            default -> System.out.println("Введено некорректное значение!");

        }
    }

    static void week() {
        System.out.println("Введите значение от 1 - 7: ");
        final int day = scanner.nextInt();

        switch (day) {
            case 1: {
                System.out.println("Понедельник");
                break;
            }
            case 2: {
                System.out.println("Вторник");
                break;
            }
            case 3: {
                System.out.println("Среда");
                break;
            }
            case 4: {
                System.out.println("Четверг");
                break;
            }
            case 5: {
                System.out.println("Пятница");
                break;
            }
            case 6: {
                System.out.println("Суббота");
                break;
            }
            case 7: {
                System.out.println("Воскресенье");
                break;
            }
            default: {
                System.out.println("Введено некорректное значение!");
            }
        }
    }
}
