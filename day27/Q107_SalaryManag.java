import java.util.Scanner;

public class Q107_SalaryManag 
{
    public static void main(String[] args)
     {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Employees: ");
        int n = sc.nextInt();

        String name[] = new String[n];
        double basic[] = new double[n];
        double total[] = new double[n];

        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("\nEnter Employee Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Basic Salary: ");
            basic[i] = sc.nextDouble();
            sc.nextLine();

            total[i] = basic[i] + (0.20 * basic[i]) + (0.10 * basic[i]);
        }

        System.out.println("\n----- Salary Details -----");

        for (int i = 0; i < n; i++) {
            System.out.println("Name         : " + name[i]);
            System.out.println("Basic Salary : " + basic[i]);
            System.out.println("Total Salary : " + total[i]);
            System.out.println();
        }

        
    }
}
       
