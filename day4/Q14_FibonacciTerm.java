import java.util.Scanner;

public class Q14_FibonacciTerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        switch (n)
         {
            case 0 :
                 System.out.println("Nth Fibonacci term: 0");
            case 1 :System.out.println("Nth Fibonacci term: 1");
            default :
             {
                for (int i = 2; i <= n; i++) {
                    int c = a + b;
                    a = b;
                    b = c;
                }
                System.out.println("Nth Fibonacci term: " + b);
            }
        }

        
    }
}