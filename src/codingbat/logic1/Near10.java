package codingbat.logic1;

public class Near10
{
    public static boolean nearTen(int num) {
        return num % 10 <= 2 || 10 - num % 10 <= 2;
    }
    public static void main(String[] args)
    {
        System.out.println(nearTen(12));
        System.out.println(nearTen(17));
        System.out.println(nearTen(19));

    }

}
