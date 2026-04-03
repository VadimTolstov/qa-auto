package hw5.task8;

public class Manuscript implements Exhibit {
    @Override
    public void describe() {
        System.out.println("Манускрипт");
    }

    @Override
    public void preserve() {
        System.out.println("требует контролируемой влажности");
    }
}
