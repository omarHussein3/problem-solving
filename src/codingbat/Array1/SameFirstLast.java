package codingbat.Array1;

public class SameFirstLast
{
    public static boolean sameFirstLast(int[] nums) {
        if (nums.length >= 1 && nums[0] == nums[nums.length-1])
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(sameFirstLast(new int[]{1, 2, 3}));
        System.out.println(sameFirstLast(new int[]{1, 2, 3, 1}));
        System.out.println(sameFirstLast(new int[]{1, 2, 1}));

    }
}
