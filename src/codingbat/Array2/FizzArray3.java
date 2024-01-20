package codingbat.Array2;

public class FizzArray3
{
    public static int[] fizzArray3(int start, int end) {
        int n = end - start;
        int[] result = new int[n];

        for (int i = 0; i < n; i++)
            result[i] = start++;
        return result;
    }
    public static void main(String[] args)
    {
        System.out.println(fizzArray3(5, 10));
        System.out.println(fizzArray3(11, 18));
        System.out.println(fizzArray3(1, 3));

    }
}
