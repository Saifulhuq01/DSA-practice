package DSA.algos.Strings;

import java.util.Arrays;

//1528. Shuffle String
public class ShuffleString {
    public static void main(String[] args) {
        String s="codeleet";
        int[] indices={4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indices));
    }
    static String restoreString(String s,int[] indices) {
        char ans[]= new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            ans[indices[i]]=s.charAt(i);
        }
        return new String(ans);


    }

}
