package codingbat.Array2;

public class ZeroFront
{
    public static int[] zeroFront(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = nums[count];
                nums[count] = 0;
                count++;
            }
        }
        return nums;
    }
    public static void main(String[] args)
    {
        System.out.println(zeroFront(new int []{2, 1, 3, 5}));
        System.out.println(zeroFront(new int[]{2, 1, 2, 5}));
        System.out.println(zeroFront(new int[]{2, 4, 2, 5}));

    }
}
