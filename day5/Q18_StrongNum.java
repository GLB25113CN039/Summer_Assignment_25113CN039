import java.util.Scanner;

public class Q18_StrongNum 
{
    
    static int factorial(int n) 
    {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int org= num;
        int sum = 0;

        while (num > 0) {
            int d = num % 10;
             sum = sum + factorial(d);
            num /= 10;
        }

        if (sum == org) {
            System.out.println(org + " is a Strong Number.");
        } else {
            System.out.println(org + " is not a Strong Number.");
        }

        
    }
}