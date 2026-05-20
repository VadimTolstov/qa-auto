package hw7.queue.arrayDeque;

public class Main {
    public static void main(String[] args) {
        final Task1 task1 = new Task1();
        task1.addIntInStack(3);
        task1.addIntInStack(10);
        task1.addIntInStack(12);
        task1.addIntInStack(1);
        task1.addIntInStack(50);

        task1.get();
        task1.getAndRemoveLastElement();
        task1.getAndRemoveLastElement();
        task1.getAndRemoveLastElement();
        task1.getAndRemoveLastElement();
        task1.getAndRemoveLastElement();
        task1.getAndRemoveLastElement();

    }
}
