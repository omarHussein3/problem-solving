package codingbat.string1;

public class MiddleTwo
{
    public static String middleTwo(String str) {
        int hlf = str.length() / 2;
        return str.substring(hlf-1,hlf+1);
    }
    public static void main(String[] args)
    {
        System.out.println(middleTwo("Hello"));
        System.out.println(middleTwo("java"));
        System.out.println(middleTwo("sama"));

    }

}
