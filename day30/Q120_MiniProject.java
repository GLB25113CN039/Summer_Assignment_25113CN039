import java.util.Scanner;

public class Q120_MiniProject
 {

    static String name[] = new String[10];
    static int marks[] = new int[10];
    static int count = 0;

    static void addStudent(Scanner sc) {
        System.out.print("Enter Student Name: ");
        name[count] = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks[count] = sc.nextInt();
        sc.nextLine();

        count++;
        System.out.println("Student Added.");
    }

    static void displayStudents() {
        if (count == 0) {
            System.out.println("No Records.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println("Name  : " + name[i]);
            System.out.println("Marks : " + marks[i]);
            System.out.println();
        }
    }

    static void searchStudent(Scanner sc) {
        System.out.print("Enter Student Name: ");
        String search = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (name[i].equalsIgnoreCase(search)) {
                System.out.println("Student Found");
                System.out.println("Marks: " + marks[i]);
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Student Not Found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Student Management Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent(sc);
                    break;

                case 4:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);

       
    }
}