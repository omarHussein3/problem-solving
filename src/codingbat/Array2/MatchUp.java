package codingbat.Array2;

import java.util.Arrays;

public class MatchUp
{
    public static int matchUp(int[] nums1, int[] nums2)
    {
        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            int x = Math.abs(nums1[i] - nums2[i]);
            if (x <= 2 && x > 0)
                count++;
        }
        return count;
    }
    public static void main(String[] args)
    {
        System.out.println(matchUp(new int[]{1, 2, 3},new int[]{2, 3, 10}));
        System.out.println(matchUp(new int[]{1, 2, 3},new int[]{2, 3, 5}));
        System.out.println(matchUp(new int[]{1, 2, 3},new int[]{2, 3, 3}));
    }
}
