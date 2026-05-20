package hw7.list.linkedList;

public class LinkedListMain {
    public static void main(String[] args) {
//        final Task1 task1 = new Task1();
//        task1.addTask(1);
//        task1.addTask(2);
//        task1.addTask(3);
//        task1.addTask(4);
//        task1.addTask(5);
//        task1.processingTasks();

        final Task2 task2 = new Task2();
        task2.addList(0);
        task2.addList(1);
        task2.addList(2);
        task2.addList(3);
        task2.addList(4);
        task2.addList(5);

        task2.iteratorList();
    }
}
