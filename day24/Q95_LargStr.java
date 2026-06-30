import java.util.Scanner;

public class Q95_LargStr 
{
    public static void main(String[] args)
     {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        String largest = words[0];

        for (int i = 1; i < words.length; i++) 
        {

            if (words[i].length() > largest.length()) 
            {
                largest = words[i];
            }
        }

        System.out.println("Largest Word: " + largest);

        
    }
}