import java.util.Scanner;

public class Q15_IsArmstrong {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int org = num;
        int temp = num;
        int digit = 0;
        int sum = 0;

        
        while (temp > 0)
         {
            digit++;
            temp = temp/10;
        }

        temp = num;

        
        while (temp > 0)
         {
            int d = temp % 10;
            int pow = 1;

            for (int i = 1; i <= digit; i++) {
                pow = pow * d;
            }

            sum += pow;
            temp /= 10;
        }

        if (sum == org) 
        {
            System.out.println(org + " is an Armstrong number.");
        } else {
            System.out.println(org + " is not an Armstrong number.");
        }

        
    }
}