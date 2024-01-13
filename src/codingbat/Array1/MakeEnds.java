package codingbat.Array1;

import java.util.Arrays;

public class MakeEnds
{
    public static int[] makeEnds(int[] nums) {
        int[] x = new int[2];
        if (nums.length == 1) {
            x[0] = nums[0];
            x[1] = nums[0];
        } else {
            x[0] = nums[0];
            x[1] = nums[nums.length-1];
        }
        return x;
    }
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(makeEnds(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(makeEnds(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(makeEnds(new int[]{7, 4, 6, 2})));
    }
}
