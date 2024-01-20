package codingbat.Array2;

import java.util.Arrays;

public class CountEvens
{
    public static int countEvens(int[] nums)
    {
        int even = 0;

        for (int count = 0; count < nums.length; count++)
        {
            if (nums[count] % 2 == 0)
                even++;
        }

        return even;

    }
    public static void main(String[] args)
    {
        System.out.println(countEvens(new int []{2, 1, 2, 3, 4}));
        System.out.println(countEvens(new int[]{2, 2, 0}));
        System.out.println(countEvens(new int []{1, 3, 5}));
    }
}
