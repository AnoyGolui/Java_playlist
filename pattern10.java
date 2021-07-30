/*Number pattern 10.


1 
121 
12321 
1234321 
123454321 
12345654321 
1234567654321
*/
import java.util.*;

class Pattern
{
    public static void main(String[] args)
    {
        int i, j, k = 1, l, n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of levels of pattern");
        n = sc.nextInt();

        System.out.println("\nPattern is : \n");

        for (i = 1; i <= n; i++)
        {
            l = i;

            for (j = 1; j <= k; j++)
            {
                if (j >= i + 1)
                {
                    System.out.print(--l);
                }

                else
                {
                    System.out.print(j);
                }
            }

            k = k + 2;
            System.out.println(" ");
        }
    }
}
