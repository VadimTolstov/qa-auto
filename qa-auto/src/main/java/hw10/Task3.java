package hw10;

/**
 * 3. Задача: использование volatile
 * Условие задачи: Создайте поток, который бесконечно увеличивает счетчик.
 * В основном потоке через 2 секунды установите флаг stop = true, чтобы остановить поток.
 */
public class Task3 {
    volatile static boolean isStop = false;

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            int i = 0;
            while (!isStop) {
                System.out.println(i++);
            }
        });

        thread.start();
        Thread.sleep(2000);
        isStop = true;
        thread.join();
    }


}
