import java.util.*;
public class Findindex
{


    public  static  void linearsearchbrute()
    {
        int arr[] = {1, 2, 3, 4, 5};
        int target = 4;

        for(int i = 0; i < arr.length; i++) 
        {
            if(arr[i] == target) 
            {
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found");
   
    }


    public  static  void bettersolutionhashmap()
    {



        int arr[] = {1, 2, 3, 4, 5};
        int target = 4;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) 
        {
            map.put(arr[i], i);
        }

        if(map.containsKey(target)) 
        {
            System.out.println("Element found at index: " + map.get(target));
        } else 
        {
            System.out.println("Element not found");
        }
    }



    public  static  void binarysearch()
    {
        System.out.println("binary  search   optimal  solution:");
        int arr[] = {1, 2, 3, 4, 5};
        int target = 4;

        int low = 0, high = arr.length - 1;

        while(low <= high) 
        {
            int mid = low + (high - low) / 2;

            if(arr[mid] == target) 
            {
                System.out.println("Element found at index: " + mid);
                return;
            }
            else if(arr[mid] < target) 
            {
                low = mid + 1;
            }
            else 
            {
                high = mid - 1;
            }
        }

        System.out.println("Element not found");
    }
    


    public static void main(String[] args) 
    {
        linearsearchbrute();
        bettersolutionhashmap();
        binarysearch();
        
    }

}