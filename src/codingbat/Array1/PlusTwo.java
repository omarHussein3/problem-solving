package codingbat.Array1;
import java.util.Arrays;

public class PlusTwo
{
    public static int[] plusTwo(int[] a, int[] b)
    {
    int[] x = new int[a.length + b.length];
    int index = 0;

for (int item: a) {
    x[index++] = item;
}
for (int item: b) {
    x[index++] = item;
}

return x;

}
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(plusTwo(new int[]{1, 2},new int[]{3, 4})));
        System.out.println(Arrays.toString(plusTwo(new int[]{4, 4},new int[]{2,2})));
        System.out.println(Arrays.toString(plusTwo(new int[]{9, 2},new int[]{3,4})));
    }

}
