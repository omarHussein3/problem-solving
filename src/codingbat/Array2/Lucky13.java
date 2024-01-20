package codingbat.Array2;

public class Lucky13
{
    public static boolean lucky13(int[] nums) {
        boolean no13 = true;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3)
                no13 = false;
        }
        return no13;
    }
    public static void main(String[] args)
    {
        System.out.println(lucky13(new int []{0, 2, 4}));
        System.out.println(lucky13(new int[]{1, 2, 3}));
        System.out.println(lucky13(new int[]{1, 2, 4}));

    }
}
