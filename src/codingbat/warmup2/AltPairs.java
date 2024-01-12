package codingbat.warmup2;

public  class AltPairs
{
    public static String altPairs(String str)
    {
       String T1 = str.substring(0 ,1) ;
       String T2 = str.substring(4 ,5);
       String T3 = str.substring(8 ,9);
  return T1 + T2 + T3;
    }
    public static void main(String[] args)
    {
        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));
    }
}
