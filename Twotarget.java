import java.util.*;
public class Twotarget
{
    public static void main(String[] args)
    {
        int[] arr = {2,5,11,15};
        int[] f  = new int[2];
        int target = 7;
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++)
        {
            h.put(arr[i],i);
        }
        System.out.println(h);
        int s=0;
        for(int i=0;i<arr.length;i++)
        {
            s = target-arr[i];
            if(h.containsKey(s)==true)
            {
                f[0]=i+1;
                f[1]=h.get(s)+1;
                break;
            }
        }
        for(int r : f)
        {
            System.out.println(r);
        }
    }
}