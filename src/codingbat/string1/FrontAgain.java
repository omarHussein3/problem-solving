package codingbat.string1;

public class FrontAgain
{
    public static boolean frontAgain(String str) {
        if (str.length() < 2)
            return false;
        else if (str.substring(0,2).equals(str.substring(str.length()-2, str.length())))
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        System.out.println(frontAgain("bobbo"));
        System.out.println(frontAgain("edited"));
        System.out.println(frontAgain("hii"));

    }
}
