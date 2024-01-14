package codingbat.Array1;

import java.util.Arrays;

public class MaxTriple
{
    public static int maxTriple(int[] nums)
    {
        int x = Math.max(nums[0], nums[nums.length / 2]);
        x = Math.max(x, nums[nums.length-1]);
        return x;
    }
    public static void main(String[] args)
    {
        System.out.println(maxTriple(new int[]{1, 2, 3}));
        System.out.println(maxTriple(new int[]{1, 5, 3}));
        System.out.println(maxTriple(new int[]{5, 2, 3}));

    }
}
