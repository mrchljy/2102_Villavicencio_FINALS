public class Student extends Person {
    private boolean isPresent;

    // Constructor
    public Student(String name, int id) {
        super(name, id);
        this.isPresent = false; // Default to absent
    }

    // Getter and Setter for attendance
    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    // Overriding abstract method to show details
    @Override
    public void showDetails() {
        String attendance = isPresent ? "Present" : "Absent";
        System.out.println(String.format("| ID: %d | Name: %s | Attendance: %s |", getId(), getName(), attendance));
    }

    // Optionally override toString() to provide more detailed representation
    @Override
    public String toString() {
        return String.format("Student{ID: %d, Name: %s, Attendance: %s}", getId(), getName(), isPresent ? "Present" : "Absent");
    }
}
