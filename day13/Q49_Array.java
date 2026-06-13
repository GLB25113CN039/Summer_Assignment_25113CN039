import java.util.Scanner;

public class Q49_Array {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter " + size + "   elements:");
        for (int i = 0; i < arr.length; i++)
         {
            arr[i] = sc.nextInt();
        }

        // Display array elements
        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }

        
    }
}