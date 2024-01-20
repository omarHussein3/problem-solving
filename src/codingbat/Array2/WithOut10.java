package codingbat.Array2;

public class WithOut10
{
    public static int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length];
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 10) {
            } else {
                result[j] = nums[i];
                j++;
            }
        }

        for(int i = j; i < nums.length; i++) {
            result[i] = 0;
        }
        return result;
    }
    public static void main(String[] args)
    {
        System.out.println(withoutTen(new int []{1, 10, 10, 2}));
        System.out.println(withoutTen(new int[]{10, 2, 10}));
        System.out.println(withoutTen(new int[]{1, 99, 10}));

    }
}
