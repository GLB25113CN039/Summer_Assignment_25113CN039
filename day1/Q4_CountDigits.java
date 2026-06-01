import java.util.Scanner;

public class Q4_CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n , c= 0;

        System.out.print("Enter the number to count digits: ");
        n = sc.nextInt();

        while (n != 0) {
            n = n/ 10;
            c++;
        }

        System.out.println("Number of digits in number = " + c);
    }
}