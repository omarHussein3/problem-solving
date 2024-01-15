package codingbat.string2;

public class EndOther
{
    public static boolean endOther(String a, String b) {
        String A = a.toLowerCase();
        String B = b.toLowerCase();
        if (A.endsWith(B) || B.endsWith(A)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        System.out.println(endOther("Hiabc", "abc"));
        System.out.println(endOther("AbC", "HiaBc"));
        System.out.println(endOther("abc", "abXabc"));

    }
}
