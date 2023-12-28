package codingbat.logic1;

public class SortaSum
{
    public int sortaSum(int a, int b) {
        if ( a + b >= 10 && a + b <= 19 )
            return 20;
        else return ( a + b );
    }
    public static void main(String[] args) {
        System.out.println(caughtSpeeding(60, false));
        System.out.println(caughtSpeeding(65, false));
        System.out.println(caughtSpeeding(65, true));

    }
}
