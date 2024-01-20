package codingbat.Array2;

public class ModThree
{
    public static boolean modThree(int[] nums) {
        int odd = 0;
        int even = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even++;
                if (odd < 3) odd = 0;
            }
            else {
                odd++;
                if (even < 3) even = 0;
            }
        }
        return (odd == 3 || even == 3);
    }
    public static void main(String[] args)
    {
        System.out.println(modThree(new int []{2, 1, 3, 5}));
        System.out.println(modThree(new int[]{2, 1, 2, 5}));
        System.out.println(modThree(new int[]{2, 4, 2, 5}));

    }
}
