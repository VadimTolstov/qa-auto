package hw5.task1;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Elephant();
        Zoo zoo = new Zoo(animal);
        zoo.demonstrate();
    }
}
