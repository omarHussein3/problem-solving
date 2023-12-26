package codingbat.string1;

public class DeFront
{
    public static String deFront(String str) {
        String result = str.substring(2,str.length());
        if (str.charAt(1)=='b') result = "b" + result;
        if (str.charAt(0)=='a') result = "a" + result;
        return result;

    }
    public static void main(String[] args)
    {
        System.out.println(deFront("Hello"));
        System.out.println(deFront("java"));
        System.out.println(deFront("away"));

    }
}
