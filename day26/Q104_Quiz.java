import java.util.Scanner;

public class Q104_Quiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;
        int answer;

        System.out.println("----- Java Quiz -----");

        System.out.println("\nQ1. Java was developed by?");
        System.out.println("1. Microsoft");
        System.out.println("2. Sun Microsystems");
        System.out.println("3. Google");
        System.out.println("4. Apple");
        answer = sc.nextInt();

        if (answer == 2)
            score++;

        System.out.println("\nQ2. Which keyword is used to create an object?");
        System.out.println("1. create");
        System.out.println("2. class");
        System.out.println("3. new");
        System.out.println("4. object");
        answer = sc.nextInt();

        if (answer == 3)
            score++;

        System.out.println("\nQ3. Java is a...");
        System.out.println("1. Programming Language");
        System.out.println("2. Operating System");
        System.out.println("3. Browser");
        System.out.println("4. Database");
        answer = sc.nextInt();

        if (answer == 1)
            score++;

        System.out.println("\nYour Score = " + score + "/3");

        if (score == 3)
            System.out.println("Excellent!");
        else if (score == 2)
            System.out.println("Good Job!");
        else
            System.out.println("Keep Practicing!");

       
    }
}
       