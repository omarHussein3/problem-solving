package codingbat.warmup2;

public class StringMatch
{
    public static int stringMatch(String a, String b) {
        int count = 0;
        int L = Math.min(a.length(), b.length());


        for (int i=0; i<L-1; i++) {
            String A = a.substring(i, i+2);
            String B = b.substring(i, i+2);
            if (A.equals(B)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(stringMatch("abc", "abc"));
        System.out.println(stringMatch("abc", "axc"));

    }
}
