package DSA.algos.sorting.Insertion;

import java.util.Arrays;

public class insertionSample {
    public static void main(String[] args) {
        int[] num={5,4,3,2,1};
        insert(num);
        System.out.println(Arrays.toString(num));

    }
    static void insert(int[] num){
        for (int i = 0; i < num.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (num[j]<num[j-1]){
                    swap(num,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    static void swap(int[] num,int first,int second){
        int temp = num[first];
        num[first] = num[second];
        num[second]=temp;
    }
}
