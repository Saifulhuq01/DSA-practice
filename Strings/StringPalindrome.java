package DSA.algos.Strings;

public class StringPalindrome {
    public static void main(String[] args) {
        String st="abcdcba";
        System.out.println(palindrome(st));
    }
    static boolean palindrome(String st){
        if (st == null ||st.length()==0){
            return true;
        }
        st= st.toLowerCase();
        for (int i = 0; i < st.length()/2; i++) {
            char start=st.charAt(i);
            char end= st.charAt(st.length()-1 -i);

            if (start!= end){
                return false;
            }
        }
        return true;
    }
}
