/*Number pattern 9.

             1 
          1 2 1 
       1 2 3 2 1 
   1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1
*/
class PrintPattern
{
    public static void main(String args[])
    {
        int n = 5;
        for (int i = 1; i <= n; i++)
        {
            int j = n - i;
            while (j > 0)
            {
                System.out.print("  ");
                j--;
            }

            j = 1;
            while (j <= i)
            {
                System.out.print(" " + j);
                j++;
            }

            j = i - 1;
            while (j > 0)
            {
                System.out.print(" " + j);
                j--;
            }

            j = n - i;
            while (j > 0)
            {
                System.out.print("  ");
                j--;
            }
            System.out.println();
        }
    }
}
