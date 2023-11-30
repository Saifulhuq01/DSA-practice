package DSA.algos;

public class min_max {
    public static void main(String[] args) {
        int[] arr={22,33,5,1,54,7,2};
        System.out.println(min(arr));
        System.out.println(max(arr));

    }
    static int min(int[] arr){
        int ans=arr[0];
        for (int i = 0; i<arr.length ; i++) {
            if (arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }

    static int max(int[] arr){
        int ans=arr[0];
        for (int i = 0; i<arr.length ; i++) {
            if (arr[i]>ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
