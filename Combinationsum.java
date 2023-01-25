import java.util.*;
public class Combinationsum
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> fina = new ArrayList<>();
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Sum: ");
        int sum = sc.nextInt();
        System.out.println("Printing combinations whose sum is k");
        List<Integer> list = new ArrayList<Integer>();
        combiSum(arr,list,0,sum,n,fina);
        System.out.println(fina);
    }
    public static void combiSum(int[] arr,List<Integer> list, int index,int sum,int n,List<List<Integer>> fina)
    {
        if(sum<0)
        {
            return;
        }
        if(sum==0)
        {
            if(!fina.contains(list))
            {
                fina.add(new ArrayList<>(list));
            }
            return;
        }
        if(index>=n)
        {
            if(sum==0)
            {
                if(!fina.contains(list))
                {
                fina.add(new ArrayList<>(list));
               }
                return;
            }
            else
            {
                return;
            }
        }
        list.add(arr[index]);
        combiSum(arr,list,index+1,sum-arr[index],n,fina);
        combiSum(arr,list,index,sum-arr[index],n,fina);
        list.remove(Integer.valueOf(arr[index]));
        combiSum(arr,list,index+1,sum,n,fina);
    }
}