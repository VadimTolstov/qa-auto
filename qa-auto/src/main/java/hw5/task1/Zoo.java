package hw5.task1;

public class Zoo {
    private Animal animal;

    public Zoo(Animal animal) {
        this.animal = animal;
    }

    void demonstrate() {
        animal.makeSound();
        animal.move();
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
