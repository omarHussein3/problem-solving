package codingbat.warmup1;

public class StartOz
{
    public static String startOz(String str)
    {
        String temp = "";

        if (str.length() >= 1 && str.charAt(0)=='o')
        {
            temp = temp + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1)=='z')
        {
            temp = temp + str.charAt(1);
        }

        return temp;
    }
    public static void main(String[] args)
    {
        System.out.println(startOz("ozymandias"));
        System.out.println(startOz("bzoo"));
        System.out.println(startOz("oxx"));
    }
}
