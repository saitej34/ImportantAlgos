import java.util.*;
public class Threesumtwopoint 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        List<List<Integer>> finlist = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(h.containsKey(arr[i]))
            {
                int t = h.get(arr[i]);
                h.put(arr[i],t+1);
            }
            else
            {
                h.put(arr[i],1);
            }
        }
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int k = arr[i]+arr[j];
                h.remove(Integer.valueOf(arr[i]));
                h.remove(Integer.valueOf(arr[j]));
                if(h.containsKey(k))
                {
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(k);
                    finlist.add(new ArrayList<>(list));
                }
            }
            
        }
    }
}