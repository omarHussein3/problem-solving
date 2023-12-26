package codingbat.string1;

public class LastChars
{
    public static String lastChars(String a, String b) {
        if(a.length() == 0)
        a = "@";
        if(b.length() == 0)
        b = "@";
        return a.substring(0,1) + b.substring(b.length()-1, b.length());
    }

    public static void main(String[] args)
    {
        System.out.println(lastChars("last", "chars"));
        System.out.println(lastChars("yo", "java"));
        System.out.println(lastChars("hi", ""));

    }
}
