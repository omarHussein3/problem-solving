package codingbat.Array1;

import java.util.Arrays;

public class Start1
{
    public static int start1(int[] a, int[] b)
    {
        int count = 0;
        if (a.length > 0 && a[0] == 1)
            count++;
        if (b.length > 0 && b[0] ==1)
            count++;
        return count;

    }
    public static void main(String[] args)
    {
        System.out.println(start1(new int[]{1, 2, 3},new int[]{4, 5, 6}));
        System.out.println(start1(new int[]{7, 7, 7},new int[]{3, 8, 0}));
        System.out.println(start1(new int[]{5, 2, 9},new int[]{1, 4, 5}));
    }
}
