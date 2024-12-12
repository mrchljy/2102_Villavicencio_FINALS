import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            AttendanceManager manager = new AttendanceManager();

            while (true) {
                printMenu();
                System.out.print("Choose an option: ");
                String input = scanner.nextLine().trim();

                switch (input) {
                    case "1":
                        System.out.print("\nEnter Student Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Student ID: ");
                        int id = validateIntegerInput(scanner);
                        manager.addStudent(name, id);
                        break;

                    case "2":
                        System.out.print("\nEnter Student ID to mark attendance: ");
                        int markId = validateIntegerInput(scanner);
                        System.out.print("Mark Present? (Yes/No): ");
                        boolean isPresent = validateYesNoInput(scanner);
                        manager.markAttendance(markId, isPresent);
                        break;

                    case "3":
                        manager.viewAttendance();
                        break;

                    case "4":
                        manager.showTotals();
                        break;

                    case "5":
                        System.out.println("\n[✓] Exiting the system. Goodbye!");
                        return;

                    default:
                        System.out.println("\n[!] Invalid option. Please try again.");
                }
            }
        } catch (Exception e) {
            System.out.println("[!] An error occurred: " + e.getMessage());
        }
    }

    // Print the menu
    private static void printMenu() {
        System.out.println("\n+-------------------------------+");
        System.out.println("|       Attendance System       |");
        System.out.println("+-------------------------------+");
        System.out.println("| 1. Add Student                |");
        System.out.println("| 2. Mark Attendance            |");
        System.out.println("| 3. View Attendance            |");
        System.out.println("| 4. Show Totals                |");
        System.out.println("| 5. Exit                       |");
        System.out.println("+-------------------------------+");
    }

    // Validate integer input
    private static int validateIntegerInput(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("[!] Invalid input. Enter a valid number: ");
            }
        }
    }

    // Validate "Yes" or "No" input
    private static boolean validateYesNoInput(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("yes")) return true;
            if (input.equalsIgnoreCase("no")) return false;
            System.out.print("[!] Invalid input. Enter 'Yes' or 'No': ");
        }
    }
}