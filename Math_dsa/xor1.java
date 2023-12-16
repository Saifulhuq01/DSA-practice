package DSA.algos.Math_dsa;

import java.util.Arrays;

public class xor1 {
    public static void main(String[] args) {
        int[] nums={2,3,4,1,2,1,3,6,4};
        int[] ans= new int[]{xor(nums)};
        System.out.println(Arrays.toString(ans));
    }

    static int xor(int[] nums) {
        int check=0;
        for (int i = 0; i < nums.length; i++) {
             check = check ^ nums[i];
        }
    return check;
    }
}
