package codingbat.Array2;

public class IsEveryWhere
{
    public static boolean isEverywhere(int[] nums, int val)
    {
        boolean result = true;
        for (int i = 0; i <=nums.length-2;i++)
        {
            if ( nums[i] != val && nums[i+1] != val)
                result = false;
        }
        return result;
    }
    public static void main(String[] args)
    {
        System.out.println(isEverywhere(new int []{1, 2, 1, 3}, 1));
        System.out.println(isEverywhere(new int []{1, 2, 1, 3}, 2));
        System.out.println(isEverywhere(new int []{1, 2, 1, 3, 4}, 1));

    }

}
