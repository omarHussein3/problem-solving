package codingbat.Array2;

public class FizzArray
{
    public static int[] fizzArray(int n)
    {
        int[] result = new int[n];

        for (int i = 0; i < n; i++)

            result[i] = i;

        return result;
    }
    public static void main(String[] args)
    {
        System.out.println(fizzArray(4));
        System.out.println(fizzArray(1));
        System.out.println(fizzArray(10));

    }
}
