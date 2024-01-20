package codingbat.Array2;

public class Post4
{
    public static int[] post4(int[] nums) {
        int len = nums.length -1;
        int index = 0;
        for(int i=nums.length - 1; i >= 0;i--)
        {
            if(nums[i] == 4)
            {
                index = i;
                break;
            }
        }
        int[] arr = new int[len-index];
        for(int i = index+1, j=0; i < nums.length; i++, j++)
        {
            arr[j] = nums[i];
        }
        return arr;
    }
    public static void main(String[] args)
    {
        System.out.println(post4(new int []{2, 4, 1, 2}));
        System.out.println(post4(new int[]{4, 1, 4, 2}));
        System.out.println(post4(new int[]{4, 4, 1, 2, 3}));

    }
}
