import java.util.*;
public class Permu
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> finlist = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int[] freq = new int[arr.length];
        findPermu(arr,freq,finlist,list,n);
        System.out.println(finlist);
    }
    public static void findPermu(int[] arr,int [] freq,List<List<Integer>> finlist,List<Integer> list,int n)
    {
        if(list.size()>=n)
        {
            finlist.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(freq[i]==0)
            {
                freq[i]=1;
                list.add(arr[i]);
                findPermu(arr,freq,finlist,list,n);
                list.remove(Integer.valueOf(arr[i]));
                freq[i]=0;

            }
        }
        

    }
}
//[1,2,3]