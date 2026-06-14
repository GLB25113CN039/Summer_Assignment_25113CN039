import java.util.Scanner;

public class Q55_SecLarg 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
         if (n < 2) 
         {
            System.out.println("At least 2 elements are required.");
            return;
        }

         int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest, secLarg;
        if (arr[0] > arr[1]) 
        {
            largest = arr[0];
            secLarg = arr[1];
        } 
        else 
        {
            largest = arr[1];
            secLarg = arr[0];
        }
        for (int i = 2; i < n; i++)
         {
            if (arr[i] > largest)
             {
                secLarg = largest;
                largest = arr[i];
            } 
            else if (arr[i] > secLarg && arr[i] != largest) {
                secLarg = arr[i];
            }
        }

        System.out.println("Second largest element = " + secLarg);

        
    }
}