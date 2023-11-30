package DSA.algos.Binary_search;

public class orderAgnosticBS {
    public static void main(String[] args) {
       // int[] arr={-14,-6,-1,1,2,5,6,9,10,33,57,89};  //ascending
        int[]arr={99,89,79,69,59,48,23,11};  //decending
        int target=59;
        int ans=orderAgnosticBS(arr,target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[]arr,int target){
        int start=0;
        int end=arr.length-1;

        //wheather the array is sorted in ascending or descending
        boolean isAscen;
        if (arr[start]<arr[end]){
            isAscen= true;
        }else{
            isAscen= false;
        }

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(isAscen){
                if(target<arr[mid]){
                    end=mid-1;
                } else {
                    start=mid+1;
                }
            }else{
                if (target>arr[mid]){
                    end=mid-1;
                } else {
                    start=mid+1;
                }
            }


        }
        return -1;
    }
}
