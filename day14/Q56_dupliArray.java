import java.util.Scanner;

public class Q56_dupliArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++)
         {
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicate elements are:");

        boolean f= false;

        for (int i = 0; i < n; i++)
         {
            for (int j = i + 1; j < n; j++)
             {
                if (arr[i] == arr[j]) 
                {
                    System.out.println(arr[i]);
                    f = true;
                    break;
                }
            }
        }

        if (f == false) {
            System.out.println("No duplicate elements found.");
        }

    
    }
}