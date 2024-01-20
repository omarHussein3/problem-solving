package codingbat.Array2;

public class Only14
{
    public static boolean only14(int[] nums) {

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != 1 && nums[i] != 4)
                return   false;
        }
        return true;

    }
    public static void main(String[] args)
    {
        System.out.println(only14(new int []{1, 4, 1, 4}));
        System.out.println(only14(new int []{1, 4, 2, 4}));
        System.out.println(only14(new int []{1, 1}));

    }
}
