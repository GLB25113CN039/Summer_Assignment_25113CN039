import java.util.Scanner;

public class Q87_countFreqStr 
{
    public static void main(String[] args)
     {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] ch = str.toCharArray();
        boolean[] visited = new boolean[ch.length];

        for (int i = 0; i < ch.length; i++) 
        {

            if (visited[i])
                continue;

            int count = 1;

            for (int j = i + 1; j < ch.length; j++) 
            {

                if (ch[i] == ch[j]) 
                {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(ch[i] + " = " + count);
        }

        
    }
}