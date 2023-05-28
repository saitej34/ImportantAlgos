class bfs {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // Code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Queue<Integer> q = new LinkedList<>();
        int[] visited = new int[V];
        q.add(0);
        visited[0]=1;
        while(q.isEmpty()==false)
        {
            int k = q.poll();
            arr.add(k);
            for(int x : adj.get(k))
            {
                if(visited[x]==0)
                {
                    visited[x]=1;
                    q.add(x);
                }
            }
        }
        return arr;
    }
}