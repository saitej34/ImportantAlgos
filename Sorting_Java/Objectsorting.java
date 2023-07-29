package Sorting_Java;
import java.util.*;
class Song 
{
    public String name;
    public String artist;
    public String movie;
    public Song(String name,String artist,String movie)
    {
        this.name=name;
        this.artist=artist;
        this.movie=movie;
    }
}
public class Objectsorting 
{
    public static void main(String[] args)
    {
        ArrayList<Song> list = new ArrayList<>();
        Song s1 = new Song("a","b","c");
        Song s2 = new Song("d","e","f");
        Song s3 = new Song("g","h","i");
        Song s4 = new Song("j","k","l");
        Song s5 = new Song("p","q","r");
        list.add(s5);
        list.add(s1);
        list.add(s3);
        list.add(s4);
        list.add(s2);
        System.out.println(list);
        
    }

}
