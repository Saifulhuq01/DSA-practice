package DSA.algos.Binary_search;

public class rotatecounts {
    public static void main(String[] args) {
        int[] arr={6,7,1,2,3,4,5};
        System.out.println(count(arr));
    }
    static int count(int[] arr){
        int pivot=findpivot(arr);
        if (pivot==-1){
            return 0;
        }
        return pivot+1;
    }
    static int findpivot(int[] arr){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid=start+(end- start)/2;
            if (mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (start<mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if (arr[mid]<=arr[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
