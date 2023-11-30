package DSA.algos.Binary_search;

import java.util.Arrays;

public class RowColMatrix2d {
    public static void main(String[] args) {
        int[][] arr={
                {7, 6, 4, 2, 8},
                {51,42,33,24,15},
                {91,23,84,55,96},
        };
        System.out.println(Arrays.toString(search(arr,55)));
    }
    static int[] search(int[][] arr,int target){
        int rows=0;
        int cols= arr[0].length-1;
        while (rows< arr.length && cols>=0){
            if (arr[rows][cols]==target) {
                return new int[]{rows, cols};
            }
            if (arr[rows][cols]>target){
                cols--;
            }else{
                rows++;
            }
        }
        return new int[]{-1,-1};
    }


}
