package codingbat.Array2;

public class EvenOdd
{
    public static int[] evenOdd(int[] nums) {
        int start = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
                start++;
            }
        }
        return nums;
    }
    public static void main(String[] args)
    {
        System.out.println(evenOdd(new int []{1, 0, 1, 0, 0, 1, 1}));
        System.out.println(evenOdd(new int[]{3, 3, 2}));
        System.out.println(evenOdd(new int[]{2, 2, 2}));

    }
}
