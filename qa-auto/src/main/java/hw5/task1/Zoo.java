package hw5.task1;

public class Zoo {
    private final Animal animal;

    public Zoo(Animal animal) {
        this.animal = animal;
    }

    void demonstrate() {
        animal.makeSound();
        animal.move();
    }
}
