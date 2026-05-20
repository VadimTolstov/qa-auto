package hw8.exceptions;

import hw8.exceptions.ex.AgeException;

/**
 * 3. Создание и использование собственного проверяемого исключения
 * Условие задачи: Разработайте метод, который проверяет валидность возраста пользователя. Если возраст меньше 0 или больше 150, метод должен выбрасывать проверяемое исключение.
 */
public class Task3 {

    public void validityOfAge(int age) throws AgeException {

        if (age < 0 || age > 150) {
            throw new AgeException("Age = " + age + " - значение возраста не должен быть меньше 0 или больше 150 ");
        }
        System.out.println("Age = " + age + " - возраст валиден");
    }
}
