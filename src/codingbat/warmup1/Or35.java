package codingbat.warmup1;

public class Or35
{
    public static boolean or35(int n)
    {
        return (n % 5 == 0) || (n % 3 == 0);
    }
    public static void main(String[] args)
    {
        System.out.println(or35(10));
        System.out.println(or35(3));
        System.out.println(or35(8));
    }
}
