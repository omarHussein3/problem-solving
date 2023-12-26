package codingbat.string1;

public class WithouEnd2
{
    public static String withouEnd2(String str) {
        int l = str.length();
        if (l < 3)
        return "";
  else
        return str.substring(1,str.length()-1);
    }
    public static void main(String[] args)
    {
        System.out.println(withouEnd2("Hello"));
        System.out.println(withouEnd2("java"));
        System.out.println(withouEnd2("sama"));

    }
}
