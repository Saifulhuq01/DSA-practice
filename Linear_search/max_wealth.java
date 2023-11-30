package DSA.algos;
//leetcode 1672
public class max_wealth {
    public static void main(String[] args) {
        int [][] accounts={{1,2,3},{3,2},{7,8,1},{1,2,1}};
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        //person=row
        //account=col
        int ans=Integer.MIN_VALUE;
        for (int personi = 0; personi < accounts.length; personi++) {
            int sum=0;
            for (int accountj = 0; accountj < accounts[personi].length; accountj++) {
                sum = sum+accounts[personi][accountj];
            }
            if (sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
