package DSA.algos.Binary_search;

import java.util.Arrays;

//leetcode 34
public class findFirstLastPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 25;
        //int[] answer=searchRange(nums,target);
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        ans[0]=search(nums,target,true);
        if (ans[0] != -1){
            ans[1] = search(nums,target,false);
        }
        return ans;
    }

    static int search(int[] nums,int target,boolean findStartIndex){
        int ans=-1;

        int start =0;
        int end= nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;

            if (target<nums[mid]){
                end=mid-1;
            } else if (target>nums[mid]) {
                start=mid+1;
            }else {
                ans=mid;
                if (findStartIndex ==true){
                    end=end-1;
                }else {
                    start =start +1;
                }
            }
        }
        return ans;
    }
}












/*

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    private int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int first = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                first = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return first;
    }

    private int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int last = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                last = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return last;
    }
}*/
