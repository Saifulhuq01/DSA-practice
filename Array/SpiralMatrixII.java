package DSA.practice;

import java.util.Arrays;

public class SpiralMatrixII {
    public static void main(String[] args) {


        int n = 3;
        System.out.println(Arrays.deepToString(generateMatrix(3)));
    }
    static int[][] generateMatrix(int n) {
        n=3;
        int r1=0;
        int c1=0;
        int r2=n-1;
        int c2=n-1;
        int[][] arr=new int[n][n];
        int val=1;
        while(r1 <= r2 && c1 <=c2){
            for (int i = c1; i <=c2; i++) {
                arr[r1][i]=val++;
            }
            for (int i = r1+1; i <=r2; i++) {
                arr[i][c2]=val++;
            }
            if (r1<r2 && c1<c2){
                for (int i = c2-1; i >c1; i--) {
                    arr[r2][i]=val++;
                }
                for (int i = r2; i >r1; i--) {
                    arr[i][c1]=val++;
                }
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return arr;
    }
}
