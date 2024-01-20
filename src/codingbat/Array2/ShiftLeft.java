package codingbat.Array2;

public class ShiftLeft
{
    public static int[] shiftLeft(int[] nums) {
        int len = nums.length;
        int temp = 0;
        for(int i=0; i<len-1; i++){
            temp = nums[i];
            nums[i]= nums[i+1];
            nums[i+1] = temp;
        }
        return nums;
    }
    public static void main(String[] args)
    {
        System.out.println(shiftLeft(new int []{6, 2, 5, 3}));
        System.out.println(shiftLeft(new int[]{1, 2}));
        System.out.println(shiftLeft(new int[]{1}));

    }
}
