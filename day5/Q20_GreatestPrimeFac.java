import java.util.Scanner;

class Q20_GreatestPrimeFac 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose largest prime factor is to be found: ");
        int num = sc.nextInt();
        int l = 1;

        for (int i = 2; i <= num; i++) 
        {
            if (num % i == 0)
             {
                boolean isPrime = true;

                for (int j = 2; j <= i / 2; j++) 
                {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime == true) {
                    l = i;
                }
            }
        }

        System.out.println("Largest Prime Factor = " + l);
    }
}