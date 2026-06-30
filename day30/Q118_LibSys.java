import java.util.Scanner;

public class Q118_LibSys
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        String books[] = new String[10];
        int count = 0;
        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book Name: ");
                    books[count] = sc.nextLine();
                    count++;
                    System.out.println("Book Added.");
                    break;

                case 2:
                    if (count == 0)
                        System.out.println("No Books Available.");
                    else {
                        System.out.println("Books in Library:");
                        for (int i = 0; i < count; i++)
                            System.out.println((i + 1) + ". " + books[i]);
                    }
                    break;

                case 3:
                    System.out.print("Enter Book Name to Search: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (books[i].equalsIgnoreCase(search)) {
                            System.out.println("Book Found.");
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Book Not Found.");
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