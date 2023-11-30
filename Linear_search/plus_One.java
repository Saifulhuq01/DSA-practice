package DSA.algos.Linear_search;

public class plus_One {
    public static void main(String[] args) {
        int[] digits={1,2,3,4,99};
        int[] ans=plusOne(digits);
        System.out.println(ans);
    }
    static int[] plusOne(int[] digits) {
        for (int i =digits.length-1 ;i >= 0; i--) {
            if (digits[i]+1 < 10){
                digits[i]++;
                return digits;
            }else{
                digits[i]=0;
            }

        }
        digits = new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
}
