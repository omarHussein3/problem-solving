package codingbat.logic1;

public class ShareDigit
{
    public static  boolean shareDigit(int a, int b) {
        int aL = a / 10;
        int aR = a % 10;
        int bL = b / 10;
        int bR = b % 10;

        if (aL == bL || aL == bR || aR == bL || aR == bR)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        System.out.println(shareDigit(12, 23));
        System.out.println(shareDigit(12, 43));
        System.out.println(shareDigit(12, 44));

    }
}
