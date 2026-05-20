package hw7.queue.priorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

/*
Задача 1:
Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.
 */
public class Task1 {
    private final Queue<Integer> integerQueue;

    public Task1() {
        this.integerQueue = new PriorityQueue<>();
    }

    public void addIntInPriorityQueue(Integer number) {
        integerQueue.add(number);
    }

    public void removeNumber() {
        System.out.println(
                !integerQueue.isEmpty()
                        ? integerQueue.poll()
                        : "PriorityQueue пуст"
        );
    }
}
