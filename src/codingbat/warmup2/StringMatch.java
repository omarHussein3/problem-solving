package codingbat.warmup2;

public class StringMatch
{
    public static int stringMatch(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int count = 0;

        for (int i=0; i<len-1; i++) {
            String aa = a.substring(i, i+2);
            String bb = b.substring(i, i+2);
            if (aa.equals(bb)) {
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
