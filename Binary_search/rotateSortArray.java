package DSA.algos.Binary_search;
//leetcode 33
public class rotateSortArray {
    public static void main(String[] args) {
        int[] nums={4,5,5,6,6,7,10,1,2};
        System.out.println(search(nums,0)+" search");
        System.out.println(findPivot(nums )+" find pivot");
        System.out.println(findPivotwithDuplicates(nums)+"with duplicates");
    }
    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        //if you are not found a pivot ,it means its not rottated so just do a normal binery search
        if (pivot == -1){
            return binarysearch(nums,target,0, nums.length-1);
        }
        //if a pivot found you have found 2 sasecending sorted array
        if (nums[pivot] == target){
            return pivot;
        }
        if (target>=nums[0]){
            return binarysearch(nums,target,0,pivot-1);
        }
        return binarysearch(nums,target,pivot +1, nums.length-1);
    }
    static int binarysearch(int[] nums,int target,int start,int end) {


        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {//direct ans
                return mid;
            }

        }
        return -1;
    }

    //this will not work for duplicate values
    static int findPivot(int[] nums){
        int start=0;
        int end= nums.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            //4 cases over here
            if (mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if (start<mid && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if (nums[mid]<= nums[start]){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return -1;
    }

    //this for duplicates in pivot
    static int findPivotwithDuplicates(int[] nums){
        int start=0;
        int end= nums.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            //4 cases over here
            if (mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if (start<mid && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            //if the elements at middle, satrt ,end are equal then just skip the duplicats
            if (nums[mid]==nums[start] && nums[mid]==nums[end]){
                //skip the duplicates
                //NOTE: what if these elements at start and end were the Pivot
                //check if the start is Pivot
                if (nums[start]>nums[start+1]){
                    return start;
                }
                start++;
                //check if the end is pivot
                if (nums[end]<nums[end-1]){
                    return end;
                }
                end--;
            }
            //left side is sorted, so pivot should be in right
            else if (nums[start]<nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start=mid +1;
            }else{
                end= mid-1;
            }
        }
        return -1;
    }
}
