package hw5.task2;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Dog();
        PetManager petManager = new PetManager(pet);
        petManager.feed();
        petManager.care();
    }
}
