package codingbat.string1;

public class SeeColor
{
    public static String seeColor(String str) {
        if (str.startsWith("red"))
            return "red";
        if (str.startsWith("blue"))
            return "blue";
        else
            return "";
    }
    public static void main(String[] args)
    {
        System.out.println(seeColor("bluexxx"));
        System.out.println(seeColor("redxx"));
        System.out.println(seeColor("nansnredas"));

    }
}
