package codingbat.Array1;

public class Double23
{
    public static boolean double23(int[] nums) {
        if (nums.length < 2)
            return false;
        if ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3))
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        System.out.println(double23(new int[]{2, 2}));
        System.out.println(double23(new int[]{3, 3}));
        System.out.println(double23(new int[]{2, 3}));
    }
}
