package codingbat.warmup2;

public class Arrayfront9
{
    public static boolean arrayFront9(int[] nums)
    {
        int len = nums.length;
        if (nums.length > 4) len = 4;

        for (int i=0; i<len; i++) {
            if (nums[i] == 9) return true;
        }

        return false;
    }
    public static void main(String[] args) {
            System.out.println(arrayFront9(new int[]{1, 2, 9, 3, 4}));
            System.out.println(arrayFront9(new int[]{1, 2, 3, 4, 9}));
            System.out.println(arrayFront9(new int[]{1, 2, 3, 4, 5}));

        }

    }

