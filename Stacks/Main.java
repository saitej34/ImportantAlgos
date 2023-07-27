import java.util.*;
import java.io.*;
class Pair 
{
    int x;
    int y;
    int sec;
    public Pair(int x,int y,int sec)
    {
        this.x=x;
        this.y=y;
        this.sec=sec;
    }
}
public class Main 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int h=0;h<t;h++)
        {
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][n];
            for(int i=0;i<n;i++)
            {
                String s = br.readLine();
                for(int j=0;j<n;j++)
                {
                    arr[i][j] = Integer.parseInt(String.valueOf(s.charAt(j)));
                }
            }
            int fr=0;
            int[][] visited = new int[n][n];
            Queue<Pair> q = new LinkedList<>();
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(arr[i][j]==2)
                    {
                        q.add(new Pair(i,j,0));
                        visited[i][j]=1;
                    }
                    if(arr[i][j]==1)
                    {
                        fr=fr+1;;
                    }
                }
            }
            int[] xmoves = {0,-1,1,0};
            int[] ymoves = {1,0,0,-1};
            int secon = 0;
            while(q.isEmpty()==false)
            {
                int k = q.size();
                for(int qp=0;qp<k;qp++)
                {
                    Pair p = q.poll();
                    int x = p.x;
                    int y = p.y;
                    int sec = p.sec;
                    secon = Math.max(secon,sec);
                    for(int z=0;z<4;z++)
                    {
                        int xnew = x + xmoves[z];
                        int ynew = y + ymoves[z];
                        if(xnew<0 || ynew<0 || xnew>=arr.length || ynew>=arr[0].length || arr[xnew][ynew]==0 || visited[xnew][ynew]==1)
                        {
                            continue;
                        }
                        else 
                        {
                            arr[xnew][ynew]=2;
                            visited[xnew][ynew]=1;
                            q.add(new Pair(xnew,ynew,sec+1));

                        }
                    }
                }
            }
            int newf = 0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(arr[i][j]==1)
                    {
                        newf++;
                    }
                }
            }
            if(newf==0)
            {
                System.out.println(secon);
            }
            else
            {
                System.out.println("-1");
            }

        }
    }
}
