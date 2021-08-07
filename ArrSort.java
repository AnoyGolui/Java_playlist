//Array Sort.

import java.util.Arrays;

class ArraySort
{
    // This program is the example of  array sorting
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        // initializing unsorted  array
        String iArr[] = {"Programming", "Hub", "Alice", "Wonder", "Land"};

        // sorting array
        Arrays.sort(iArr);

        // let us print all the elements available in list
        System.out.println("The sorted array is:");
        for (int i = 0; i < iArr.length; i++)
        {
            System.out.println(iArr[i]);
        }
    }
}
