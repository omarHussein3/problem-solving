package codingbat.Array2;

public class TenRun
{
    public static int[] tenRun(int[] nums) {
        boolean ten = false;
        int tmp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                tmp = nums[i];
                ten = true;
            }
            else if (nums[i] % 10 != 0 && ten) {
                nums[i] = tmp;
            }
        }
        return nums;
    }
    public static void main(String[] args)
    {
        System.out.println(tenRun(new int []{2, 10, 3, 4, 20, 5}));
        System.out.println(tenRun(new int[]{10, 1, 20, 2}));
        System.out.println(tenRun(new int[]{10, 1, 9, 20}));

    }
}
