import java.util.Scanner;

public class Q105_StudentManag {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int roll[] = new int[20];
        String name[] = new String[20];
        int marks[] = new int[20];
        int count = 0;
        int choice;

        do {
            System.out.println("\n--- Student Record Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll No: ");
                    roll[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    marks[count] = sc.nextInt();

                    count++;
                    System.out.println("Student Added Successfully.");
                    break;

                case 2:
                    if (count == 0)
                        System.out.println("No Records Found.");
                    else {
                        for (int i = 0; i < count; i++) {
                            System.out.println("\nRoll No : " + roll[i]);
                            System.out.println("Name    : " + name[i]);
                            System.out.println("Marks   : " + marks[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll No to Search: ");
                    int search = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (roll[i] == search) {
                            System.out.println("Student Found");
                            System.out.println("Name : " + name[i]);
                            System.out.println("Marks: " + marks[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student Not Found.");
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