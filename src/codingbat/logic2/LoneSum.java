package codingbat.logic2;

public class LoneSum
{
    public static int loneSum(int a, int b, int c) {
        if ( a == b && b == c)
            return 0;
        if (a == b)
            return c;
        if (b == c)
            return a;
        if (a == c)
            return b;
        else
            return a + b + c;
    }
    public static void main(String[] args)
    {
        System.out.println(loneSum(1, 2, 3));
        System.out.println(loneSum(3, 2, 3));
        System.out.println(loneSum(3, 3, 3));

    }
}
