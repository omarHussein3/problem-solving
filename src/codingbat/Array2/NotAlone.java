package codingbat.Array2;

import java.util.Arrays;

public class NotAlone
{
    public static  int[] notAlone(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && i < nums.length-1 && nums[i] == val) {
                if (nums[i] != nums[i-1] && nums[i] != nums[i+1])
                    nums[i] = Math.max(nums[i-1], nums[i+1]);

            }
        }
        return nums;
    }
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(notAlone(new int[]{1, 2, 3}, 2)));
        System.out.println(Arrays.toString(notAlone(new int[]{1, 2, 3, 2, 5, 2}, 2)));
        System.out.println(Arrays.toString(notAlone(new int[]{3, 4}, 3)));

    }
}
