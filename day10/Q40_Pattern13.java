public class Q40_Pattern13 {
    public static void main(String[] args) 
    {
        int rows = 5;
        
        for (int i = 1; i <= rows; i++) 
        {
            
            for (int j = 1; j <= rows - i; j++) 
            {
                System.out.print(" ");
            }
            
            char ch = 'A';
            
            for (int k = 1; k <= i; k++) 
            {
                System.out.print(ch);
                ch++;
            }
            
            ch = (char)(ch - 2); 
            
            
            for (int l = i - 1; l >= 1; l--) 
            {
                System.out.print(ch);
                ch--;
            }
            System.out.println();
        }
    }
}