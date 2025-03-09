import java.util.*;
public class Ceiling 
{

    public static int findCeiling(int[] arr, int target) 
    {
        int ceiling = Integer.MAX_VALUE;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] >= target && arr[i] < ceiling) 
            {
                ceiling = arr[i];
                found = true;
            }
        }

        return found ? ceiling : -1;
    }


    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,54,56,565,765,47648};
        int tar=34;
        System.out.println(findCeiling(arr, tar));
        
    }

    
}