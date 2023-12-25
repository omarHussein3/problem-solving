package codingbat.string1;

public class HelloName
{
    public static String helloName(String name)
    {
        return "hello" + name;
    }
    public static void main(String[] args) {
        System.out.println(helloName("Bob"));
        System.out.println(helloName("alice"));
        System.out.println(helloName("x"));
    }
}
