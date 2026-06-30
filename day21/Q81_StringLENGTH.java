import java.util.Scanner;

public class Q81_StringLENGTH 
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] ch = str.toCharArray();

        int count = 0;

       for (int i = 0; i < ch.length; i++) 
        {
          char c = ch[i];
            count++;
       }
        System.out.println("Length of String = " + count);

        
    }
}
    