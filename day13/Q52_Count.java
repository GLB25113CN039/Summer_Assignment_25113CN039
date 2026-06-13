import java.util.Scanner;

public class Q52_Count 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int eve = 0, odd = 0;

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
         {
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0) 
            {
                eve++;
            } 
            else
             {
                odd++;
            }
        }

        System.out.println("Number of even elements = " + eve);
        System.out.println("Number of odd elements = " + odd);

      
    }
}