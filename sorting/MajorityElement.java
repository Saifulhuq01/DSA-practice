package DSA.algos.sorting;
//169. Majority Element
import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,1,1,2,2};
        System.out.println(majorityElement(nums));

    }
    static int majorityElement(int[] nums) {
        int ans =nums[0];
        int val=1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==ans){
                val++;
            }else{
                val--;
            }

            if (val==0){
                ans=nums[i];
                val++;
            }
        }
        return ans;
    }
}
