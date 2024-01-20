package codingbat.Array2;

import java.util.Arrays;

public class FizzArray2
{
    public static String[] fizzArray2(int n)
    {
        String[] result = new String[n];
        for (int i = 0; i < n; i++)
            result[i] = String.valueOf(i);
        return result;
    }
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(fizzArray2(4)));
        System.out.println(Arrays.toString(fizzArray2(2)));
        System.out.println(Arrays.toString(fizzArray2(10)));

    }
}
