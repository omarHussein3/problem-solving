package codingbat.string2;

public class CountCode
{
    public static int countCode(String str) {
        int result = 0;
        for (int i = 0; i <= str.length()-4 ; i++) {
            if (str.substring(i,i+4).matches("co[a-z]e"))
            {
                result++;

            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        System.out.println(countCode("aaacodebbb"));
        System.out.println(countCode("codexxcode"));
        System.out.println(countCode("cozexxcope"));

    }
}
