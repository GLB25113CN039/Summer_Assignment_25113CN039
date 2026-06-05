import java.util.Scanner;

public class LargestPrimeFactor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long largestPrime = 1;

        for (long i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                largestPrime = i;
                n /= i;
            }
        }

        if (n > 1) {
            largestPrime = n;
        }

        System.out.println(largestPrime);

        sc.close();
    }
}