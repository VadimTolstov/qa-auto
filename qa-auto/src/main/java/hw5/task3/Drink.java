package hw5.task3;

public class Drink implements Dish {
    private final int volume;

    public Drink(int volume) {
        this.volume = volume;
    }

    @Override
    public void getDescription() {
        System.out.println("Объем " + volume);
    }
}
