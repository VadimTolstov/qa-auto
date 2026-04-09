package hw5.task4;

public class Main {
    public static void main(String[] args) {
        final Aquarium aquarium = new Aquarium(new Shark());
        aquarium.demonstration();
        aquarium.setSeaCreature(new StarFish());
        aquarium.demonstration();
    }
}
