package hw5.task5;

public class Main {

    public static void main(String[] args) {
        FarmAnimal farmAnimal = new Chicken();

        Farm farm = new Farm(farmAnimal);
        farm.collectProducts();
        farm.feed();

        FarmAnimal farmAnimal1 = new Cow();
        Farm farm1 = new Farm(farmAnimal1);
        farm1.feed();
        farm1.collectProducts();
    }
}
