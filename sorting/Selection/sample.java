package DSA.algos.sorting.Selection;

import java.util.Arrays;

public class sample {
    public static void main(String[] args) {
        int[] num={5,4,3,2,1};
        select(num);
        System.out.println(Arrays.toString(num));

    }
    static void select(int[] num){
        for (int i = 0; i <num.length ; i++) {
            int start =0;
            int last = num.length-i-1;
            int max = getMax(num,start,last);
            swapped(num,max,last);
        }

    }
    static  void swapped(int[] num,int max,int last){
        int temp=num[max];
        num[max]=num[last];
        num[last]=temp;
    }
    static  int getMax(int[] num,int start,int last){
        int maxval = start;
        for (int i = start; i <= last; i++) {
            if (num[maxval] < num[i]){
                maxval=i;
            }
        }
        return maxval;
    }
}
