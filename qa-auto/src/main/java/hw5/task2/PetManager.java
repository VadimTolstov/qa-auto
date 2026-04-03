package hw5.task2;

public class PetManager {
    private final Pet pet;

    public PetManager(Pet pet) {
        this.pet = pet;
    }

    public void feed() {
        pet.feed();
    }

    public void care() {
        pet.interact();
    }
}
