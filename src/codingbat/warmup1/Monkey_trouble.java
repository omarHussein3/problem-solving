package codingbat.warmup1;

public class Monkey_trouble
{
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile)
    {
        return (aSmile == true && bSmile == true) || (aSmile == false && bSmile == false);
    }
    public static void main(String[] args) {
        System.out.println(monkeyTrouble(true, true));
        System.out.println(monkeyTrouble(false, false));
        System.out.println(monkeyTrouble(true, false));
    }
}

