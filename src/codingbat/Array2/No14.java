package codingbat.Array2;

public class No14
{
    public static boolean no14(int[] nums) {
        boolean ones=false;
        boolean fours=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) ones=true;
            else if(nums[i]==4)fours=true;
        };
        return !(fours&&ones);
    }
    public static void main(String[] args)
    {
        System.out.println(no14(new int []{1, 2, 3}));
        System.out.println(no14(new int[]{1, 2, 3, 4}));
        System.out.println(no14(new int[]{2, 3, 4}));

    }
}
