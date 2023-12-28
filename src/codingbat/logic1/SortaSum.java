package codingbat.logic1;

public class SortaSum
{
    public static int sortaSum(int a, int b) {
        if ( a + b >= 10 && a + b <= 19 )
            return 20;
        else return ( a + b );
    }
    public static void main(String[] args) {
        System.out.println(sortaSum(3, 4));
        System.out.println(sortaSum(9, 4));
        System.out.println(sortaSum(10, 11));

    }
}
