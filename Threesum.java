import java.util.*;
public class Threesum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum=0;
        List<List<Integer>> finlist = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        finTrip(n,arr,sum,finlist,list,0);
        System.out.println(finlist);
    }
    public static void finTrip(int n,int[] arr,int sum,List<List<Integer>> finlist,List<Integer> list,int index)
    {
        if(index>=n)
        {
            if(sum==0 && list.size()==3)
            {
                Collections.sort(list);
                if(!finlist.contains(list))
                {
                    finlist.add(new ArrayList<>(list));
                    return;
                }
            }
            else
            {
                return;
            }
        }
        if(list.size()==3 && sum==0)
        {
            Collections.sort(list);
            if(!finlist.contains(list))
            {
                finlist.add(new ArrayList<>(list));
                return;
            }
            else
            {
                return;
            }
        }
        list.add(Integer.valueOf(arr[index]));
        sum=sum+arr[index];
        finTrip(n,arr,sum,finlist,list,index+1);
        sum=sum-arr[index];
        list.remove(Integer.valueOf(arr[index]));
        finTrip(n,arr,sum,finlist,list,index+1);

    }
}