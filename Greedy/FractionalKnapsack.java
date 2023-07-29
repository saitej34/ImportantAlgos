import java.util.*;
class Item 
{
    int value;
    int weight;
    public Item(int value,int weight)
    {
        this.value=value;
        this.weight=weight;
    }
}
public class FractionalKnapsack 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int knapcap = sc.nextInt();
        int[] weight = new int[n];
        int[] value = new int[n];
        for(int i=0;i<n;i++)
        {
            weight[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            value[i] = sc.nextInt();
        }
        Item[] items = new Item[n];
        for(int i=0;i<n;i++)
        {
            items[i] = new Item(weight[i],value[i]);
        }
       
        
    }
}



//comments

// Given an knapsack i.e bag of some kgs and we are given weights and values need to find maximum value we can get of that knapsack capacity/

// caluculate value/weight ratio and sort them in decreasing order