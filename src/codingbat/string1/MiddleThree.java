package codingbat.string1;

public class MiddleThree
{
    public static String middleThree(String str)
    {
        int ln = str.length() / 2;
        return str.substring(ln-1,ln+2);
    }
    public static void main(String[] args)
    {
        System.out.println(middleThree("candy"));
        System.out.println(middleThree("and"));
        System.out.println(middleThree("solving"));

    }
}
