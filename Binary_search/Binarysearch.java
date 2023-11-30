package DSA.algos.Binary_search;

public class Binarysearch {
    public static void main(String[] args) {
        int[] arr={-14,-6,-1,1,2,5,6,9,10,33,57,89};
        int target=-148;
        int ans=binarysearch(arr,target);
        System.out.println(ans);
    }
    static int binarysearch(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {//direct ans
                return mid;
            }

        }
        return -1;
    }

}
