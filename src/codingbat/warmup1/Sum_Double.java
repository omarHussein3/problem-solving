package codingbat.warmup1;

public class Sum_Double
{
    public static int sumDouble(int a, int b)
    {
        int sum = a + b;
        if(a == b)
        {
         sum =  sum*2;

        }
        return sum ;
    }
    public static void main(String[] args) {
        System.out.println(sumDouble(1,2));
        System.out.println(sumDouble(2,3));
        System.out.println(sumDouble(2,2));
    }
}

