package hw5.task2;

public class Cat extends Pet{
    @Override
    void feed() {
        System.out.println("Eст влажный корм");
    }

    @Override
    void interact() {
        System.out.println("Кошка играет");
    }
}
