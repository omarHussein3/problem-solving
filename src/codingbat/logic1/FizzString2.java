package codingbat.logic1;

public class FizzString2
{
    public static String fizzString2(int n)
    {
        boolean fizz = n % 3 == 0;
        boolean buzz = n % 5 == 0;

        if (fizz && buzz) return "FizzBuzz!";
        if (fizz) return "Fizz!";
        if (buzz) return "Buzz!";
        return n + "!";
    }
    public static void main(String[] args)
    {
        System.out.println(fizzString2(1));
        System.out.println(fizzString2(2));
        System.out.println(fizzString2(3));

    }
}
