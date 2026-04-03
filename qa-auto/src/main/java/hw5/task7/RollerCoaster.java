package hw5.task7;

public class RollerCoaster implements Attraction {
    @Override
    public void info() {
        System.out.println("Американские горки");
    }

    @Override
    public void maintain() {
        System.out.println("проверка безопасности");
    }
}
