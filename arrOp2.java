//Array Sum and Average.

import java.io.*;

class ArrayAverage
{
    public static void main(String[] args)
    {
        //define an array
        int[] numbers = new int[]{10, 20, 15, 25, 16, 60, 100};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            sum = sum + numbers[i];
        }

        double average = sum / numbers.length;
        System.out.println("Sum of array elements is : " + sum);
        System.out.println("Average value of array elements is : " + average);
    }
}
 
