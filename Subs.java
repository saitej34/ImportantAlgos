import java.util.*;
public class Subs
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.next();
        System.out.println("Enter the substring size : ");
        int n  = sc.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        findAns(s,arr,0,"");
        System.out.println(arr);
    }
    public static void findAns(String s,ArrayList<String> arr,int index,String f)
    {
        if(index>=s.length())
        {
            arr.add(s);
            return;
        }
        findAns(s,arr,index+1,f);
        findAns(s,arr,index+1,f+s.charAt(index));
    }
}