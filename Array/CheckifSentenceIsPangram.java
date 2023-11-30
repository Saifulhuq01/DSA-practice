package DSA.practice;
//1832. Check if the Sentence Is Pangram
public class CheckifSentenceIsPangram {
    public static void main(String[] args) {
        String sentence="thtequickbrownfoxjumpsoverthelazydog";
        System.out.println(check(sentence));
    }
    static boolean check(String sentence){

        for(char i = 'a'; i <= 'z'; i++) {
            if (sentence.indexOf(i) >= 0) {
                continue;
            }
            return false;
        }
        return true;

        /*int n =sentence.length();
        boolean hash[] = new boolean[26];
        int count =0;
        for(int i=0;i<n;i++){
            char c = sentence.charAt(i);
            if (hash[c - 'a']) {
                hash[c - 'a'] = true;
            } else {
                count++;
                hash[c - 'a'] = true;
            }

        }

        return count == 26;*/

    }
}
