/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int w, Item arr[], int n) 
    {
        Arrays.sort(arr, new Comparator<Item>() {
            @Override
            public int compare(Item item1,
                               Item item2)
            {
                double cpr1
                    = new Double((double)item1.value
                                 / (double)item1.weight);
                double cpr2
                    = new Double((double)item2.value
                                 / (double)item2.weight);
 
                if (cpr1 < cpr2)
                    return 1;
                else
                    return -1;
            }
        });
        double profit = 0;
        for(int i=0;i<n;i++)
        {
            if(w-arr[i].weight>=0)
            {
                //System.out.println(arr[i].weight+" "+arr[i].value);
                profit = profit + arr[i].value;
                w=w-arr[i].weight;
            }
            else
            {
                //System.out.println(arr[i].weight+" "+arr[i].value);
                double frac = (double)((double)w/(double)arr[i].weight);
                //System.out.println(frac);
                profit = profit + frac*arr[i].value;
                break;
            }
        }
        return profit;
        
    }
}