package codingbat.string2;

public class DoubleChar2
{
    public static String doubleChar(String str)
    {
        String x = "";
        for (int i = 0; i < str.length(); i++)
        {
            x += str.charAt(i) + str.substring(i, i+1);
        }
        return x;
    }
    public static void main(String[] args)
    {
        System.out.println(doubleChar("The"));
        System.out.println(doubleChar("AAbb"));
        System.out.println(doubleChar("Hi-There"));

    }
}
