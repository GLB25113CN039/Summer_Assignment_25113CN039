import java.util.Scanner;

public class Q59_RotRight 
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

       
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        System.out.print("Enter the number of right rotations: ");
        int d = sc.nextInt();

        d = d % n; 
        for (int r = 0; r < d; r++)
         {
            int last = arr[n - 1];

            for (int i = n - 1; i > 0; i--) 
            {
                arr[i] = arr[i - 1];
            }

            arr[0] = last;
        }

        
        System.out.println("Array after right rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

       
    }
}