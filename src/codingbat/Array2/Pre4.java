package codingbat.Array2;

public class Pre4
{
    public static int[] pre4(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 4 && i > 0) {
                int[] foo;
                foo = new int[i];
                for (int j = 0; j < foo.length; j++) {
                    foo[j] = nums[j];

                }
                if (nums[0] != 4)
                    return foo;
            }
        }
        int[] bar;
        bar = new int[0];
        return bar;
    }
    public static void main(String[] args)
    {
        System.out.println(pre4(new int []{1, 2, 4, 1}));
        System.out.println(pre4(new int[]{3, 1, 4}));
        System.out.println(pre4(new int[]{1, 4, 4}));

    }
}
