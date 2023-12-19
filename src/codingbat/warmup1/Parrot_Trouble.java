package codingbat.warmup1;

public class Parrot_Trouble
{
    public static boolean parrotTrouble(boolean talking, int hour)
    {
        return (talking &&(7 > hour || 20 < hour));
    }
    public static void main(String[] args) {
        System.out.println(parrotTrouble(true , 6));
        System.out.println(parrotTrouble(true , 7));
        System.out.println(parrotTrouble(false , 6));
    }
}
