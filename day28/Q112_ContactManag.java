import java.util.Scanner;

public class Q112_ContactManag{
    public static void main(String[] args)
     {

        Scanner sc = new Scanner(System.in);

        String name[] = new String[20];
        String phone[] = new String[20];
        int count = 0;
        int choice;

        do {
            System.out.println("\n--- Contact Management System ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice)
             {

                case 1:
                    if (count < name.length) {
                        System.out.print("Enter Name: ");
                        name[count] = sc.nextLine();

                        System.out.print("Enter Phone Number: ");
                        phone[count] = sc.nextLine();

                        count++;
                        System.out.println("Contact Added Successfully.");
                    } else {
                        System.out.println("Contact List is Full.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Contacts Found.");
                    } else {
                        System.out.println("\nContact List:");
                        for (int i = 0; i < count; i++) 
                        {
                            System.out.println("Name  : " + name[i]);
                            System.out.println("Phone : " + phone[i]);
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Name to Search: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++)
                     {
                        if (name[i].equalsIgnoreCase(search)) {
                            System.out.println("Contact Found");
                            System.out.println("Name  : " + name[i]);
                            System.out.println("Phone : " + phone[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Contact Not Found.");
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