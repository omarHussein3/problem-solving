package codingbat.string2;

public class BobThere
{
    public static boolean bobThere(String str) {

        for (int i = 0; i <= str.length()-3 ; i++) {
            if (str.substring(i,i+3).matches("b[a-z 0-9]b"))
            {
                return true;

            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        System.out.println(bobThere("abcbob"));
        System.out.println(bobThere("b9b"));
        System.out.println(bobThere("bac"));

    }
}
