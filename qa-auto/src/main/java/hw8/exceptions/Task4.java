package hw8.exceptions;

import hw8.exceptions.ex.InvalidAddressException;

import java.util.regex.Pattern;

/**
 * 4. Создание и использование собственного непроверяемого исключения
 * Условие задачи: Напишите функцию, которая принимает строку в качестве аргумента и проверяет, является ли строка правильным электронным адресом.
 * Если строка не удовлетворяет критериям, функция должна выбрасывать непроверяемое исключение.
 */
public class Task4 {
    private final static String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private final static Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public void checkingTheMailInput(String mail) {
        if (mail == null || mail.isBlank()) {
            throw new InvalidAddressException("Адрес не может быть пустым");
        }

        if (!EMAIL_PATTERN.matcher(mail).matches()) {
            throw new InvalidAddressException("Некорректный адрес: " + mail);
        }
        System.out.println("Адрес корректный: " + mail);
    }
}
