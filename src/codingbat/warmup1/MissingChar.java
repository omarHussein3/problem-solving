package codingbat.warmup1;

public class MissingChar
{
    public static String missingChar(String str, int n)
    {
    String pt1 = str.substring(0,n);
    String pt2 = str.substring(n+1 , str.length());
    return pt1 + pt2 ;
    }
    public static void main(String[] args)
    {
        System.out.println(missingChar("kitten", 1));
        System.out.println(missingChar("kitten", 0));
        System.out.println(missingChar("kitten", 4));    }
}
