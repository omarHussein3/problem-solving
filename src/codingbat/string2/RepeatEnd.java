package codingbat.string2;

public class RepeatEnd
{
    public static String repeatEnd(String str, int n)
    {
        int len = str.length();
        String x = "";

        for (int i = 0; i < n; i++)
        {
            x += str.substring(len - n, len);
        }
        return x;
    }
    public static void main(String[] args)
    {
        System.out.println(repeatEnd("Hello", 3));
        System.out.println(repeatEnd("Hello", 2));
        System.out.println(repeatEnd("Hello", 1));

    }

}
