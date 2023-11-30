package DSA.algos;

import java.util.Arrays;

public class search_2dArray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},
                    {5,6,7},
                    {8,9},
                    {10,11,12,13,14}};
        int target=12;
        int[] ans=search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
