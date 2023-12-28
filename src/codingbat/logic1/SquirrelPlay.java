package codingbat.logic1;

public class SquirrelPlay {
    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if (temp >= 60 && temp <= 90)
            return true;
        if (temp >= 60 && temp <= 100 && isSummer == true)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(squirrelPlay(70, false));
        System.out.println(squirrelPlay(95, false));
        System.out.println(squirrelPlay(95, true));

    }
}
