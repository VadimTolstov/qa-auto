package hw5.task5;

public class Chicken implements FarmAnimal {
    @Override
    public void feeding() {
        System.out.println("требует зерно");
    }

    @Override
    public void products() {
        System.out.println("Курица несёт яйца");
    }
}
