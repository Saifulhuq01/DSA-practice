package DSA.algos.sorting.cyclic;

import java.util.Arrays;

public class sample_cyclic {
    public static void main(String[] args) {
        int[] num = {5,4,3,2,1};
        cyclic(num);
        System.out.println(Arrays.toString(num));
    }
    static void cyclic(int[] num){
        int i=0;
        while(i< num.length){
            int correct = num[i]-1;
            if (num[i] != num[correct]){
                swap(num,i,correct);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] num,int i,int correct){
        int temp = num[i];
        num[i] = num[correct];
        num[correct] = temp;
    }
}
