package hw5.task7;

public class Main {
    public static void main(String[] args) {
        final AmusementPark amusementPark = new AmusementPark(new Carousel());
        amusementPark.operateAttraction();
        amusementPark.setAttraction(new RollerCoaster());
        amusementPark.operateAttraction();
    }
}
