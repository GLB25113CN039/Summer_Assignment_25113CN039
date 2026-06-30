import java.util.Scanner;

public class Q91_IsAnagrams 
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String str1 = sc.nextLine().toLowerCase();

        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine().toLowerCase();

        if (str1.length() != str2.length()) 
        {
            System.out.println("Not Anagrams");
            return;
        }

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        // Bubble Sort
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++)
            {

                if (a[j] > a[j + 1]) 
                {
                    char temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }

                if (b[j] > b[j + 1]) 
                {
                    char temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                }
            }
        }

        boolean flag = true;

        for (int i = 0; i < a.length; i++) 
        {
            if (a[i] != b[i]) {
                flag = false;
                break;
            }
        }

        if (flag)
            System.out.println("Strings are Anagrams.");
        else
            System.out.println("Strings are Not Anagrams.");

        
    }
}