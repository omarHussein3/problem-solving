package codingbat.string1;

public class ExtraEnd
{
    public static String extraEnd(String str)
    {
        if(str.length()<2)
        {
            return str;
        }
        String end = str.substring(str.length()-2,str.length());
        return end+end+end;
    }
    public static void main(String[] args) {
        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("ab"));
        System.out.println(extraEnd("h"));
    }
}
