import java.util.Scanner;

public class Q102_Voting
 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        if (age >= 18)
            System.out.println(name + " is Eligible to Vote.");
        else
            System.out.println(name + " is Not Eligible to Vote.");

        
    }
}