package codingbat.Array1;

public class No23 {
    public static boolean no23(int[] nums)
    {
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 2 || nums[i] == 3)
            {
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args)
    {
        System.out.println(no23(new int[]{4, 5}));
        System.out.println(no23(new int[]{4, 2}));
        System.out.println(no23(new int[]{3, 5}));
    }

}

