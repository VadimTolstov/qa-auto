package hw10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 2. Задача: создание двух потоков
 * Условие задачи: Создайте два потока. Один поток должен печатать "A", второй — "B", каждый по 5 раз с небольшой задержкой.
 */
public class Task2 {

    public static void main(String[] args) {
        final ExecutorService executorService = Executors.newFixedThreadPool(2);

        final Runnable t1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("A");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        final Runnable t2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("B");
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        executorService.submit(t1);
        executorService.submit(t2);
        executorService.shutdown();
    }
}
