package hw5.task5;

public class Cow implements FarmAnimal{
    @Override
    public void feeding() {
        System.out.println("нуждается в выпасе");
    }

    @Override
    public void products() {
        System.out.println("даёт молоко");
    }
}
