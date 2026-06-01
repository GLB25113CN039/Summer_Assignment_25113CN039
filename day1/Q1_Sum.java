import java.util.Scanner;

public class Q1_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number till where you want to find the sum: ");
        int n = sc.nextInt();
        

    
        int sum = n * (n + 1) / 2;

        
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);

    
    }
}