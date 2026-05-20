package hw7.queue.priorityQueue;

public class Main {
    public static void main(String[] args) {
        final Task1 task1 = new Task1();
        task1.addIntInPriorityQueue(3);
        task1.addIntInPriorityQueue(10);
        task1.addIntInPriorityQueue(12);
        task1.addIntInPriorityQueue(1);
        task1.addIntInPriorityQueue(50);

        task1.removeNumber();
        task1.removeNumber();
        task1.removeNumber();
        task1.removeNumber();
        task1.removeNumber();
        task1.removeNumber();
        task1.removeNumber();
    }
}
