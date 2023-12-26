package DSA.algos.Math_dsa;

public class setBits {
    public static void main(String[] args) {
        int n=45;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBit(n));
    }
    static int setBit(int n){
        int count=0;
        while(n>0){
            count ++;
            //n= n - ( n & -n); //or
             n= n & (n -1 );
        }
        return count;
    }
}
