package hw8.exceptions;

/**
 * 2. Обработка непроверяемого исключения
 * Условие задачи: Напишите метод, который принимает на вход два числа и выполняет их деление. Обработайте ситуацию, когда второе число равно нулю, чтобы избежать исключения при делении.
 */
public class Task2 {

    public void division(int a, int b) {
        if (b == 0) {
            System.out.println("На ноль делить нельзя");
            return;
        }
        try {
            System.out.println(a + "/" + b + "=" + a / b);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        }
    }
}
