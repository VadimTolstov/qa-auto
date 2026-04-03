package hw5.task4;

public class Main {
    public static void main(String[] args) {
        SeaCreature seaCreature = new Shark();
        Aquarium aquarium = new Aquarium(seaCreature);
        aquarium.demonstration();
    }
}
