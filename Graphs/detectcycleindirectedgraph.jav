class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> edges) 
    {
        ArrayList<Integer> f = new ArrayList<>();
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
            f.add(node);
            for(int t : edges.get(node))
            {
                indegree[t]--;
                if(indegree[t]==0)
                {
                    q.add(t);
                }
            }

        }
        if(f.size()==V)
        {
            return false;
        }
        return true;
    }
}