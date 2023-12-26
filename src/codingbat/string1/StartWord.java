package codingbat.string1;

public class StartWord
{
    public static String startWord(String str, String word) {
        int lStr = str.length();
        int lWrd = word.length();
        if (lStr == 0)
            return "";
        if (lWrd > lStr)
            return "";

        if (word.length() == 1)
            return str.substring(0,1);
        else if (str.substring(1,lWrd).equals(word.substring(1,lWrd)))
            return str.substring(0,lWrd);
        else
            return "";
    }
    public static void main(String[] args)
    {
        System.out.println(startWord("hippo", "hi"));
        System.out.println(startWord("hippo", "xip"));
        System.out.println(startWord("hippo", "i"));

    }
}
