import java.util.Scanner;

public class Q16_GenArmstrong
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.print("Enter end: ");
        int end = sc.nextInt();

        for (int num = start; num <= end; num++) {
            int temp = num;
            int count = 0;

            
            while (temp != 0) 
            {
                count++;
                temp /= 10;
            }

            temp = num;
            int sum = 0;

            
            while (temp != 0)
             {
                int digit = temp % 10;
                sum = sum + (int) Math.pow(digit, count);
                temp /= 10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }

        
    }
}