package hw5.task1;

public class Elephant implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Слон трубит");
    }

    @Override
    public void move() {
        System.out.println("Слон идет");
    }
}
