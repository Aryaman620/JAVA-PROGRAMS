import java.util.Scanner;
public class UpperStar 
{
    public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) 
          {
            for (int j = 1; j <= i; j++) 
             {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
