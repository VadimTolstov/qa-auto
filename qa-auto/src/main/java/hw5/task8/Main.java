package hw5.task8;

public class Main {
    public static void main(String[] args) {
        final Museum museum = new Museum(new Manuscript());
        museum.showExhibit();
        museum.setExhibit(new Sculpture());
        museum.showExhibit();
    }
}
