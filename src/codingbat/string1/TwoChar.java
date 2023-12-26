package codingbat.string1;

public class TwoChar
{
    public static String twoChar(String str, int index) {
        if (str.length() <= index + 1 || index < 0)
        return str.substring(0,2);
  else
      return str.substring(index, index + 2);
    }
    public static void main(String[] args)
    {
        System.out.println(twoChar("java", 2));
        System.out.println(twoChar("java", 3));
        System.out.println(twoChar("java", 1));

    }
}
