package hw10;

import java.util.List;

/**
 * 6. Параллельная обработка данных с использованием потоков
 * Условие задачи:
 * Напишите программу, которая создает 3 потока для обработки элементов в списке.
 * Каждый поток должен обработать 3 элемента из списка и вывести их индекс и значение.
 * После завершения всех потоков, программа должна вывести общий результат: сколько элементов было обработано и их суммы.
 */
public class Task6 {
    public static void main(String[] args) throws InterruptedException {
        final List<Integer> data = List.of(10, 20, 30, 40, 50, 60, 70, 80, 90);
        final int[][] results = new int[3][2];
        final Thread t1 = new Thread(new ElementProcessor(data, 0, 3, results[0]), "Поток-1");
        final Thread t2 = new Thread(new ElementProcessor(data, 3, 3, results[1]), "Поток-2");
        final Thread t3 = new Thread(new ElementProcessor(data, 6, 3, results[2]), "Поток-3");

        System.out.println("Запуск потоков..... ");
        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        int totalElements = 0;
        int totalSum = 0;
        for (int[] result : results) {
            totalElements += result[0];
            totalSum += result[1];
        }

        System.out.println("Все потоки завершили работу.");
        System.out.println("Общий результат: обработано элементов = " + totalElements +
                ", сумма = " + totalSum
        );
    }

    static class ElementProcessor implements Runnable {
        private final List<Integer> list;
        private final int startIndex;
        private final int count;
        private final int[] result;

        public ElementProcessor(List<Integer> list, int startIndex, int count, int[] result) {
            this.list = list;
            this.startIndex = startIndex;
            this.count = count;
            this.result = result;
        }

        @Override
        public void run() {
            int sum = 0;
            int countFact = 0;
            for (int i = 0; i < count; i++) {
                int index = startIndex + i;
                sum = sum + list.get(index);
                countFact++;
                System.out.println(
                        Thread.currentThread().getName() +
                                " обработал: индекс " + index +
                                ", значение " + list.get(index)
                );
            }
            result[0] = countFact;
            result[1] = sum;
        }
    }
}
