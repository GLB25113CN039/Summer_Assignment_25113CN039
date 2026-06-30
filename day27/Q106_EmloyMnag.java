import java.util.Scanner;

public class Q106_EmloyMnag {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int id[] = new int[20];
        String name[] = new String[20];
        double salary[] = new double[20];
        int count = 0;
        int choice;

        do {
            System.out.println("\n--- Employee Management System ---");
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

                    System.out.print("Enter Salary: ");
                    salary[count] = sc.nextDouble();

                    count++;
                    System.out.println("Employee Added Successfully.");
                    break;

                case 2:
                    if (count == 0)
                        System.out.println("No Employee Records.");
                    else {
                        for (int i = 0; i < count; i++) {
                            System.out.println("\nID     : " + id[i]);
                            System.out.println("Name   : " + name[i]);
                            System.out.println("Salary : " + salary[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID: ");
                    int search = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (id[i] == search) {
                            System.out.println("Employee Found");
                            System.out.println("Name   : " + name[i]);
                            System.out.println("Salary : " + salary[i]);
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