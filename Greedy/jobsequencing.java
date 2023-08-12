class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr,(a,b)->(b.profit-a.profit));
        int dead = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].deadline>dead)
            {
                dead = arr[i].deadline;
            }
        }
        int[] check = new int[dead];
        Arrays.fill(check,-1);
        int c = 0;
        int profit = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(check[arr[i].deadline-1]==-1)
            {
                profit = profit + arr[i].profit;
                check[arr[i].deadline-1]=1;
                c=c+1;
            }
            else
            {
                int j = arr[i].deadline-2;
                while(j>=0)
                {
                    if(check[j]==-1)
                    {
                        profit = profit + arr[i].profit;
                        check[j]=1;
                        c++;
                        break;
                    }
                    j=j-1;
                }
            }
        }
        int[] ty = new int[2];
        ty[0]=c;
        ty[1]=profit;
        return ty;
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/