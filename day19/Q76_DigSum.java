import java.util.Scanner;

public class Q76_DigSum
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter Matrix:");

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            primarySum += matrix[i][i];
            secondarySum += matrix[i][n - 1 - i];
        }

        System.out.println("Primary Diagonal Sum = " + primarySum);
        System.out.println("Secondary Diagonal Sum = " + secondarySum);

        
    }
}