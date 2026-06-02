import java.util.Scanner;

class Q7_ProductOfDigits
 {

    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int p= 1;

        while (num != 0)
         {
            int d = num % 10;
            p = p * d;
            num = num / 10;
        }

        System.out.println("Product of digits = " + p);
    }
}