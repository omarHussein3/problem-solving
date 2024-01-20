package codingbat.Array2;

public class BigDiff
{
    public static int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < nums.length; i++){
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        return max-min;

    }
    public static void main(String[] args)
    {
        System.out.println(bigDiff(new int []{10, 3, 5, 6}));
        System.out.println(bigDiff(new int[]{7, 2, 10, 9}));
        System.out.println(bigDiff(new int []{2, 10, 7, 2}));
    }
}
