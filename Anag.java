// printing all ananagrams of a string

import java.util.*;
public class Anag 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextInt();
        List<List<Integer>> finlist = new ArrayList<>();
        String temp = "";
        findAnag(s,finlist,temp,0);
    }
    public static void findAnag(String s,List<List<Integer>> finlist,String temp,int index)
    {
        if(index==n)
        {
            finlist.add(); //
            return;
        }
        for(int i=index;i<arr.length;i++)
        {
            list.add(arr[i]);
            printSubs(arr,n,finlist,list,i+1);
            list.remove(Integer.valueOf(arr[i]));
        }
    }
}