import java.util.*;
public class Subseqs
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.next();
        String f = "";
        printSub(0,s,f);
    }
    public static void printSub(int index,String a,String b)
    {
        if(index>=a.length())
        {
            System.out.println(b);
            return;
        }
        printSub(index+1,a,b);
        b=b+a.charAt(index);
        printSub(index+1,a,b);
    }
}