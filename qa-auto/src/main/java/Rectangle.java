public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int calculateArea() {
        return width * height;
    }
}
