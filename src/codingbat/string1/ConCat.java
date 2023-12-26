package codingbat.string1;

public class ConCat
{
    public static String conCat(String a, String b) {
        if (a.length() == 0 || b.length() == 0)
            return a+b;

        if ((a.substring(a.length() - 1, a.length())).equals(b.substring(0,1)))
            return a + b.substring(1,b.length());

        else
            return a+b;
    }
    public static void main(String[] args)
    {
        System.out.println(conCat("abc", "cat"));
        System.out.println(conCat("hi", "hello"));
        System.out.println(conCat("yo", "so"));

    }
}
