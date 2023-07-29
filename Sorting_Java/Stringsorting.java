package Sorting_Java;

import java.util.ArrayList;
import java.util.Collections;

public class Stringsorting 
{
    public static void main(String[] args)
    {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("z");
        arr.add("x");
        arr.add("y");
        arr.add("d");
        Collections.sort(arr);
        System.out.println(arr);
    }
}
