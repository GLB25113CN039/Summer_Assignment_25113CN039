import java.util.Scanner;

public class Q89_FirstNonRepeatedChar
 {

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        char[] ch = str.toCharArray();

        boolean found = false;

        for (int i = 0; i < ch.length; i++) 
        {

            int count = 0;

            for (int j = 0; j < ch.length; j++) 
            {

                if (ch[i] == ch[j]) 
                {
                    count++;
                }
            }

            if (count == 1)
             {
                System.out.println("First Non-Repeated Character = " + ch[i]);
                found = true;
                break;
            }
        }

        if (!found) 
        {
            System.out.println("No Non-Repeated Character Found.");
        }

        
    }
}