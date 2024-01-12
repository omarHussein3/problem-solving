package codingbat.logic1;

public class RedTicket {

    public static int redTicket(int a, int b, int c) {
        if (a == b && b == c) {
            if (a == 2) return 10;
            else return 5;
        } else if (b != a && c != a) return 1;
        else return 0;

    }
    public static void main(String[] args)
    {
        System.out.println(redTicket(2, 2, 2));
        System.out.println(redTicket(2, 2, 1));
        System.out.println(redTicket(0, 0, 0));

    }

}
