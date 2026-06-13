import java.util.Scanner;

public class Q51_Compare {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        System.out.println ("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        int larg = arr[0];
        int smal = arr[0];

        for (int i = 1; i < n; i++)
         {
            if (arr[i] > larg) 
            {
                larg = arr[i];
            }
            if (arr[i] < smal)
             {
                smal = arr[i];
            }
        }

        System.out.println("Largest element = " + larg);
        System.out.println("Smallest element = " + smal);

       
    }
}