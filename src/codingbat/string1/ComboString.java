package codingbat.string1;

public class ComboString
{
    public static String comboString(String a, String b) {
        int lena = a.length();
        int lenb = b.length();
        if (lena > lenb)
        return b+a+b;
  else

        return a+b+a;

    }
    public static void main(String[] args) {
        System.out.println(comboString("Hello", "hi"));
        System.out.println(comboString("hi", "Hello"));
        System.out.println(comboString("aaa", "b"));
    }

}
