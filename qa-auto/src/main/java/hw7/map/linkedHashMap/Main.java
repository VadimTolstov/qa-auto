package hw7.map.linkedHashMap;


public class Main {
    public static void main(String[] args) {
        final Task1 task1 = new Task1();

        task1.addKeyAndValue("Валера", "+799135464564");
        task1.addKeyAndValue("Витя", "8953442344");
        task1.addKeyAndValue("Игорь", "284545456456464");

        task1.getValueByKey("Витя");
    }
}
