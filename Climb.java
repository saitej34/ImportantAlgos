import java.util.*;
public class Climb
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findRec(n,n)); 
    }
    public static int findRec(int n,int index)
    {
        if(index<=1)
        {
            return 1;
        }
        return findRec(n,index-1)+findRec(n,index-2);

    }
}