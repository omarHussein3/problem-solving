package codingbat.logic2;

public class CloseFar
{
    public static boolean closeFar(int a, int b, int c) {
        int x = 0, y = 0, z = 0;
        x = Math.abs(a-b);
        y = Math.abs(b-c);
        z = Math.abs(c-a);
        if(a==b||b==c||c==a)
        {
            return true;
        }
        if(x==y||y==z||x==z)
        {
            return false;
        }
        return true;

    }
    public static void main(String[] args)
    {
        System.out.println(closeFar(1, 2, 10));
        System.out.println(closeFar(1, 2, 3));
        System.out.println(closeFar(4, 1, 3));

    }

}
