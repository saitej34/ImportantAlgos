import java.util.*;
public class Climb
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>(); //
        findRec(n,0,a); 
        System.out.println(a.size());
    }
    public static void findRec(int nsteps,int rsteps,ArrayList<Integer> a)
    {
        if(rsteps==nsteps)
        {
            a.add(1);
            return;
        }
        if(rsteps<nsteps)
        {
            findRec(nsteps,rsteps+1,a);
            findRec(nsteps,rsteps+2,a);
        }

    }
}