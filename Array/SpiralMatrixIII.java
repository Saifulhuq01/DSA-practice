package DSA.practice;

import java.util.Arrays;

//885. Spiral Matrix III
public class SpiralMatrixIII {
    public static void main(String[] args) {
        spiralMatrixIII(5,6,0,0);
        System.out.println(Arrays.deepToString(spiralMatrixIII(5,6,0,0)));
    }
    static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] res = new int[rows * cols][2];
        int dx = 0, dy = 1, n = 0, tmp;
        for (int j = 0; j < rows * cols; ++n) {
            for (int i = 0; i < n / 2 + 1; ++i) {
                if (0 <= rStart && rStart < rows && 0 <= cStart && cStart < cols)
                    res[j++] = new int[] {rStart, cStart};
                rStart =rStart + dx;
                cStart =cStart + dy;
            }
            tmp = dx;
            dx = dy;
            dy = -tmp;
        }
        return res;
    }
}
