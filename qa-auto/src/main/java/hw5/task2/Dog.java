package hw5.task2;

public class Dog extends Pet {
    @Override
    void feed() {
        System.out.println("Ест сухой корм");
    }

    @Override
    void interact() {
        System.out.println("Собака гуляет");
    }
}
