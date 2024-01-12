package codingbat.logic1;

public class TwoAsOne
{

    public static boolean twoAsOne(int a, int b, int c)
    {
        if ( a + b == c || c + b == a || c + a == b)
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        System.out.println(twoAsOne(1, 2, 3));
        System.out.println(twoAsOne(3, 1, 2));
        System.out.println(twoAsOne(3, 2, 2));

    }
}

