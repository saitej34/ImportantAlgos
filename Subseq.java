import java.util.*;
public class Subseq
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
        System.out.println("Enter the Subsequences: ");
        ArrayList<Integer> a = new ArrayList<Integer>();
        printSub(0,a,ar,n);
    }
    public static void printSub(int index,ArrayList<Integer> a,int[] arr,int n)
    {
        if(index>=n)
        {
            System.out.println(a);
            return;
        }
        a.add(arr[index]);
        printSub(index+1,a,arr,n);
        a.remove(Integer.valueOf(arr[index]));
        printSub(index+1,a,arr,n);
    }
}