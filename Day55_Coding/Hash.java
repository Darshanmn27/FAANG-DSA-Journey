import java.util.*;
public class Hash
{


    public   static   void   numberofoccurances()
    {
        HashMap<Integer,Integer>hh= new HashMap<>();
        int arr[]={1,2,3,4,4,5,5};
        for(int num:arr)
        {
            hh.put(num,hh.getOrDefault(num, 0)+1);
        }
        System.out.println(hh);
    }



    public  static   void    romantointeger()
    {
        HashMap<Character ,Integer>hh=  new HashMap<>();
        String ss="MM";
        int res=0;
        hh.put('I', 1);
        hh.put('V', 5);
        hh.put('X', 10);
        hh.put('L', 50);
        hh.put('C', 100);
        hh.put('D', 500);
        hh.put('M', 1000);
        char arr[]=ss.toCharArray();
        for(int i=0;i<arr.length;i++)
        {

            if(i>0 && hh.get(arr[i-1])<hh.get(arr[i]))
            {
                res=hh.get(arr[i])-res;
            }
            else
            {
                res=res+hh.get(arr[i]);//0  100 

            }
           
        }
        System.out.println(res);
    }
    public   static   void hs1()
    {
        HashMap<Integer,Integer>hh=   new HashMap<>();
        int arr[]={12,23,34,45,56,78,89,90,12,23,34,45,56,78,89,90};
        for(int num:arr)
        {
            hh.put(num,hh.getOrDefault(num,0)+1);
        }
        System.out.println(hh);
    }
    public   static   void ths1()
    {
        System.out.println("treemap ");
        TreeMap<Integer,Integer>hh=   new TreeMap<>();
        int arr[]={12,23,34,45,56,78,89,90,12,23,34,45,56,78,89,90,1,2,3,12,23,34,45,56,78,89,90,12,23,23,23,21};
        for(int num:arr)
        {
            hh.put(num,hh.getOrDefault(num,0)+1);
        }
        System.out.println(hh);
    }
    public   static   void lhsm()
    {
        System.out.println("Linkedhashmap: ");
        LinkedHashMap<Integer,Integer>hh=   new LinkedHashMap();
        int arr[]={1,2,3,4,4,44,4,12,23,34,45,56,78,89,90,12,23,34,45,56,78,89,90,12,23,34,45,56,78,89,90,12,23,23,23,21};
        for(int num:arr)
        {
            hh.put(num,hh.getOrDefault(num,0)+1);
        }
        System.out.println(hh);
    }
    public static void main(String[] args) 
    {
        numberofoccurances();
        romantointeger();
        hs1();
        ths1();
        lhsm();
        
    }
}