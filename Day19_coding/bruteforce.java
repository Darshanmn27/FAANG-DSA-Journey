import java.util.*;
public class bruteforce
{


    public  static  void bruteforcebinarysearch()
    {
        int arr[] = {1, 2, 8, 10, 10, 12, 19};
        int target = 5;

        int floor = -1;
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] <= target) 
            {
                floor = arr[i];
            }
        }
        System.out.println("Floor of " + target + " is: " + floor);
    

    }
    public static void main(String[] args) 
    {
        bruteforcebinarysearch();
        
    }
}
