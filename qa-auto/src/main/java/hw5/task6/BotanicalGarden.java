package hw5.task6;

public class BotanicalGarden {
    private  Plant plant;

    public BotanicalGarden(Plant plant) {
        this.plant = plant;
    }

    public void maintainPlant() {
        plant.care();
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }
}
