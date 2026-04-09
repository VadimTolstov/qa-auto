package hw5.task8;

public class Museum {
    private  Exhibit exhibit;

    public Museum(Exhibit exhibit) {
        this.exhibit = exhibit;
    }

    public void showExhibit(){
        exhibit.describe();
        exhibit.preserve();
    }

    public void setExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
    }
}
