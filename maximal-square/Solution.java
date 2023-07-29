class Solution 
{
    public int maximalSquare(char[][] matrix) {
        int[][] ans = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                ans[i][j]=Character.getNumericValue(matrix[i][j]);
            }
        }
        for(int i=matrix.length-1;i>=0;i--)
        {
            for(int j=matrix[0].length-1;j>=0;j--)
            {
                if(ans[i][j]==1)
                {
                    if(isValid(ans,i,j)==true)
                    {
                        ans[i][j] += Math.min(ans[i+1][j],Math.min(ans[i][j+1],ans[i+1][j+1]));
                    }
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<ans[0].length;j++)
            {
                max = Math.max(max,ans[i][j]);
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
        return max*max;


    }
    public static boolean isValid(int[][] matrix,int i,int j)
    {
        if(i+1<matrix.length && j+1<matrix[0].length)
        {
        return true;
        }
       
        return false;
    }
}
