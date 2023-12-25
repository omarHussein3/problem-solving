package codingbat.string1;

public class FirstHalf
{
    public static String firstHalf(String str) {

        int half = str.length() / 2;

        return str.substring(0, half);
    }
    public static void main(String[] args) {
        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("abcdef"));
    }
}
