class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        Stack<Integer> s = new Stack<Integer>();
        int[] visited = new int[V];
        for(int i=0;i<V;i++)
        {
            if(visited[i]==0)
            {
                dfs(i,adj,visited,s);
            }
        }
        int[] ans = new int[s.size()];
        int p = 0;
        while(s.empty()==false)
        {
            ans[p] = s.pop();
            p=p+1;
        }
        return ans;
    }
    public static void dfs(int i,ArrayList<ArrayList<Integer>> adj,int[] visited,Stack<Integer> s)
    {
        visited[i]=1;
        for(int x : adj.get(i))
        {
            if(visited[x]==0)
            {
                dfs(x,adj,visited,s);
            }
        }
        s.push(i);
    }
}