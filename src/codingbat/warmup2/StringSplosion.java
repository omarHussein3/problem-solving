package codingbat.warmup2;

public class StringSplosion
{
    public static String stringSplosion(String str)
    {
        String T = "";
        int L = str.length();
        for (int i=0; i< L; i++) {
            T = T + str.substring(0, i+1);
        }
        return T;
    }
    public static void main(String[] args)
    {
        System.out.println(stringSplosion("Code"));
        System.out.println(stringSplosion("abc"));
        System.out.println(stringSplosion("ab"));

    }
}
