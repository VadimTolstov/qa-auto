package hw5.task7;

public class AmusementPark {
    private  Attraction attraction;

    public AmusementPark(Attraction attraction) {
        this.attraction = attraction;
    }

    public void operateAttraction() {
        attraction.info();
        attraction.maintain();
    }

    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }
}
