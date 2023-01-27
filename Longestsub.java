//Longest Substring Without Repeating Characters
import java.util.*;
public class Longestsub 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String s = sc.next();
        List<List<Character>> finlist = new ArrayList<>();
        List<Character> list = new ArrayList<>();
        findSubs(s,finlist,list,0,s.length());
        System.out.println(finlist);

    }
    public static void findSubs(String s, List<List<Character>> finlist,List<Character> list,int index,int n)
    {
        if(index>=n)
        {
            finlist.add(new ArrayList<>(list));
            return;
        }
        list.add(s.charAt(index));
        findSubs(s,finlist,list,index+1,n);
        findSubs(s,finlist,list,index+1,n);
    }
}