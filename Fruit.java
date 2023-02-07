import java.util.*;
public class Fruit
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
        int f = 0;
        TreeSet<Integer> h = new TreeSet<>();
        TreeSet<Integer> fin = new TreeSet<>();
        findAns(arr,n,h,fin);
        fin
    }
    public static void findAns(int[] arr, int n, TreeSet<Integer> h,TreeSet<Integer> fin)
    {
        int f=0,l=0,k=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(h.contains(arr[j])==true)
                {
                    if(l<2)
                    {
                        h.add(arr[j]);
                        f=f+1;
                    }
                    else
                    {
                        h.add(arr[j]);
                        f=f+1;
                    }
                }
                if(h.contains(arr[j])==false)
                {
                    if(l<2)
                    {
                        h.add(arr[j]);
                        l=l+1;
                        f=f+1;
                    }
                    else
                    {
                        h.clear();
                        l=0;
                        fin.add(f);
                        f=0;
                        break;
                    }
                }
                if(j==n-1)
                {
                    fin.add(f);
                    f=0;
                    l=0;
                    break;
                }
            }
        }
    }
}