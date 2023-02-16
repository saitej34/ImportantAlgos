import java.util.*;
public class Subset 
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3};
        List<List<Integer>> finlist = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        printSubs(arr,arr.length,finlist,list,0);
        System.out.println(finlist);
    }
    public static void printSubs(int[] arr,int n,List<List<Integer>> finlist,List<Integer> list,int index)
    {
        if(index==n)
        {
            finlist.add(new ArrayList<>(list)); //
            return;
        }
        for(int i=index;i<arr.length;i++)
        {
            list.add(arr[i]);
            printSubs(arr,n,finlist,list,i+1);
            list.remove(Integer.valueOf(arr[i]));
        }

    }
}