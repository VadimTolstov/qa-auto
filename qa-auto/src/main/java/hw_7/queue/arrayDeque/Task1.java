package hw_7.queue.arrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

/*
Задача 2:
Используйте ArrayDeque как стек: добавьте элементы и извлеките их в обратном порядке.
 */
public class Task1 {
    private final Deque<Integer> integerStack;

    public Task1() {
        this.integerStack = new ArrayDeque<>();
    }

    public void addIntInStack(Integer number) {
        integerStack.add(number);
    }

    public void get(){
        System.out.println(integerStack);
    }
    public void getAndRemoveLastElement() {
        System.out.println(integerStack. pollFirst());
    }
}
