package codingbat.string1;

public class Ntwice
{
    public static String nTwice(String str, int n) {
        return str.substring(0,n) + str.substring(str.length()- n, str.length());
    }
    public static void main(String[] args)
    {
        System.out.println(nTwice("hello", 2));
                System.out.println(nTwice("Chocolate", 3));
        System.out.println(nTwice("Chocolate", 1));

    }
}
