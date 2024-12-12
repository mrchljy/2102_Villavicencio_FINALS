import java.util.ArrayList;

public class AttendanceManager {
    private ArrayList<Student> students = new ArrayList<>();

    // Add a new student
    public void addStudent(String name, int id) {
        if (checkDuplicateId(id)) {
            System.out.println("Error: A student with the same ID already exists.");
            return;
        }
        students.add(new Student(name, id));
        System.out.println("\nStudent '" + name + "' added successfully.");
    }

    // Mark attendance for a student by ID
    public void markAttendance(int id, boolean isPresent) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setPresent(isPresent);
                System.out.println("\nAttendance marked as " + (isPresent ? "Present" : "Absent") + " for '" + student.getName() + "'.");
                return;
            }
        }
        System.out.println("\nStudent with ID " + id + " not found.");
    }

    // View all attendance records
    public void viewAttendance() {
    if (students.isEmpty()) {
        System.out.println("No students have been added yet.");
        return;
    }

    System.out.println("\n==== Attendance Records ====");
    for (Student student : students) {
        System.out.println("  ID: " + student.getId());
        System.out.println("  Name: " + student.getName());
        System.out.println("  Attendance: " + (student.isPresent() ? "Present" : "Absent"));
        System.out.println("---------------------------");
    }
    }


    // Get total attendance counts
    public void showTotals() {
        int totalPresent = 0, totalAbsent = 0;
        for (Student student : students) {
            if (student.isPresent()) {
                totalPresent++;
            } else {
                totalAbsent++;
            }
        }
        String totals = "| Total Present: " + totalPresent + " | Total Absent: " + totalAbsent + " |";
        printLine(totals.length() - 2);
        System.out.println(totals);
        printLine(totals.length() - 2);
    }

    // Check for duplicate student ID
    private boolean checkDuplicateId(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return true; // ID already exists
            }
        }
        return false; // No duplicate ID found
    }

    // Utility method for borders
    private void printBorder(String title) {
        int width = title != null && !title.isEmpty() ? title.length() + 4 : 33; // Default width of 33
        printLine(width);

        if (title != null && !title.isEmpty()) {
            System.out.println("| " + title + " |");
            printLine(width);
        }
    }

    // Prints a line of the specified width
    private void printLine(int width) {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}