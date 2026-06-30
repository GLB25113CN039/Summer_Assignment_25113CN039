import java.util.Scanner;

public class Q109_libManag{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String books[] = new String[20];
        boolean issued[] = new boolean[20];
        int count = 0;
        int choice;

        do {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book Name: ");
                    books[count] = sc.nextLine();
                    issued[count] = false;
                    count++;
                    System.out.println("Book Added Successfully.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Books Available.");
                    } else {
                        System.out.println("\nBook List:");
                        for (int i = 0; i < count; i++) {
                            System.out.print((i + 1) + ". " + books[i]);
                            if (issued[i])
                                System.out.println(" (Issued)");
                            else
                                System.out.println(" (Available)");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book Number to Issue: ");
                    int issue = sc.nextInt() - 1;

                    if (issue >= 0 && issue < count) {
                        if (!issued[issue]) {
                            issued[issue] = true;
                            System.out.println("Book Issued Successfully.");
                        } else {
                            System.out.println("Book Already Issued.");
                        }
                    } else {
                        System.out.println("Invalid Book Number.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book Number to Return: ");
                    int ret = sc.nextInt() - 1;

                    if (ret >= 0 && ret < count) {
                        if (issued[ret]) {
                            issued[ret] = false;
                            System.out.println("Book Returned Successfully.");
                        } else {
                            System.out.println("Book was not Issued.");
                        }
                    } else {
                        System.out.println("Invalid Book Number.");
                    }
                    break;

                case 5:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);

        
    }
}