package hw_7.map.hashMap;

public class Main {
    public static void main(String[] args) {
        final Task1 task1 = new Task1();
        task1.addKeyAndValue("Валера", 22);
        task1.addKeyAndValue("Витя", 12);
        task1.addKeyAndValue("Игорь", 45);
        task1.addKeyAndValue("Семен", 33);
        task1.addKeyAndValue("Лера", 21);

        task1.isPresentUserName("Витя");
        task1.isPresentUserName("Катя");

        final Task2 task2 = new Task2();
        task2.addKeyAndValue("Валера", 5);
        task2.addKeyAndValue("Витя", 12);
        task2.addKeyAndValue("Игорь", 45);
        task2.addKeyAndValue("Семен", 7);
        task2.addKeyAndValue("Лера", 21);
        task2.printUserYoungerEighteen();
    }
}
