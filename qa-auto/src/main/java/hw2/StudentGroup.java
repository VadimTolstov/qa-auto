package hw2;

public class StudentGroup {
    String groupName;
    String studentCount;

    public StudentGroup(String groupName, String studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(String studentCount) {
        this.studentCount = studentCount;
    }

    public void printInfo() {
        System.out.println("Группа " + groupName + " количестве студентов = " + studentCount);
    }
}
