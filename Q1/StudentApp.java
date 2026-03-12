import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter Student ID: ");
        int studentID = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        // Instantiate StudentRecord object
        StudentRecord student = new StudentRecord(studentID, name, course);

        // Call displayInfo method
        student.displayInfo();

        scanner.close();
    }
}
