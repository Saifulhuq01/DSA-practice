package DSA.algos.Binary_search;

public class ceilingOfTheNumber {
    public static void main(String[] args) {
        int[] num={2,3,5,9,14,16,18};
        int target=15;
        int ans=ceil(num,target);
        System.out.println(ans);
    }

    //return index smalled number >= target
    static int ceil(int[] num,int target){
        //but what if the target is greater than the greatest number in the array\
        if (target>num[num.length-1]){
            return -1;
        }
        int start=0;
        int end= num.length-1;
        boolean isAsce;
            if (num[start] < num[end]) {
                isAsce= true;
            } else {
                isAsce= false;
            }

        while(start<=end){
            int mid=start+(end-start)/2;

            if(num[mid]==target){
                return mid;
            }

            if(isAsce){
                if(target<num[mid]){
                    end=mid-1;
                } else {
                    start=mid+1;
                }
            }else{
                if (target>num[mid]){
                    end=mid-1;
                } else {
                    start=mid+1;
                }
            }
        }
        return start;
    }
}
