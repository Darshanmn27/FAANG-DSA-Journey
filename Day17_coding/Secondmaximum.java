import java.util.*;
public class Secondmaximum
{


    public  static  void bruteforce()
    {
        int arr[] = {1, 10, 21, 30, 4};
        int n = arr.length;

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) 
        {
            for(int j = 0; j < n; j++) 
            {
                if(arr[j] > max) 
                {
                    secondMax = max;
                    max = arr[j];
                } else if(arr[j] > secondMax && arr[j] != max) 
                {
                    secondMax = arr[j];
                }
            }
        }

        if(secondMax == Integer.MIN_VALUE) 
        {
            System.out.println("No Second Maximum Element");
        } else 
        {
            System.out.println("Second Maximum Element: " + secondMax);
        }
    }

    public  static   void better()
    {
        int arr[] = {1, 10, 21, 30, 4};
        int n = arr.length;

        Arrays.sort(arr);
        int max = arr[n-1];

        for(int i=n-2; i>=0; i--) 
        {
            if(arr[i] != max) 
            {
                System.out.println("Second Maximum Element: " + arr[i]);
                return;
            }
        }

        System.out.println("No Second Maximum Element");

    }


    public  static  void optimal()
    {

        int arr[] = {1, 10, 21, 30, 4};
        int n = arr.length;

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) 
        {
            if(arr[i] > max) 
            {
                secondMax = max;
                max = arr[i];
            } else if(arr[i] > secondMax && arr[i] != max) 
            {
                secondMax = arr[i];
            }
        }

        if(secondMax == Integer.MIN_VALUE) 
        {
            System.out.println("No Second Maximum Element");
        } else 
        {
            System.out.println("Second Maximum Element: " + secondMax);
        }

    }
    public static void main(String[] args) 
    {
        bruteforce();
        better();
        optimal();
        
    }
}