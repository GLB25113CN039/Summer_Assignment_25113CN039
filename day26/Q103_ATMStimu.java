import java.util.Scanner;

public class Q103_ATMStimu 
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int balance = 10000;
        int choice, amount;

        do {
            System.out.println("\n----- ATM MENU -----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) 
            {

                case 1:
                    System.out.println("Balance = " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    amount = sc.nextInt();
                    balance += amount;
                    System.out.println("Amount Deposited Successfully.");
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextInt();

                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println("Please collect your cash.");
                    } else {
                        System.out.println("Insufficient Balance.");
                    }
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);

       
    }
}