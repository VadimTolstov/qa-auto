package hw8.exceptions;

import hw8.exceptions.ex.AgeException;

public class Main {
    public static void main(String[] args) {
        new Task1().read();
        new Task2().division(2, 0);
        try {
            new Task3().validityOfAge(10);
            new Task3().validityOfAge(0);
            new Task3().validityOfAge(-1);
            new Task3().validityOfAge(150);
            new Task3().validityOfAge(151);
        }  catch (AgeException e) {
            throw new RuntimeException(e);
        }

        new Task4().checkingTheMailInput("user@example.com");
        new Task4().checkingTheMailInput("another@domain.co");
        new Task4().checkingTheMailInput("");
        new Task4().checkingTheMailInput("@missing-local.com");
        new Task4().checkingTheMailInput("invalid-email");
    }
}
