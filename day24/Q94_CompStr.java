import java.util.Scanner;

public class Q94_CompStr {
    public static void main(String[] args)
     {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String result = "";

        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result = result + str.charAt(i) + count;
                count = 1;
            }
        }

        System.out.println("Compressed String: " + result);

        sc.close();
    }
}

