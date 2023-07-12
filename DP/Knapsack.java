import java.util.* ;
import java.io.*; 

public class Solution{
    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {

            /* Your class should be named Solution
            * Don't write main().
            * Don't read input, it is passed as function argument.
            * Change in the given tree itself.
            * No need to return or print the output.
            * Taking input and printing output is handled automatically.
            */
        int[][] dp = new int[weight.length+1][maxWeight+1];
        for(int[] i : dp)
        {
            Arrays.fill(i,-1);
        }
        return findAns(weight,value,0,n,maxWeight,dp);
    }
    public static int findAns(int[] weight,int[] value,int index,int n,int maxWeight,int[][] dp)
    {
        if(index==weight.length)
        {
            return 0;
        }
        if(maxWeight==0)
        {
            return 0;
        }
        if(dp[index][maxWeight]!=-1)
        {
            return dp[index][maxWeight];
        }
        int notake = 0 + findAns(weight,value,index+1,n,maxWeight,dp);
        int take = Integer.MIN_VALUE;
        if(weight[index]<=maxWeight)
        {
            take = value[index] + findAns(weight,value,index+1,n,maxWeight-weight[index],dp);
        }
        return dp[index][maxWeight] = Math.max(take,notake);

    }
}