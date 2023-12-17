package codingbat.warmup1;

public class SleepIn {

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return weekday == false || vacation == true;


    }

    public static void main(String[] args) {
        System.out.println(sleepIn(false, false));
        System.out.println(sleepIn(true, false));
        System.out.println(sleepIn(false, true));
    }
}
