package hw10;

public class Counter {

    private static int counter;

    public static synchronized int getCounter() {
        return counter;
    }

    public static synchronized void increment() {
        counter++;
    }
}
