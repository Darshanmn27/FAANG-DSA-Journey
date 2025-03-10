import java.util.*;
public class Occurances 
{

    public static void main(String a[])
    {

        int arr[]={10,20,30,40,10,20,30,40,1,2,3,4,34,32,4,23};
        HashMap<Integer,Integer>hh=  new HashMap<>();
        for(int num:arr)
        {
            hh.put(num,hh.getOrDefault(num,0)+1);
        }
        System.out.println(hh);

    }

    
}