package codingbat.Array2;
import java.util.Arrays;

public class CenteredAverage
{
    public static int centeredAverage(int[] nums) {
        int avg = 0;
        Arrays.sort(nums);

        for (int i = 1; i < nums.length-1; i++)
        {
            avg += nums[i];

        }
        return avg/(nums.length-2);

    }
    public static void main(String[] args)
    {
        System.out.println(centeredAverage(new int []{1, 2, 3, 4, 100}));
        System.out.println(centeredAverage(new int[]{1, 1, 5, 5, 10, 8, 7}));
        System.out.println(centeredAverage(new int[]{-10, -4, -2, -4, -2,0}));

    }
}
