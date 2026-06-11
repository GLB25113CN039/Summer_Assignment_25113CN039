import java.util.Scanner;

public class Q41_FunSum {

    // Function to calculate sum
    static int findSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int s1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int s2 = sc.nextInt();

        int sum = findSum(s1, s2);

        System.out.println("Sum = " + sum);

        
    }
}