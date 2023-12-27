package codingbat.warmup2;

public class ArrayFront9
{
    public boolean arrayFront9(int[] nums) {
        int end = nums.length;
        if (end > 4) end = 4;

        for (int i=0; i<end; i++) {
            if (nums[i] == 9) return true;
        }

        return false;
    }
    public static void main(String[] args)
    {
        System.out.print(arrayFront9([1, 2, 9]));
        System.out.println(arrayFront9([1, 2, 9]));
        System.out.println(arrayFront9([9,9, 2, 9]));

    }
}
