package codingbat.Array2;

public class Sum67
{
    public static int sum67(int[] nums) {
        int sum = 0;
        boolean stop = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6)
                stop = true;
            if (stop == false)
                sum += nums[i];
            if (nums[i] == 7 && stop == true)
                stop = false;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println(sum67(new int []{1, 2, 2}));
        System.out.println(sum67(new int[]{1, 2, 2, 6, 99, 99, 7}));
        System.out.println(sum67(new int[]{1, 1, 6, 7, 2}));

    }
}
