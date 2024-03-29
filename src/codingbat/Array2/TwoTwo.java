package codingbat.Array2;

public class TwoTwo
{
    public static boolean twoTwo(int[] nums) {
        boolean isTrue = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                if (nums.length > 1 && i < nums.length-1 && nums[i+1] == 2)
                    isTrue = true;
                else if (nums.length > 1 && i > 0 && nums[i-1] == 2)
                    isTrue = true;
                else
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        System.out.println(twoTwo(new int []{4, 2, 2, 3}));
        System.out.println(twoTwo(new int[]{2, 2, 4}));
        System.out.println(twoTwo(new int[]{2, 2, 4, 2}));

    }
}
