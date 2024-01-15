package codingbat.string2;

public class RepeatFront
{
    public static String repeatFront(String str, int n) {
        int len = str.length();
        String newWord = "";

        for (int i = n; n > 0; n--){
            newWord += str.substring(0,n);
        }
        return newWord;
    }
    public static void main(String[] args)
    {
        System.out.println(repeatFront("Chocolate", 4));
        System.out.println(repeatFront("Chocolate", 3));
        System.out.println(repeatFront("Ice Cream", 2));

    }
}
