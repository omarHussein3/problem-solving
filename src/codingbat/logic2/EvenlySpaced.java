package codingbat.logic2;

import java.util.Arrays;

public class EvenlySpaced
{
    public static boolean evenlySpaced(int a, int b, int c) {
        int[] anArray = {a, b, c};
        Arrays.sort(anArray);

        int low = anArray[1] - anArray[0];
        int high = anArray[2] - anArray[1];

        if (high == low)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        System.out.println(evenlySpaced(2, 4, 6));
        System.out.println(evenlySpaced(4, 6, 2));
        System.out.println(evenlySpaced(4, 6, 3));

    }
}
