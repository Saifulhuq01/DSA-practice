package DSA.algos;

public class linear_search {
    public static void main(String[] args) {
        int[] arr = {11,33,55,78,2,65,-3,-9,5,3,24};
        int target = 333;
        int ans=linear(arr, target);
        System.out.println(ans);
    }
    static int linear(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int elememt = arr[i];
            if(elememt==target){
                return i;
            }
        }
        return -1;
    }
}
