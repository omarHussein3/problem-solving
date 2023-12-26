package codingbat.string1;

public class Right2
{
    public static String right2(String str) {

        return str.substring(str.length()-2,str.length()) + str.substring(0,str.length()-2);

    }
    public static void main(String[] args)
    {
        System.out.println(right2("Hello"));
        System.out.println(right2("java"));
        System.out.println(right2("hix"));

    }
}
