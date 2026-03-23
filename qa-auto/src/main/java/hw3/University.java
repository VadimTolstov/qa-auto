package hw3;

public class University {
    static String universityName;
    final int studentId;
    String studentName;

    public University(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public static void changeUniversityName(String newName) {
        universityName = newName;
    }

    public void printStudentInfo() {
        System.out.println("Имя " + studentName + " Id " + studentId + " Имя универ " + universityName);
    }
}
