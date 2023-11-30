package DSA.practice;

import java.util.Arrays;

//1389. Create Target Array in the Given Order
public class CreateTargetArrayinGivenOrder {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        int[] target=new int[index.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = target.length - 1; j > index[i] ; j--) {
                target[j]=target[j-1];
            }
            target[index[i]] = nums[i];
        }
        return target;


       /* ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            a.add(index[i],nums[i]);
        }
        int target[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            target[i] = a.get(i);
        }
        return target;*/
    }
}
