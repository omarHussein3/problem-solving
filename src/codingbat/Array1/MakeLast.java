package codingbat.Array1;

import java.util.Arrays;

public class MakeLast
{
    public static int[] makeLast(int[] nums)
    {
        int[] x = new int[2*nums.length];
        x[x.length-1] = nums[nums.length-1];
        return x;
    }
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(makeLast(new int[]{4, 5, 6})));
        System.out.println(Arrays.toString(makeLast(new int[]{1, 2})));
        System.out.println(Arrays.toString(makeLast(new int[]{3})));
    }
}
