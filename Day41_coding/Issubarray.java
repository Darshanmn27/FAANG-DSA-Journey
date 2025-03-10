import java.util.*;
public class Issubarray
{

    public   static boolean  issubsetarray()
    {
        int arr1[]={1,3,4,5,2};
        int arr2[]={2,4,3,1,7,5,15};
        if(arr1.length>arr2.length)
        {
            return false;
        }
        for(int i=0;i<arr2.length;i++)
        {
            boolean ispresent =false;
        for(int j=0;j<arr1.length;j++)
        {
            if(arr1[j]==arr2[j])
            {
                ispresent=true;
                break;
            }
        }
        if(ispresent==false)
        {
            System.out.println("false:");
        }
        }
        return true;
    }




    public static void main(String[] args) 
    {
        System.out.println(issubsetarray());
        
        
    }
}