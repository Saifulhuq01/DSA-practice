package DSA.algos.sorting;

import java.util.Arrays;

//217. Contains Duplicate
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(containsDuplicate(nums));
    } 
    static boolean containsDuplicate(int[] nums) {
        //not prepare this
        for (int i = 0; i < nums.length; i++){
            int current = nums[i];
            int j = i-1;
            while (j>=0 && current<nums[j]){
                nums[j+1] = nums[j];
                j--;
            }
            if(j>=0  && nums[j]==current){
                return true;
            }
            nums[j+1] = current;
        }
        return false;



        /*Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;*/



        //solution found but time limit exceeded;
        /*for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if (nums[j]==nums[i]){
                    return true;
                }
            }
        }
        return false;*/
    }
}
