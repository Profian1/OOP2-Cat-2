public class StudentRecord {
    // Fields
    private int studentID;
    private String name;
    private String course;

    // Constructor
    public StudentRecord(int studentID, String name, String course) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }

    // displayInfo method
    public void displayInfo() {
        System.out.println("===== Student Details =====");
        System.out.println("Student ID : " + studentID);
        System.out.println("Name       : " + name);
        System.out.println("Course     : " + course);
    }
}