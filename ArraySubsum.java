//print subsequence whose sum is k
import java.util.*;
public class ArraySubsum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < n; i++)
        {
            ar[i] = sc.nextInt();
        }
        System.out.println("Enter the Sum: ");
        int sum = sc.nextInt();
        System.out.println("Printing Subsequences whose sum is k");
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Subseqsum(arr,ar,0,n,sum);
    }
    public static void Subseqsum(ArrayList<Integer> arr,int[] ar,int index,int n,int sum)
    {
        if(index>=n)
        {
            if(sum==0)
            {
                System.out.println(arr);
                return;
            }
            else
            {
                return;
            }
        }
        if(sum==0)
        {
            System.out.println(arr);
            return;
        }
        arr.add(ar[index]);
        Subseqsum(arr,ar,index+1,n,sum-ar[index]);
        arr.remove(Integer.valueOf(ar[index]));
        Subseqsum(arr,ar,index+1,n,sum);
    }
}