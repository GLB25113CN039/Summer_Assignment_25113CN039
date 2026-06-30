import java.util.Scanner;

public class Q99_SortNames
 {
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Names: ");
        int n = sc.nextInt();
        sc.nextLine();

        String names[] = new String[n];

        System.out.println("Enter Names:");

        for (int i = 0; i < n; i++)
            names[i] = sc.nextLine();

        for (int i = 0; i < n - 1; i++)
         {
            for (int j = i + 1; j < n; j++) 
            {
                if (names[i].compareToIgnoreCase(names[j]) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        System.out.println("\nNames in Alphabetical Order:");

        for (int i = 0; i < n; i++)
            System.out.println(names[i]);

       
    }
}