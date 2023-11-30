package DSA.practice;

import java.util.ArrayList;
import java.util.List;

//54. Spiral Matrix
public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
    static List<Integer> spiralOrder(int[][] matrix) {
        List <Integer> ans = new ArrayList<>();
        int cls=0;
        int rs=0;
        int re= matrix.length -1;
        int cle= matrix[0].length-1;
        while (cls <=cle && rs <= re){
            for (int i = cls; i <= cle ; i++) {
                ans.add(matrix[rs][i]);
            }
            rs++;
            for (int i = rs; i <= re ; i++) {
                ans.add(matrix[i][cle]);
            }
            cle--;
            if (rs<=re) {
                for (int i = cle; i >= cls; i--) {
                    ans.add(matrix[re][i]);
                }
                re--;
            }
            if (cls <= cle){
                for (int i = re; i >=rs ; i--) {
                    ans.add(matrix[i][cls]);
                }
                cls++;
            }
        }
        return ans;
    }
}
