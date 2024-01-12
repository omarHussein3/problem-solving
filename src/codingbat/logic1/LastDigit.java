package codingbat.logic1;

public class LastDigit
{
    public static boolean lastDigit(int a, int b, int c)
    {
        int modA = a % 10;
        int modB = b % 10;
        int modC = c % 10;

        if (modA == modB || modA == modC || modB == modC)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        System.out.println(lastDigit(23, 19, 13));
        System.out.println(lastDigit(23, 19, 12));
        System.out.println(lastDigit(23, 19, 3));
    }
}

