package hw7.map.treeMap;

public class Main {
    public static void main(String[] args) {
        final Task1 task1 = new Task1();
        task1.addKeyAndValue("Валера", 337);
        task1.addKeyAndValue("Витя", 848);
        task1.addKeyAndValue("Игорь", 3721);
        task1.addKeyAndValue("Семен", 587);
        task1.addKeyAndValue("Лера", 21);

        task1.printUserRatingTreeMap();
    }
}
