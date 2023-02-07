import java.util.*;
public class Foursum
{
    public static void main(String[] args)
    {
        int [] arr = {1,0,-1,0,-2,2};
        int tot = 0;
        int sum=0;
        List<List<Integer>> finlist = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        findPairs(arr,tot,sum,finlist,list,0);
        System.out.println(finlist);
    }
    public static void findPairs(int [] arr,int tot,int sum,List<List<Integer>> finlist,List<Integer> list,int index)
    {
        if(sum==tot)
        {
            finlist.add(new ArrayList<>(list));
            return;
        }
        if(list.size()==4)
        {
            if(sum==tot)
            {
                finlist.add(new ArrayList<>(list));
                return;
            }
            return;
        }
        findPairs(arr,tot,sum,finlist,list,index+1);
        list.add(arr[index]);
        sum=sum+arr[index];
        findPairs(arr,tot,sum,finlist,list,index+1);

    }
}