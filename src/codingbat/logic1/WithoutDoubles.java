package codingbat.logic1;

public class WithoutDoubles {
    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {


        if (noDoubles) {
            if (die1 == 6)
                die1 = 1;
            else if (die1 == die2)
                die1 += 1;
        }
        return die1 + die2;
    }
    public static void main(String[] args)
    {
        System.out.println(withoutDoubles(2, 3, true));
        System.out.println(withoutDoubles(3, 3, true));
        System.out.println(withoutDoubles(3, 3, false));

    }

}
