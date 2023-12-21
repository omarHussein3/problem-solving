package codingbat.warmup1;

public class Backaround
{
    public static String backAround(String str) {
        String chr = str.substring(str.length() - 1);
        return chr + str + chr;
    }
    public static void main(String[] args)
    {
        System.out.println(backAround("cat"));
        System.out.println(backAround("a"));
        System.out.println(backAround("hello"));
    }
}
