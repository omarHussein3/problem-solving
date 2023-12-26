package codingbat.string1;

public class MinCat
{
    public static String minCat(String a, String b) {
        if (a.length() == b.length())
            return a+b;
        if (a.length() > b.length()){
            int diff = a.length() - b.length();
            return a.substring(diff, a.length()) + b;

        } else {
            int diff = b.length() - a.length();
            return a + b.substring(diff, b.length());
        }
    }
    public static void main(String[] args)
    {
        System.out.println(minCat("Hello", "Hi"));
        System.out.println(minCat("Hello", "java"));
        System.out.println(minCat("java", "Hello"));

    }
}
