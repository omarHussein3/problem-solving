package codingbat.warmup2;

public class StringTimes
{
    public static String stringTimes(String str, int n) {
        String result = "";
        for (int i=0; i<n; i++) {
            result = result + str;
        }
        return result;
    }
    public static void main(String[] args)
    {
        System.out.println(stringTimes("Hi", 2));
        System.out.println(stringTimes("Hi", 1));
        System.out.println(stringTimes("Hi", 3));

    }
}
