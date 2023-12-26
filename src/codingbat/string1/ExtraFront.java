package codingbat.string1;

public class ExtraFront
{
    public static String extraFront(String str) {
        if (str.length() < 2)
            return str + str + str;
        else {
            String newString = str.substring(0,2);
            return newString + newString + newString;
        }
    }
    public static void main(String[] args)
    {
        System.out.println(extraFront("Hello");
        System.out.println(extraFront("java"));
        System.out.println(extraFront("h"));

    }
}
