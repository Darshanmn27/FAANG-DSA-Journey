import java.util.*;
public class First_last 
{



    public  static  void  brutefirstlast()
    {
        int arr[] = {1, 10, 21, 1, 30, 1, 4, 4};
        int target = 1;
        int n = arr.length;

        int first = -1, last = -1;
        
        // Find the first occurrence
        for(int i = 0; i < n; i++) 
        {
            if(arr[i] == target) 
            {
                first = i;
                break;
            }
        }
        
        // Find the last occurrence
        for(int i = n-1; i >= 0; i--) 
        {
            if(arr[i] == target) 
            {
                last = i;
                break;
            }
        }
        
        System.out.println("{" + first + ", " + last + "}");
    }



    public  static  void better()
    {
        int arr[] = {1, 10, 21, 1, 30, 1, 4, 4};
        int target = 1;
        int n = arr.length;

        int first = -1, last = -1;

        for(int i = 0; i < n; i++) 
        {
            if(arr[i] == target) 
            {
                if(first == -1) 
                {
                    first = i;
                }
                last = i;
            }
        }
        
        System.out.println("{" + first + ", " + last + "}");
    }

    public static int firstOccurrence(int arr[], int target) 
    {
        int low = 0, high = arr.length - 1, first = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == target) {
                first = mid;
                high = mid - 1;
            } else if(arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }

    public static int lastOccurrence(int arr[], int target)
     {
        int low = 0, high = arr.length - 1, last = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if(arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }


    public static void main(String[] args) 
    {
        brutefirstlast();
        better();
        int arr[] = {1, 10, 21, 1, 30, 1, 4, 4};
        int target = 1;
        int a[]=new int[2];
        a[1]=lastOccurrence(arr, target);
        a[0]=firstOccurrence(arr, target);
       for(int num:a)
       {
        System.out.print(num+" ");
       }
        
        
    }

    
}