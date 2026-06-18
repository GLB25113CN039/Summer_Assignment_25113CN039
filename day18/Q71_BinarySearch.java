import java.util.Scanner;

public class Q71_BinarySearch 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

       
        System.out.println("Enter the elements in sorted order:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        int low = 0, high = n - 1;
        int f = -1;

       
        while (low <= high) 
        {
            int mid = (low + high) / 2;

            if (arr[mid] == key)
             {
                f = mid;
                break;
            } 
            else if (arr[mid] < key) 
            {
                low = mid + 1;
            } 
            else 
            {
                high = mid - 1;
            }
        }

        if (f != -1) 
        {
            System.out.println("Element found at position: " + (f + 1));
        }
         else 
         {
            System.out.println("Element not found.");
        }

       
    }
}