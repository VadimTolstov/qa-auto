package hw5.task8;

public class Sculpture implements Exhibit{
    @Override
    public void describe() {
        System.out.println("Скульптура ");
    }

    @Override
    public void preserve() {
        System.out.println("нуждается в реставрации");
    }
}
