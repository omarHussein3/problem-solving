package codingbat.Array1;

public class Reverse3
{
    public static int[] reverse3(int[] nums) {
        int[] a = new int[3];
        for (int i = nums.length-1, j = 0; j < nums.length; i--, j++){
            a[j]=nums[i];
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(reverse3(new int[]{1, 2, 3}));
        System.out.println(reverse3(new int[]{5, 11, 9}));
        System.out.println(reverse3(new int[]{7, 0, 0}));

    }
}
