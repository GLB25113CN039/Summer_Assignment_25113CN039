import java.util.Scanner;

class Q8_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int a = num;
        int rev = 0;

        while (num != 0)
         {
            int d = num % 10;
            rev= rev* 10 + d;
            num = num / 10;
        }

        if (a == rev) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }
    }
}