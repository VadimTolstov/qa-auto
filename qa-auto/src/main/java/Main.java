public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ферари", 23);
        car.setYear(30);
        car.print();

        Rectangle rectangle = new Rectangle(10,5);
        System.out.println(rectangle.calculateArea());

        Book book = new Book("Война и мир ", "Лев Толстой");
        book.setAuthor("Пушкин");
        book.printInfo();

        BankAccount bankAccount = new BankAccount("Я", 1000);
        bankAccount.deposit(100);
        bankAccount.printBalance();
        bankAccount.withdraw(500);
        bankAccount.printBalance();

        Point point = new Point(10, 15);
        point.print();

        StudentGroup a = new StudentGroup("A", "10");
        a.setStudentCount("12");
        a.printInfo();

        Circle c = new Circle(5);
        c.setRadius(10);
        System.out.println(c.calculateArea());
        System.out.println(c.calculateCircumference());

        Teacher teacher = new Teacher("Вера", "Химия");
        teacher.setSubject("Физика");
        teacher.printInfo();

        Product product = new Product("Ручка", 100.0);
        product.setPrice(11.11);
        product.printInfo();
        product.applyDiscount(0.11);
        product.printInfo();

        Laptop laptop = new Laptop("Ноут", 100);
        laptop.setPrice(12);
        laptop.printInfo();
    }
}
