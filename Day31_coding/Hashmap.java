import java.util.*;
public  class Hashmap 
{


    public  static  void  hashmap()
    {
        int arr[]={10,20,30,40,50,10,20,30,40};
        HashMap<Integer,Integer>hh=  new HashMap<>();
        for(int num:arr)
        {
            hh.put(num, hh.getOrDefault(num,0)+1);
        }
        System.out.println("hash map  :");
        System.out.println(hh);
    }
    public  static  void  treemap()
    {
        int arr[]={10,20,30,4,1,2,2,3,340,50,10,20,30,40};
        TreeMap<Integer,Integer>hh=  new TreeMap();
        for(int num:arr)
        {
            hh.put(num, hh.getOrDefault(num,0)+1);
        }
        System.out.println("tree  map  :");
        System.out.println(hh);
    }
    public  static  void  linkedhasmap()
    {
        int arr[]={10,20,30,4,1,2,2,3,340,50,10,20,30,40};
        LinkedHashMap<Integer,Integer>hh=  new LinkedHashMap<>();
        for(int num:arr)
        {
            hh.put(num, hh.getOrDefault(num,0)+1);
        }
        System.out.println("Linked hash map  :");
        System.out.println(hh);
    }


    public static void main(String[] args) 
    {
        hashmap();//keys are not sorted not maintained
        treemap();//keys  are sorted
        linkedhasmap();// order  is  maintained 
    }

    
}