import java.util.ArrayList;
import java.util.Scanner;
public class GradeTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter marks for " + name + ": ");
            int marks = scanner.nextInt();
            scanner.nextLine();
            students.add(new Student(name, marks));
        }
        int total = 0, highest = Integer.MIN_VALUE, lowest = Integer.MAX_VALUE;
        String topStudent = "", lowStudent = "";

        for (Student s : students) {
            total += s.marks;
            if (s.marks > highest) {
                highest = s.marks;
                topStudent = s.name;
            }
            if (s.marks < lowest) {
                lowest = s.marks;
                lowStudent = s.name;
            }
        }

        double average = (double) total / n;
        System.out.println("\n--- Student Summary Report ---");
        for (Student s : students) {
            System.out.println(s.name + " - " + s.marks + " marks");
        }
        System.out.printf("Average Marks: %.2f%n", average);
        System.out.println("Highest Marks: " + highest + " (by " + topStudent + ")");
        System.out.println("Lowest Marks: " + lowest + " (by " + lowStudent + ")");
        scanner.close();
    }
}
