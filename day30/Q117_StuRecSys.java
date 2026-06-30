import java.util.Scanner;

public class Q117_StuRecSys
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String name[] = new String[n];
        int marks[] = new int[n];

        for (int i = 0; i < n; i++)
         {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("\n----- Student Records -----");
        for (int i = 0; i < n; i++) 
        {
            System.out.println("Name : " + name[i]);
            System.out.println("Marks: " + marks[i]);
            System.out.println();
        }

        
    }
}