package codingbat.warmup2;

public class FrontTimes
{
    public static String frontTimes(String str, int n) {
        int frntl = 3;
        if (frntl > str.length())
        {
            frntl = str.length();
        }
        String frnt = str.substring(0, frntl);

        String result = "";
        for (int i=0; i<n; i++) {
            result = result + frnt;
        }
        return result;
    }
    public static void main(String[] args)
    {
        System.out.println(frontTimes("chocoalte", 2));
        System.out.println(frontTimes("chocoalte", 1));
        System.out.println(frontTimes("abc", 3));

    }
}
