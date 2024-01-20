package codingbat.Array2;

public class Has12
{
    public static boolean has12(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == 1){
                for(int j = i+1; j<nums.length; j++){
                    if(nums[j] == 2) return true;
                }
            }
        }

        return false;
    }
    public static void main(String[] args)
    {
        System.out.println(has12(new int []{1, 3, 2}));
        System.out.println(has12(new int[]{3, 1, 2}));
        System.out.println(has12(new int[]{3, 1, 4, 5, 2}));

    }
}
