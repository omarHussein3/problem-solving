package codingbat.warmup2;

public class CountXX
{
    public static int countXX(String str)
    {
        {
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i+2).equals("xx"))
                count++;
        }
        return count;
    }
    }
    public static void main(String[] args)
    {
        System.out.println(countXX("x"));
        System.out.println(countXX("choxxxx"));
        System.out.println(countXX("xxx"));

    }

}
