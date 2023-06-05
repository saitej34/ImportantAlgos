import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList < String > findSum(int[][] arr, int n) 
    {
        ArrayList<String> a = new ArrayList<>();
        int[][] visited = new int[n][n];
        findAns(arr,n,a,"",0,0,visited);
        Collections.sort(a);
        return a;
    }
    public static void findAns(int[][] arr,int n,ArrayList<String> a,String s,int i,int j,int[][] visited)
    {
        if((i<0 || j<0) || (i>=n || j>=n))
        {
            return;
        }
        if(i==n-1 && j==n-1)
        {
            a.add(s);
            return;
        }
        if(arr[i][j]==0 || visited[i][j]==1)
        {
            return;
        }
            visited[i][j]=1;
            findAns(arr,n,a,s+"L",i,j-1,visited);
            findAns(arr,n,a,s+"R",i,j+1,visited);
            findAns(arr,n,a,s+"U",i-1,j,visited);
            findAns(arr,n,a,s+"D",i+1,j,visited);
           visited[i][j]=0;
    }
}