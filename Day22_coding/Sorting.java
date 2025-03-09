import java.util.*;
public class Sorting 
{



    public  static  void selectionsort()
    {
        int arr[]={7,6,5,43,2,1,12};
        int n = arr.length;
        for (int i = 0; i < n-1; i++) 
        {
            int minIndex = i;
            for (int j = i+1; j < n; j++) 
            {
                if (arr[j] < arr[minIndex]) 
                {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

    }

    public static void bubbleSort() 
    {
        int arr[]={7,6,5,43,2,1,12};
        int n = arr.length;
       
        for (int i = 0; i < n-1; i++) 
        {
            for (int j = 0; j < n-i-1; j++) 
            {
                if (arr[j] > arr[j+1]) 
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            
            }
        }
        }
    public static void main(String[] args) 
    {
        selectionsort();
        bubbleSort();
    }
}