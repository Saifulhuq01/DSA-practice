package DSA.algos.Binary_search;
//leetcode 744
public class Find_Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {
        char[] letter={'c','f','j'};
        char target='d';
        char ans=nextGreatestLetter(letter,target);
        System.out.println(ans);

    }
    static char nextGreatestLetter(char[] letters, char target) {
        if (target>letters[letters.length-1]){
            return 0;
        }
        int start=0;
        int end= letters.length-1;


        while(start<=end){
            int mid=start+(end-start)/2;


            if(target<letters[mid]){
                    end=mid-1;
                } else  {
                    start=mid+1;
                }



        }
        return letters[start % letters.length] ;
    }
}
