/* Floyd Triangle 
1
2 3 
4 5 6 
7 8 9 10
11 12 13 14 15 
*/
import java.util.Scanner;

class FloydTriangle
{
    public static void main(String args[])
    {
        int n, num = 1, c, d;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows of floyd's triangle : ");
        n = in.nextInt();

        System.out.println("Floyd's triangle :-");

        for (c = 1; c <= n; c++)
        {
            for (d = 1; d <= c; d++)
            {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }
    }
}
