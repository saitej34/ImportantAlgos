package Sorting_Java;
import java.util.*;
public class Integersortingdemo 
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(0);
        arr.add(-98);
        arr.add(256);
        Collections.sort(arr);
        System.out.println(arr);
    }
}
