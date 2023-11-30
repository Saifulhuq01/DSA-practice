package DSA.algos.sorting.Bubble;

import java.util.Arrays;

public class sample_sorting {
    public static void main(String[] args) {
        int[] nums={5,4,3,2,1};
        bubble(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void bubble(int[] nums){
        boolean swap;
        for (int i = 0; i < nums.length; i++) {
            swap = false;
            for (int j = 1; j <nums.length-i ; j++) {
                if (nums[j] < nums[j-1]) {
                    int temp = nums[j];
                    nums[j]= nums[j-1];
                    nums[j-1] = temp;
                    swap = true;
                }
            }
            if (swap == false){
                break;
            }
        }

    }
}
