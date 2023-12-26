package codingbat.string1;

public class NonStart
{
    public static String nonStart(String a, String b)
    {
        return a.substring(1) + b.substring(1);
    }
    public static void main(String[] args)
    {

     System.out.println(nonStart("Hello", "hi"));
        System.out.println(nonStart("hi", "Hello"));
        System.out.println(nonStart("aaa", "bc"));

    }

}
