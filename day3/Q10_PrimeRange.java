import java.util.Scanner;

public class Q10_PrimeRange {
    
    public static boolean isPrime(int num) {
        if (num <= 1) 
        {
            return false;
        }

        for (int i = 2; i < num ; i++)
         {
            if (num % i == 0)
             {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int a= sc.nextInt();

        System.out.print("Enter ending number: ");
        int b = sc.nextInt();

        System.out.println("Prime numbers between " + a + " and " + b + ":");

        for (int i = a; i <= b; i++) 
        {
            if (isPrime(i) == true) 
            {
                System.out.print(i + " ");
            }
        }

        
    }
}