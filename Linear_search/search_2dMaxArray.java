package DSA.algos;

public class search_2dMaxArray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},
                {5,6,7},
                {8,91},
                {10,11,12,13,14}};
        System.out.println("maxValue "+ max(arr));
        System.out.println("minValue "+ min(arr));

    }
    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]>max){
                    max=arr[row][col];
                }
            }
        }
        return max;
    }

    static int min(int[][] arr){
        int min=Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]<min){
                    min=arr[row][col];
                }
            }
        }
        return min;
    }
}
