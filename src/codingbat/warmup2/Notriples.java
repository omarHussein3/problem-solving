package codingbat.warmup2;

public class Notriples
{
    public static boolean noTriples(int[] nums)
    {

        for (int i=0; i < (nums.length-2); i++)
        {
            int x = nums[i];
            if (nums[i+1]==x && nums[i+2]==x)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(noTriples(new int[]{1, 1, 2, 2, 1}));
        System.out.println(noTriples(new int[]{1, 1, 2, 2, 2, 1}));
        System.out.println(noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}));

    }
}
