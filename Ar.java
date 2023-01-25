import java.util.*;
public class Ar 
{
    public static void main(String[] args)
    {
        int[] arr = {3,1,2,5};
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<Integer>();
        findSub(arr,list,0,n);
    }
    public static void findSub(int[] arr,ArrayList<Integer> list,int index,int n)
    {
        if(index >= n)
        {
            System.out.println(list);
            return;
        }
        list.add(arr[index]);
        findSub(arr,list,index+1,n);
        list.remove(Integer.valueOf(arr[index]));
        findSub(arr,list,index+1,n);
    }
}