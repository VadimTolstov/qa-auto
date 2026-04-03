package hw5.task1;

public class Bird implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Птица щебечет");
    }

    @Override
    public void move() {
        System.out.println("Птица летит");
    }
}
