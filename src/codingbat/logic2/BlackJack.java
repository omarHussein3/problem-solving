package codingbat.logic2;

public class BlackJack
{
    public static int blackjack(int a, int b)
    {
        if (a > 21 && b > 21)
        {
            return 0;
        }
        else if (a > 21)
        {
            return b;
        } else if
        (b > 21)
        {
            return a;
        }
        int A = 21 - a;
        int B = 21 - b;

        if (A > B) {
            return b;
        } else
        {
            return a;
        }

    }
    public static void main(String[] args)
    {
        System.out.println(blackjack(19, 21));
        System.out.println(blackjack(21, 19));
        System.out.println(blackjack(19, 22));

    }
}
