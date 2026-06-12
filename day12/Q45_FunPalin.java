import java.util.Scanner;

public class Q45_FunPalin {
    public static boolean isPalindrome(int num) {
        if (num < 0) return false; 
        
        int org = num;
        int rev= 0;
        
        while (num > 0) {
            int digit = num % 10;
            rev = (rev * 10) + digit;
            num /= 10;
        }
        
        return org == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer to check for Palindrome: ");
        
    
            int Num = sc.nextInt();
            if (isPalindrome(Num)== true) 
            {
                System.out.println(Num + " is a palindrome number.");
            } else 
            {
                System.out.println(Num + " is NOT a palindrome number.");
            }
       
        
    }
}
