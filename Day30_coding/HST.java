import  java.util.*;
public class HST 
{


    public  static  void   hashset()
    {
        int arr[]={10,20,30,40,50,10,20,30,40};
        HashSet<Integer>  hh=  new HashSet<>();
        for(int num:arr)
        {
            hh.add(num);
        }
        for(int num:hh)
        {
            System.out.print(num+" ");
        }
    }
    
    public  static  void   treeset()
    {
        System.out.println("tree set array  elements  are :");
        int arr[]={910,122,1211,10,20,30,40};
        TreeSet<Integer>  hh=  new TreeSet();
        for(int num:arr)
        {
            hh.add(num);
        }
        for(int num:hh)
        {
            System.out.print(num+" ");
        }
    }
    public  static  void   linkedhasset()
    {
        System.out.println("linked hashset :");
        System.out.println("tree set array  elements  are :");
        int arr[]={910,122,1211,10,20,30,40};
        LinkedHashSet<Integer>  hh=  new LinkedHashSet<>();
        for(int num:arr)
        {
            hh.add(num);
        }
        for(int num:hh)
        {
            System.out.print(num+" ");
        }
    }


    public static void main(String[] args) 
    {

        //  hashset ,treeset ,linkedhashset  are  not  allowing  the  duplicate  values 
        hashset();//50 20 40 10 30  not  maintained  thye  order in the  out put 
        treeset();//10 20 30 40 122 910 1211   sorted  elements  are  stored  inside  the treeset
        linkedhasset();//  order  is  maintained  910 122 1211 10 20 30 40




    }
}