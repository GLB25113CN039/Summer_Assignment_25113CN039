import java.util.Scanner;

public class Q60_Zero
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

        int in= 0;

        for (int i = 0; i < n; i++) 
        {
            if (arr[i] != 0) {
                arr[in] = arr[i];
                in++;
            }
        }

        // Fill remaining positions with zeroes
        while (in < n) {
            arr[in] = 0;
            in++;
        }

        // Display result
        System.out.println("Array after moving zeroes to the end:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

       
    }
}