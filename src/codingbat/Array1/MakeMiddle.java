package codingbat.Array1;

import java.util.Arrays;

public class MakeMiddle
{
    public static int[] makeMiddle(int[] nums) {
        int[] myArray = new int[2];
        int middle = nums.length / 2;

        myArray[0] = nums[middle - 1];
        myArray[1] = nums[middle];

        return myArray;
    }
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(makeMiddle(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(makeMiddle(new int[]{7, 1, 2, 3, 4, 9})));
        System.out.println(Arrays.toString(makeMiddle(new int[]{1, 2})));

    }

}
