package codingbat.Array1;

import java.util.Arrays;

public class BiggerTwo
{
    public static int[] biggerTwo(int[] a, int[] b) {
        int A = a[0] + a[1];
        int B = b[0] + b[1];

        if (A == B)
            return a;
        else if (A > B)
            return a;
        else
            return b;


    }
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(biggerTwo(new int[]{1, 2, 3}, new int[]{4, 5, 6})));
        System.out.println(Arrays.toString(biggerTwo(new int[]{7, 7, 7}, new int[]{3, 8, 0})));
        System.out.println(Arrays.toString(biggerTwo(new int[]{5, 2, 9}, new int[]{1, 4, 5})));
    }
}
