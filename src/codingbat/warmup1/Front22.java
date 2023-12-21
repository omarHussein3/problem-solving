package codingbat.warmup1;

public class Front22
{
    public static String front22(String str) {
        int two = 2;
        if (two > str.length())
        {
            two = str.length();
        }

        String pt1 = str.substring(0, two);
        return pt1 + str + pt1;
    }
    public static void main(String[] args)
    {
        System.out.println(front22("kitten"));
        System.out.println(front22("abc"));
        System.out.println(front22("ha"));
    }
}
