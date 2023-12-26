package codingbat.string1;

public class LastTwo
{
    public static String lastTwo(String str) {
        if (str.length() < 2)
            return str;
        else
            return str.substring(0, str.length()-2) + str.charAt(str.length()-1) + str.charAt(str.length()-2);
    }
    public static void main(String[] args)
    {
        System.out.println(lastTwo("abc"));
        System.out.println(lastTwo("hi"));
        System.out.println(lastTwo("ses"));

    }
}
