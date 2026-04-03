package hw5.task3;

public class HotDish implements Dish {
    private final int temperature;

    public HotDish(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void getDescription() {
        System.out.println("Температура блюда " + temperature);
    }
}
