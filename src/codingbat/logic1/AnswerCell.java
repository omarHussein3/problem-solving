package codingbat.logic1;

public class AnswerCell
{
    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep)
            return false;
        if ((isMorning && isMom) || !isMorning)
            return true;
        else return false;
    }
    public static void main(String[] args)
    {
        System.out.println(answerCell(false, false, false));
        System.out.println(answerCell(false, false, true));
        System.out.println(answerCell(true, false, false));

    }
}
