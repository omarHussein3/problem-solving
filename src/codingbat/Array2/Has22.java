package codingbat.Array2;

public class Has22
{
    public static boolean has22(int[] nums) {
        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 && i > 0 && nums[i-1] == 2) {
                found = true;
            }
            if (nums[i] == 2 && i < nums.length-1 && nums[i+1] == 2) {
                found = true;
            }
        }
        return found;
    }
    public static void main(String[] args)
    {
        System.out.println(has22(new int []{1, 2, 2}));
        System.out.println(has22(new int[]{1, 2, 1, 2}));
        System.out.println(has22(new int[]{2, 1, 2}));

    }
}
