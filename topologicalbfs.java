class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> edges) 
    {
        // add your code here
        int[] f = new int[V];
        ArrayList<Integer> arr = new ArrayList<>();
        int[] indegree = new int[V];
        for(int i=0;i<V;i++)
        {
            for(int x : edges.get(i))
            {
                indegree[x]++;
            }
        } 
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<V;i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }
        int h=0;
        while(q.isEmpty()==false)
        {
            int node = q.poll();
            f[h] = node;
            h=h+1;
            for(int t : edges.get(node))
            {
                indegree[t]--;
                if(indegree[t]==0)
                {
                    q.add(t);
                }
            }

        }
        return f;
    }
}