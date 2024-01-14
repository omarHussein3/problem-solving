package codingbat.Array1;

import java.util.Arrays;

public class FirstPiece
{
    public static int[] frontPiece(int[] nums) {
        int[] myArray = new int[2];

        if (nums.length < 2)
            return nums;
        else {
            myArray[0] = nums[0];
            myArray[1] = nums[1];
            return myArray;
        }
    }
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(frontPiece(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(frontPiece(new int[]{1, 2})));
        System.out.println(Arrays.toString(frontPiece(new int[]{1})));

    }
}
