package codingbat.string1;

public class EndsLy
{
    public static boolean endsLy(String str) {
        String ly = "ly";
        if (str.length() < 2)
        return false;
  else if (ly.equals(str.substring(str.length()-2,str.length())))
        return true;
  else
        return false;
    }
    public static void main(String[] args)
    {
        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("y"));
        System.out.println(endsLy("oddy"));

    }
}
