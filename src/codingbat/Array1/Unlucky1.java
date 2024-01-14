package codingbat.Array1;

public class Unlucky1
{
    public static  boolean unlucky1(int[] nums)
    {
        for (int i = 0; i < nums.length-1; i++)
        {
            if (nums.length > 4 && i == 2)
            {
                i = nums.length-2;
            }

            if (nums[i] == 1 && nums[i+1] == 3)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        System.out.println(unlucky1(new int[]{1, 3, 4, 5}));
        System.out.println(unlucky1(new int[]{2, 1, 3, 4, 5}));
        System.out.println(unlucky1(new int[]{1, 1, 1}));

    }

}
