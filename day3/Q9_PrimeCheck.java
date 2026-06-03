import java.util.Scanner;


class Q9_PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean prime = true;

        if (num <= 1)
         {
            prime = false;
        } else 
        {
            for (int i = 2; i < num ; i++)
             {
                if (num % i == 0)
                 {
                    prime = false;
                    break;
                }
            }
        }

   
        if (prime == true) 
        {
            System.out.println(num + " is a Prime Number.");
        } else
         {
            System.out.println(num + " is not a Prime Number.");
        }

        
    }
}