package codingbat.warmup1;

public class MixStart
{
    public static boolean mixStart(String str) {

        if (str.length() < 3)
        {
            return false;
        }


        String trgt = str.substring(1, 3);

        if (trgt.equals("ix")) {
            return true;
        } else {
            return false;
        }

    }
    public static void main(String[] args)
    {
        System.out.println(mixStart("pix"));
        System.out.println(mixStart("piz snak"));
        System.out.println(mixStart("mix snack"));
    }
}
