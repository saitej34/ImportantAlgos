public class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
         int[][] dp = new int[n+1][W+1];
         for(int[] i : dp)
         {
             Arrays.fill(i,-1);
         }
         return findAns(W,wt,val,n,0,dp);
    } 
    public static int findAns(int maxweight,int[] wt,int[] val,int n,int index,int[][] dp)
    {
        if(index>=n)
        {
            return 0;
        }
        if(dp[index][maxweight]!=-1)
        {
            return dp[index][maxweight];
        }
        int take = 0;
        if(wt[index]<=maxweight)
        {
            take = val[index] + findAns(maxweight-wt[index],wt,val,n,index+1,dp);
        }
        int nottake = findAns(maxweight,wt,val,n,index+1,dp);
        return dp[index][maxweight] = Math.max(take,nottake);
    }
}
 0-1 Knapsack {
    
}
