package codingbat.logic1;

public class AlarmClock
{
    public static String alarmClock(int day, boolean vacation) {
        if ( vacation == true && ( day == 0 || day == 6 ) )
            return "off";
        if ( vacation == true && ( day == 1 || day == 2 || day == 3 || day == 4 || day == 5 ) )
            return "10:00";
        if ( vacation == false && ( day == 0 || day == 6 ) )
            return "10:00";
        else return "7:00";
    }
    public static void main(String[] args) {
        System.out.println(alarmClock(1, false));
        System.out.println(alarmClock(5, false));
        System.out.println(alarmClock(0, false));

    }
}
