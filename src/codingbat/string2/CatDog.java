package codingbat.string2;

public class CatDog
{
    public static boolean catDog(String str) {
        int catcount = 0;
        int dogcount = 0;

        for(int i = 0; i < str.length()- 2; i++)
        {
            if(str.substring(i, i+3).equals("cat"))
            {
                catcount++;
            }

            if(str.substring(i, i+3).equals("dog"))
            {
                dogcount++;

            }
        }

        if(catcount == dogcount){
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        System.out.println(catDog("catdog"));
        System.out.println(catDog("catcat"));
        System.out.println(catDog("1cat1cadodog"));

    }
}
