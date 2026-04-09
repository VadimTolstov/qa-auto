package hw5.task6;

public class Main {
    public static void main(String[] args) {
        final BotanicalGarden botanicalGarden = new BotanicalGarden(new Cactus());
        botanicalGarden.maintainPlant();
        botanicalGarden.setPlant(new Orchid());
        botanicalGarden.maintainPlant();

    }
}
