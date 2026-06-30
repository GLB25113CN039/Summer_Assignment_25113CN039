import java.util.Scanner;

public class Q119EmpoyeeManagSys{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id[] = new int[10];
        String name[] = new String[10];
        int count = 0;

        int choice;

        do {
            System.out.println("\n--- Employee Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    id[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    name[count] = sc.nextLine();

                    count++;
                    System.out.println("Employee Added.");
                    break;

                case 2:
                    if (count == 0)
                        System.out.println("No Employee Records.");
                    else {
                        System.out.println("\nEmployee Details:");
                        for (int i = 0; i < count; i++) {
                            System.out.println("ID   : " + id[i]);
                            System.out.println("Name : " + name[i]);
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (id[i] == searchId) {
                            System.out.println("Employee Found");
                            System.out.println("ID   : " + id[i]);
                            System.out.println("Name : " + name[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Employee Not Found.");
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