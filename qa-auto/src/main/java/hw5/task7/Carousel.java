package hw5.task7;

public class Carousel implements Attraction {
    @Override
    public void info() {
        System.out.println("Карусель");
    }

    @Override
    public void maintain() {
        System.out.println("техническое обслуживание");
    }
}
