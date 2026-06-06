import java.util.Scanner;

public class Q21_deciTobin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();

        String b = "";

        if (num == 0) {
            b= "0";
        } else {
            while (num > 0) {
                b = (num % 2) + b;
                num /= 2;
            }
        }

        System.out.println("Binary term: " + b);
    }
}