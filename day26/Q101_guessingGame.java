import java.util.Scanner;

public class Q101_guessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secretNumber = 25;
        int guess;

        do {
            System.out.print("Guess the number (1-50): ");
            guess = sc.nextInt();

            if (guess > secretNumber) {
                System.out.println("Too High!");
            } else if (guess < secretNumber) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Congratulations! Correct Guess.");
            }

        } while (guess != secretNumber);

       
    }
}