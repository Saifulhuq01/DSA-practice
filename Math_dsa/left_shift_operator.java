package DSA.algos.Math_dsa;

public class left_shift_operator {
    public static void main(String[] args) {
        int i=4,j=8;
        leftshift(i,j);
        System.out.println(i);
    }
    static void leftshift(int i, int j){
        i<<=j;
    }
}
