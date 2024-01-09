package codingbat.logic1;

public class In1to10
{
    public static boolean in1To10(int n, boolean outsideMode) {
        if ( outsideMode == false && n >= 1 && n <= 10 )
            return true;
        if ( outsideMode == true && ( n <= 1 || n >= 10 ) )
            return true;
        else return false;
    }
    public static void main(String[] args) {
        System.out.println(in1To10(5, false));
        System.out.println(in1To10(11, false));
        System.out.println(in1To10(11, true));

    }
}
