package codingbat.logic2;

public class Logic2
{
    public static int luckySum(int a, int b, int c)
    {
        if (a == 13)
            return 0;
        else if (b == 13)
            return a;
        else if (c == 13)
            return a + b;
        else
            return a + b +c;
    }
    public static void main(String[] args)
    {
        System.out.println(luckySum(1, 2, 3));
        System.out.println(luckySum(1, 2, 13));
        System.out.println(luckySum(1, 13, 3));

    }
}
