package hw5.task3;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final List<Dish> dishes = new ArrayList<>();

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public void getDish(int i) {
        dishes.get(i).getDescription();
    }
}
