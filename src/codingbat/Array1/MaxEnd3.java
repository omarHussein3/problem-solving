package codingbat.Array1;

import java.util.Arrays;

public class MaxEnd3
{
    public static int[] maxEnd3(int[] nums)
    {
        int max = Math.max(nums[0], nums[nums.length-1]);
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = max ;
        }
        return nums ;
    }
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(maxEnd3(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(maxEnd3(new int[]{11, 5, 9})));
        System.out.println(Arrays.toString(maxEnd3(new int[]{2, 11, 3})));

    }
}
