package hw2;

public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount(double discount) {
        this.price = price - price / 100 * discount;
    }

    public void printInfo() {
        System.out.println("Название товара " + name + "  цена " + price);
    }
}
