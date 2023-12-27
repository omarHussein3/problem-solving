package codingbat.warmup2;

public class StringBits
{
    public static String stringBits(String str) {
        String result = "";

        for (int i=0; i<str.length(); i+=2) {

            result = result + str.substring(i, i+1);
        }
        return result;
    }
    public static void main(String[] args)
    {
        System.out.println(stringBits("hii"));
        System.out.println(stringBits("hello"));
        System.out.println(stringBits("heellooo"));

    }
}
