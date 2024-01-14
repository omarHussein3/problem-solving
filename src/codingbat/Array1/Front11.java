package codingbat.Array1;

import java.util.Arrays;

public class Front11
{
    public static int[] front11(int[] a, int[] b)
    {
        if (a.length == 0 && b.length == 0)
        {
            return a;
        }

        if (a.length == 0)
        {
            int[] x = new int[] {b[0]};
            return x;
        }


        if (b.length == 0)
        {
            int[] x = new int[] {a[0]};
            return x;
        }


        int[] x = new int[] {a[0], b[0]};
        return x;
    }

    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(front11(new int[]{1, 2, 3},new int[]{7, 9, 8})));
        System.out.println(Arrays.toString(front11(new int[]{1},new int[]{2})));
        System.out.println(Arrays.toString(front11(new int[]{1,7},new int[]{})));
    }
}
