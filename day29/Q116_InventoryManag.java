import java.util.Scanner;

public class Q116_InventoryManag {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        String itemName[] = new String[10];
        int quantity[] = new int[10];
        int count = 0;

        int choice;

        do {
            System.out.println("\n--- Inventory Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Display Items");
            System.out.println("3. Search Item");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Item Name: ");
                    itemName[count] = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    quantity[count] = sc.nextInt();

                    count++;
                    System.out.println("Item Added.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Items Available.");
                    } else {
                        System.out.println("\nInventory:");
                        for (int i = 0; i < count; i++) {
                            System.out.println(itemName[i] + " - " + quantity[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Item Name to Search: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (itemName[i].equalsIgnoreCase(search)) {
                            System.out.println("Item Found");
                            System.out.println("Name : " + itemName[i]);
                            System.out.println("Quantity : " + quantity[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Item Not Found.");
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