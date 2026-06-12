import java.util.Scanner;

public class Q46_FunArm {
    public static boolean isArmstrong(int num) {
        int org = num;
        int temp = num;
        int count = 0;
        int sum = 0;
        
        while (temp > 0) 
        {
            count++;
            temp = temp/10;
        }
        
        temp = num;
        while (temp > 0)
         {
            int digit = temp % 10;
            sum =  sum + (int)Math.pow(digit, count);
            temp = temp/10;
        }
        
        return (org == sum);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter an integer to check for Armstrong: ");
        
        
            int Num = sc.nextInt();
            if (isArmstrong(Num)== true)
             {
                System.out.println(Num + " is an Armstrong number.");
            } 
            else 
            {
                System.out.println(Num + " is NOT an Armstrong number.");
            }
       
    }
}