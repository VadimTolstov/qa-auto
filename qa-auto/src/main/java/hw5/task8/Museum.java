package hw5.task8;

public class Museum {
    private final Exhibit exhibit;

    public Museum(Exhibit exhibit) {
        this.exhibit = exhibit;
    }

    public void showExhibit(){
        exhibit.preserve();
        exhibit.describe();
    }
}
