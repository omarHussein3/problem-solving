package codingbat.warmup1;

public class StartHi
{
    public static boolean startHi(String str) {
        if (str.length() < 2)
        {
            return false;
        }

        String Two = str.substring(0, 2);

        return(Two.equals("hi"));

    }
    public static void main(String[] args)
    {
        System.out.println(startHi("hi"));
        System.out.println(startHi("hi there"));
        System.out.println(startHi("hello hi"));
    }
}
