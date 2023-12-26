package codingbat.string1;

public class WithOut2
{
    public static String without2(String str) {
        int len = str.length();
        if (len == 2)
            return "";
        if (len < 2)
            return str;
        else {
            if (str.substring(0,2).equals(str.substring(len-2, len)))
                return str.substring(2,len);
            else return str;

        }
    }
    public static void main(String[] args)
    {
        System.out.println(without2("hellohe"));
        System.out.println(without2("javaja"));
        System.out.println(without2("h"));

    }
}
