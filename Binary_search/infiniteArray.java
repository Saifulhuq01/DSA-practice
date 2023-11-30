package DSA.algos.Binary_search;
// geeks for geeks https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class infiniteArray {
    public static void main(String[] args) {
        int[] nums ={3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target=130;
        System.out.println(ans(nums,target));
    }

    //sai let us know how its work its just based on 2 thinks
    // 1.we don't know whats is the length of array so lets us consider on take first two index and move to multiple of first two index with *2 like an next move on other 4 index if find answer exit orelse move or other index like before multiple by 2.
    // 2.finally we need a formula on line 25th.
    static int ans(int[]nums,int target){
        //first find the range
        //first start with a box of size 2
        int start =0;
        int end=1;

        //condition for the target to lie in the range
        while(target>nums[end]){
            int temp = end+1; //this is my new start
            //double the box value
            //end=previous end +sizeOfBox +1;
            end= end + (end - start +1) * 2; // formula pattern
            start= temp;
        }
        return binarySearch(nums,target,start,end);

    }
    static int binarySearch(int[] nums,int target,int start,int end){

        while(start<=end){
            int mid = start+(end-start)/2;

            if (target<nums[mid]){
                end=mid-1;
            } else if (target>nums[mid]) {
                start=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
