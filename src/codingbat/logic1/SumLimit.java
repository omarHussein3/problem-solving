package codingbat.logic1;

public class SumLimit
{
    public static int sumLimit(int a, int b) {
        String aString = String.valueOf(a);
        int aLen = aString.length();
        String sumString = String.valueOf(a+b);
        int sumLen = sumString.length();

        if (sumLen == aLen)
            return a + b;
        else
            return a;

    }
    public static void main(String[] args)
    {
        System.out.println(sumLimit(2, 3));
        System.out.println(sumLimit(8, 3));
        System.out.println(sumLimit(8, 1));

    }
}
