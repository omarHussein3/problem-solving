package codingbat.warmup2;

public class StringX
{
    public static String stringX(String str) {
        String T = "";

        for (int i=0; i<str.length(); i++) {
            if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
                T = T + str.substring(i, i+1);
            }
        }
        return T;
    }
    public static void main(String[] args) {
        System.out.println(stringX("xxcaazz"));
        System.out.println(stringX("abc"));
        System.out.println(stringX("abc"));

    }

}
