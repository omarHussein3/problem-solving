package codingbat.Array2;

public class Has77
{
    public static boolean has77(int[] nums) {
        for(int i = 0; i<nums.length-1;i++)
        {
            if(nums[i]==7 && (nums[i+1]==7 || (i<nums.length-2&&nums[i+2]==7))) return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        System.out.println(has77(new int []{1, 7, 7}));
        System.out.println(has77(new int[]{1, 7, 1, 7}));
        System.out.println(has77(new int[]{1, 7, 1, 1, 7}));

    }
}
