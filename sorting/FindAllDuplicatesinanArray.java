package DSA.algos.sorting;
//442. Find All Duplicates in an Array
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatesinanArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        findDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }
    static List<Integer> findDuplicates(int[] nums){
        int i=0;
        while(i< nums.length){
            int correct = nums[i] -1   ;
            if (nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!=j+1){
                ans.add(nums[j]);
            }
        }return ans;
    }


    static void swap(int[]nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j]=temp;
    }
}
