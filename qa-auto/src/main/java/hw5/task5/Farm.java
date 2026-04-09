package hw5.task5;

public class Farm {
    private  FarmAnimal farmAnimal;

    public Farm(FarmAnimal farmAnimal) {
        this.farmAnimal = farmAnimal;
    }

    public void feed() {
        farmAnimal.feeding();
    }

    public void collectProducts() {
        farmAnimal.products();
    }


}
