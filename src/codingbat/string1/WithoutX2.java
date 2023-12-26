package codingbat.string1;

public class WithoutX2
{
    public static String withoutX2(String str) {
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && str.charAt(i) != 'x')
                temp += str.charAt(i);
            else if (i == 1 && str.charAt(i) != 'x')
                temp += str.charAt(i);
            else if (i > 1)
                temp += str.charAt(i);
        }

        return temp;
    }
    public static void main(String[] args)
    {
        System.out.println(withoutX2("hxi"));
        System.out.println(withoutX2("xip"));
        System.out.println(withoutX2("xhi"));

    }
}
