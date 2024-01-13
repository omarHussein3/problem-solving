package codingbat.Array1;

import java.util.Arrays;

public class Has23
{
    public static boolean has23(int[] nums)
    {
        for (int i = 0; i < nums.length ; i++)
        {
            if (nums[i] == 2 || nums[i] == 3)
            {
                return true;
            }


        }
            return false;
    }

    public static void main(String[] args)
    {
        System.out.println(has23(new int[]{2, 5}));
        System.out.println(has23(new int[]{4, 3}));
        System.out.println(has23(new int[]{4, 5}));
    }
    }

