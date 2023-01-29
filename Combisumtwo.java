import java.util.*;
public class Combisumtwo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target sum");
        int target = sc.nextInt();
        HashSet<List<Integer>> finlist = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        findComb(n,arr,finlist,list,0,target,0);
        System.out.println(finlist);
    }
    public static void findComb(int n,int[] arr,HashSet<List<Integer>> finlist,List<Integer> list,int index,int target,int sum)
    {
        if(index>=n)
        {
            if(sum==target)
            {
                Collections.sort(list);
                finlist.add(new ArrayList<>(list));
                return;
            }
            else
            {
                return;
            }
        }
        if(sum==target)
        {
            Collections.sort(list);
            finlist.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[index]);
        sum=sum+arr[index];
        findComb(n,arr,finlist,list,index+1,target,sum);
        list.remove(Integer.valueOf(arr[index]));
        sum=sum-arr[index];
        findComb(n,arr,finlist,list,index+1,target,sum);
    }
}