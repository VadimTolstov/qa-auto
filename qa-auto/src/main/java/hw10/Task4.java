package hw10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 4. Задача: использование synchronized
 * Условие задачи: Напишите класс Counter с методом increment, увеличивающим значение счётчика. Создайте два потока, каждый из которых вызывает increment() 1000 раз. Обеспечьте правильную работу с помощью synchronized.
 */
public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        final ExecutorService executorService = Executors.newFixedThreadPool(2);

        final Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                Counter.increment();
            }
        };

        executorService.submit(runnable);
        executorService.submit(runnable);

        executorService.shutdown();

        if (executorService.awaitTermination(15, TimeUnit.SECONDS)) {
            System.out.println("counter = " + Counter.getCounter());
        }
    }
}
