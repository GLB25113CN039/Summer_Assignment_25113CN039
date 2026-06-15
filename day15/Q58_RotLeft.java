import java.util.Scanner;

public class Q58_RotLeft 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
         int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number of left rotations: ");
        int d = sc.nextInt();

        d = d % n; 

        for (int r = 0; r < d; r++) 
         {
            int first = arr[0];

            for (int i = 0; i < n - 1; i++) 
            {
                arr[i] = arr[i + 1];
            }

            arr[n - 1] = first;
        }
        System.out.println("Array after left rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        
    }
}