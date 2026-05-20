package hw7.list.linkedList;

import java.util.Deque;
import java.util.LinkedList;

/*Задача 2:
Реализуйте очередь задач с LinkedList. Добавьте 3 задачи и обработайте их в порядке поступления.
 */
public class Task1 {
    private final Deque<Integer> taskList;

    public Task1() {
        this.taskList = new LinkedList<>();
    }

    public void addTask(Integer task) {
        taskList.addLast(task);
    }

    public void processingTasks() {
        while (!taskList.isEmpty()) {
            System.out.println(taskList.pollFirst());
        }
    }
}
