import java.util.Scanner;

public class Q75_Transpose 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter Matrix:");
        for (int i = 0; i < rows; i++)
         {
            for (int j = 0; j < cols; j++)
             {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose Matrix:");

        for (int j = 0; j < cols; j++) 
        {
            for (int i = 0; i < rows; i++)
             {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

       
    }
}