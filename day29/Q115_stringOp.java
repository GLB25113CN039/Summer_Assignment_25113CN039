     import java.util.Scanner;

public class Q115_stringOp
 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int choice;

        do {
            System.out.println("\n--- String Menu ---");
            System.out.println("1. Length");
            System.out.println("2. Reverse");
            System.out.println("3. Uppercase");
            System.out.println("4. Lowercase");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Length = " + str.length());
                    break;

                case 2:
                    System.out.print("Reverse = ");
                    for (int i = str.length() - 1; i >= 0; i--)
                        System.out.print(str.charAt(i));
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Uppercase = " + str.toUpperCase());
                    break;

                case 4:
                    System.out.println("Lowercase = " + str.toLowerCase());
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