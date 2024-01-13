package codingbat.Array1;

public class RotateLeft3
{
    public static int[] rotateLeft3(int[] nums) {
        int[] myArray = new int[3];

        myArray[0] = nums[1];
        myArray[1] = nums[2];
        myArray[2] = nums[0];
        return myArray;
    }
    public static void main(String[] args) {
        System.out.println(rotateLeft3(new int[]{1, 2, 3}));
        System.out.println(rotateLeft3(new int[]{5, 11, 9}));
        System.out.println(rotateLeft3(new int[]{7, 0, 0}));

    }

}
