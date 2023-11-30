package DSA.algos.Binary_search;

public class squareRoot {
    public static void main(String[] args) {
        int x=8;
        System.out.println(mySqrt(x));
    }
    static int mySqrt(int x) {

        if (x==0) return 0;
        int start=1;
        int end=x;
        int ans=0;
        while(start<=end){
            int mid= start+(end-start)/2;

            if (x/mid !=mid){
                if (x/mid >= mid){
                    start= mid+1;
                    ans=mid;
                }else{
                    end=mid-1;
                }
            }else {
                return mid;
            }
        }
        return ans;
    }
}
