package hw5.task7;

public class AmusementPark {
    private final Attraction attraction;

    public AmusementPark(Attraction attraction) {
        this.attraction = attraction;
    }

    public void operateAttraction() {
        attraction.info();
        attraction.maintain();
    }
}
