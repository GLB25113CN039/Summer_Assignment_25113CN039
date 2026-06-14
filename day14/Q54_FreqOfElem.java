import java.util.Scanner;

public class Q54_FreqOfElem
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
        System.out.print("Enter the element: ");
        int ele = sc.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == ele) {
                count++;
            }
        }

        System.out.println("Frequency of " + ele + " = " + count);

    }
}