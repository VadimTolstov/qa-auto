package hw5.task4;

public class Aquarium {
    private final SeaCreature seaCreature;

    public Aquarium(SeaCreature seaCreature) {
        this.seaCreature = seaCreature;
    }

    public void demonstration(){
        seaCreature.move();
    }
}
