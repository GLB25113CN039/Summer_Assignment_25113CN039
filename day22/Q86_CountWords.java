import java.util.Scanner;

public class Q86_CountWords{
    public static void main(String[] args)
     {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Sentence: ");
        String sentence = sc.nextLine().trim();

        if (sentence.length() == 0) {
            System.out.println("Number of Words = 0");
        } else {
            String words[] = sentence.split("\\s+");
            System.out.println("Number of Words = " + words.length);
        }

        
    }
}
          