import java.util.Scanner;

public class Q22_BinToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String b = sc.next();

        int deci = 0;
        int power= 0;

        for (int i = b.length() - 1; i >= 0; i--) {
            int d= b.charAt(i) - '0';
            deci = deci + d * (1 << power);
            power++;
        }

        System.out.println("Decimal term : " + deci);
    }
}