package codingbat.string2;

public class MixString
{
    public static String mixString(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        int max = Math.max(aLen, bLen);
        String word = "";

        for (int i = 0; i < max; i++) {
            if (i <= aLen-1)
                word += a.substring(i,i+1);
            if (i <= bLen-1)
                word += b.substring(i,i+1);

        }
        return word;
    }
    public static void main(String[] args)
    {
        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There"));
        System.out.println(mixString("xxxx", "There"));

    }
}
