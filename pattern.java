/*Number pattern 3.

12345
1234
123
12
1
*/

class NumberPat3
{

    public static void main(String arg[])
    {

        for (int i = 1, r = 5; i <= 5; i++, r--)
        {

            for (int j = 1; j <= r; j++)
            {

                System.out.print(j);

            }

            System.out.println();
        }
    }
}
