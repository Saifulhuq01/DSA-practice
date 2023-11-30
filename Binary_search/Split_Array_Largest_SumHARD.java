package DSA.algos.Binary_search;
//leetcode 410. Split Array Largest Sum
public class Split_Array_Largest_SumHARD {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int m=2;
        int ans=splitArray(nums,m);
        System.out.println(ans);
    }
    static int splitArray(int[] nums, int m) {
        int start=0;
        int end=0;
        for (int i = 0; i < nums.length; i++) {
            // in the end of the loop this will contain the max item from the array
            start=Math.max(start,nums[i]);
            end = end+nums[i];
        }
        //binary search
        while(start<end){
            //try for the middle as potential answer
            int mid=start+(end-start)/2;

            //calculate how many pieces you can divide this in with this max sum
            int sum=0;
            int pieces=1;
            for (int i = 0; i < nums.length; i++) {
                int num = nums[i];
                if (sum+num > mid){
                    //you cannot add this in this subarray,make new one
                    //say you add this num in new subarray, then sum=new
                    sum=num;
                    pieces++;
                }else{
                    sum = sum+num;
                }
            }
            if (pieces > m){
                start=mid+1;
            }else{
                end = mid;
            }
        }
        return end;//here start == end
    }
}
