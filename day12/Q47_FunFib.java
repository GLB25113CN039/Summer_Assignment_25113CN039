import java.util.Scanner;

public class Q47_FunFib 
{
    public static void printFib(int n) 
    {
        if (n <= 0) 
        {
            System.out.println("Please enter a positive integer.");
            return;
        }
        
        int a = 0, b = 1;
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci series: ");
        
        
            int terms = sc.nextInt();
            printFib(terms);
        
    }
}