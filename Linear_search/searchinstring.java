package DSA.algos;
public class searchinstring {
    public static void main(String[] args) {
        String str="saifulhuq";
        char target='z';
        System.out.println(searchString(str,target));

    }
    static boolean searchString(String str,char target){
        if (str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
