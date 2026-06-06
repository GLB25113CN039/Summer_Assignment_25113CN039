import java.util.Scanner;

public class Q24_Power {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter base : ");
        int x = sc.nextInt();
            System.out.print("Enter exponent or power: ");
        int n = sc.nextInt();

        long result = 1;

        for (int i = 1; i <= n; i++) 
        {
            result = result * x;
        }

        System.out.println("Result = " + result);
    }
}