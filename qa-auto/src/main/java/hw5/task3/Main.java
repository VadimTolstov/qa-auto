package hw5.task3;

public class Main {
    public static void main(String[] args) {
        Dish dish = new HotDish(10);
        Dish dishDrink = new Drink(200);

        Menu menu = new Menu();
        menu.addDish(dish);
        menu.addDish(dishDrink);

        menu.getDish(0);
        menu.getDish(1);
    }
}
