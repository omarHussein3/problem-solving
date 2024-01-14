package codingbat.logic2;

public class NoTeenSum
{
    public static int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }
    public static int fixTeen(int n) {
        if ( (n >=13 && n < 15) || (n > 16 && n <= 19) )
            return 0;
        else
            return n;
    }
    public static void main(String[] args)
    {
        System.out.println(noTeenSum(1, 2, 3));
        System.out.println(noTeenSum(2, 13, 1));
        System.out.println(noTeenSum(2, 1, 14));

    }
}
