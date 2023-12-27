package DSA.algos.Math_dsa;

import java.util.Arrays;

//leetcode 832. Flipping an Image;
public class FlippinganImage_LC {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        flipAndInvert(image);
        for (int i = 0; i < image.length; i++) {
            System.out.print(Arrays.toString(image[i]));
        }


    }
    static int[][] flipAndInvert(int[][] image){
        for (int i = 0; i < image.length; i++) {
            int[] row = image[i];
            //reverse the array
            for (int j = 0; j < (image[0].length + 1)/2; j++) {
                //swap
                int temp = row[j] ^ 1;
                row[j] = row[image[0].length - j - 1] ^ 1;
                row[image[0].length - j - 1] = temp;
            }

        }
        return image;

    }
}
