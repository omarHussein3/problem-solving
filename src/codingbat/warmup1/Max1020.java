package codingbat.warmup1;

public class Max1020
{
    public static int max1020(int a, int b)
    {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }
    public static void main(String[] args)
    {
        System.out.println(max1020(30,31));
        System.out.println(max1020(30,41));
        System.out.println(max1020(40,50));
    }
}
