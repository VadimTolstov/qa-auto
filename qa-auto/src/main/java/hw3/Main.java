package hw3;

public class Main {
    public static void main(String[] arg) {
        Company company1 = new Company(1, "Петр");
        Company company2 = new Company(2, "Анна");
        Company.companyName = "IBM";
        Company.printCompanyName();

        System.out.println(MathConstants.calculateCircleArea(2));
        System.out.println(MathConstants.calculateCircumference(2));

        System.out.println(MathConstants.calculateExponentialGrowth(1, 1, 2));
        Library library = new Library();
        System.out.println(library.category);
        System.out.println(library.year);

        University university = new University(1, "Валера");
        University university2 = new University(2, "Света");
        University university3 = new University(3, "Вера");
        System.out.println(University.getUniversityName());
        university.printStudentInfo();
        university2.printStudentInfo();
        university3.printStudentInfo();
        University.changeUniversityName("ДВГУПС");
        university.printStudentInfo();
        university2.printStudentInfo();
        university3.printStudentInfo();

        GameSettings gameSettings = new GameSettings("ABS", 1);
        gameSettings.printGameStatus();
        GameSettings.setMaxPlayers(3);
        gameSettings.printGameStatus();
        gameSettings.addPlayer();
        gameSettings.printGameStatus();

        Person person = new Person("Сергей", "Петров", "123-45-6789");
        Person person2 = new Person("Иван", "Иванов", "123-45-7777");
        person.printPersonInfo();
        person2.printPersonInfo();
        person.setFirstName("Артур");
        person.printPersonInfo();
        person2.printPersonInfo();
    }
}
