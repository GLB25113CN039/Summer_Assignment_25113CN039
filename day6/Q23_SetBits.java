import java.util.Scanner;

public class Q23_SetBits {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;

        while (n > 0) {
            count = count + (n & 1);
            n >>= 1;
        }

        System.out.println("Set Bits = " + count);
    }
}