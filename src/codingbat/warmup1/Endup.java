package codingbat.warmup1;

public class Endup
{
    public static String endUp(String str) {
        if (str.length() <= 3) return str.toUpperCase();
        int x = str.length() - 3;
        String pt1 = str.substring(0, x);
        String pt2  = str.substring(x);

        return pt1 + pt2.toUpperCase();
    }
    public static void main(String[] args) {
        System.out.println(endUp("hello"));
        System.out.println(endUp("heelle"));
        System.out.println(endUp("heelele"));
    }
}
