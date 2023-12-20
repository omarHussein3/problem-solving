package codingbat.warmup1;

public class Front3
{

    public  static String front3(String str)
    {
        String pt1;
        if (str.length() >= 3) {
            pt1 = str.substring(0, 3);
        }
        else {
            pt1 = str;
        }

        return pt1 + pt1 + pt1;
    }
    public static void main(String[] args)
    {
        System.out.println(front3("java"));
        System.out.println(front3("chocolate"));
        System.out.println(front3("abc"));
    }

}
