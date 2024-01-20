package codingbat.Array2;

public class Either24
{
    public static boolean either24(int[] nums) {
        boolean f4s =false;
        boolean t2s =false;

        for(int i=0;i<=nums.length-2;i++){
            if(nums[i]==2 && nums[i+1]==2){
                t2s=true;
            }
            else if(nums[i]==4 && nums[i+1]==4){
                f4s=true;
            }
        }

        if(f4s && t2s){
            return false;
        }
        if(!f4s && !t2s){
            return false;
        }

        else return true;

    }
    public static void main(String[] args)
    {
        System.out.println(either24(new int []{1, 2, 2}));
        System.out.println(either24(new int[]{4, 4, 1}));
        System.out.println(either24(new int[]{4, 4, 1, 2, 2}));

    }
}
