package codingbat.Array1;

import java.util.Arrays;

public class MidThree
{
    public static int[] midThree(int[] nums) {
        int[] x = new int[3];

        x[0] = nums[nums.length / 2-1];
        x[1] = nums[nums.length / 2];
        x[2] = nums[nums.length / 2+1];
        return x;

    }
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(midThree(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(midThree(new int[]{8, 6, 7, 5, 3, 0, 9})));
        System.out.println(Arrays.toString(midThree(new int[]{1, 2, 3})));

    }
}
