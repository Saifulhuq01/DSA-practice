package DSA.algos;
//leetcode 26
public class remove_duplicate {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,5,5};
        System.out.println(remove(arr));
    }
    static int remove(int[] arr){
        int k=0;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]!=arr[k]){
                k++;
                arr[k]=arr[i];
            }
        }
        return k+1;
    }
}
