package codingbat.Array1;

import java.util.Arrays;

public class Make2
{
    public static int[] make2(int[] a, int[] b)
    {
        int[]x = new int [a.length + b.length];

        for(int i = 0 ; i < a.length ; i++ )
        {
            x[i] = a[i];
        }

        for( int i=0; i<b.length; i++)
        {
            x[a.length + i] = b[i];
        }

        int[]ab = {x[0], x[1]};
        return ab;
    }
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(make2(new int[]{1, 2, 3},new int[]{7, 9, 8})));
        System.out.println(Arrays.toString(make2(new int[]{1},new int[]{2})));
        System.out.println(Arrays.toString(make2(new int[]{1,7},new int[]{})));
    }
}
