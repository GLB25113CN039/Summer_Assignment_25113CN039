import java.util.Scanner;

public class Q114_ArrayOperations 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int choice;

        do {
            System.out.println("\n--- Array Menu ---");
            System.out.println("1. Display Array");
            System.out.println("2. Sum of Elements");
            System.out.println("3. Largest Element");
            System.out.println("4. Smallest Element");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Array Elements:");
                    for (int i = 0; i < n; i++)
                        System.out.print(arr[i] + " ");
                    System.out.println();
                    break;

                case 2:
                    int sum = 0;
                    for (int i = 0; i < n; i++)
                        sum += arr[i];
                    System.out.println("Sum = " + sum);
                    break;

                case 3:
                    int max = arr[0];
                    for (int i = 1; i < n; i++)
                        if (arr[i] > max)
                            max = arr[i];
                    System.out.println("Largest = " + max);
                    break;

                case 4:
                    int min = arr[0];
                    for (int i = 1; i < n; i++)
                        if (arr[i] < min)
                            min = arr[i];
                    System.out.println("Smallest = " + min);
                    break;

                case 5:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);

       
    }
}