package hw10;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * 5. Реализация пула потоков для обработки задач
 * Условие задачи:
 * Напишите программу, которая использует ExecutorService для создания пула потоков,
 * в котором несколько потоков обрабатывают задачи.
 * Каждая задача — это выполнение простого теста с задержкой.
 * Программа должна создать пул из 4 потоков, каждая задача должна быть выполнена с задержкой в 2 секунды.
 * После выполнения всех задач, результат должен быть выведен в главном потоке.
 */
public class Task5 {
    final static int THREAD_POOL_SIZE = 4;
    final static int TASK_COUNT = 10;
    final static int TASK_DELAY_MS = 2000;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        final ExecutorService executor = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

        final List<Callable<String>> tasks = new ArrayList<>();
        for (int i = 1; i <= TASK_COUNT; i++) {
            final int taskId = i;
            tasks.add(() -> {
                Thread.sleep(TASK_DELAY_MS);
                return "Задача " + taskId + " выполнена потоком " + Thread.currentThread().getName();
            });
        }

        List<Future<String>> results = executor.invokeAll(tasks);
        System.out.println("Все задачи завершены. Результат:");
        for (Future<String> future : results) {
            System.out.println(future.get());
        }
        executor.shutdown();
        System.out.println("\nПул потоков остановлен. Главный поток завершает работу");
    }


}
