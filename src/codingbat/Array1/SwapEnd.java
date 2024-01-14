package codingbat.Array1;

import java.util.Arrays;

public class SwapEnd
{
    public static int[] swapEnds(int[] nums) {
        int x = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = x;
        return nums;
    }
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(swapEnds(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(swapEnds(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(swapEnds(new int[]{8, 6, 7, 9, 5})));

    }
}
