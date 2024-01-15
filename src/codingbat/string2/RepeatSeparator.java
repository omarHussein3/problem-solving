package codingbat.string2;

public class RepeatSeparator
{
    public static String repeatSeparator(String word, String sep, int count)
    {
        String newWord = "";

        for (int i = 0; i < count; i++) {
            if (i < count-1)
                newWord += word + sep;
            else
                newWord += word;
        }
        return newWord;
    }
    public static void main(String[] args)
    {
        System.out.println(repeatSeparator("Word", "X", 3));
        System.out.println(repeatSeparator("This", "And", 2));
        System.out.println(repeatSeparator("This", "And", 1));

    }
}
