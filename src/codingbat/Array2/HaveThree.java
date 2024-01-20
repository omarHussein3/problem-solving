package codingbat.Array2;

public class HaveThree
{
    public static boolean haveThree(int[] nums) {
        int three = 0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == 3 & nums[i+1] == 3) return false;
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 3) three++;
        }

        return three == 3;
    }
    public static void main(String[] args)
    {
        System.out.println(haveThree(new int []{3, 1, 3, 1, 3}));
        System.out.println(haveThree(new int[]{3, 1, 3, 3}));
        System.out.println(haveThree(new int[]{3, 1, 3, 3}));

    }
}
