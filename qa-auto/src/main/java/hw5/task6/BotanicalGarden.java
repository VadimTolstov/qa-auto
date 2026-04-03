package hw5.task6;

public class BotanicalGarden {
    private final Plant plant;

    public BotanicalGarden(Plant plant) {
        this.plant = plant;
    }

    public void maintainPlant() {
        plant.care();
    }
}
