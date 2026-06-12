import java.util.Scanner;
public class Q48_FunPerfect 
{
    public static boolean isPerfect(int num)
     {
           if (num <= 1) return false;
        
        int sum = 1; 
        
        for (int i = 2; i <= Math.sqrt(num); i++) 
        {
            if (num % i == 0)
             {
                sum = sum + i;
                if (i != num / i)
                 { 
                    sum = sum + num / i;
                }
            }
        }
        
        return sum == num;
    }

    

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer to check for Perfect: ");
        
        
            int Num = sc.nextInt();
            if (isPerfect(Num)== true) 
             {
                System.out.println(Num + " is a perfect number.");
            } else 
             {
                System.out.println(Num + " is NOT a perfect number.");
            }
       
    }
    
}