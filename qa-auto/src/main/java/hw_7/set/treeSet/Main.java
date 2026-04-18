package hw_7.set.treeSet;

public class Main {
    public static void main(String[] args) {
       final Task1 task1 = new Task1();
       task1.addNumberFromTreeSet(10);
       task1.addNumberFromTreeSet(20);
       task1.addNumberFromTreeSet(30);
       task1.addNumberFromTreeSet(40);
       task1.addNumberFromTreeSet(50);
       task1.addNumberFromTreeSet(60);

       task1.printMinAndMaxNumber(27);
    }
}
