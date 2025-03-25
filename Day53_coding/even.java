import  java.util.*;
public class even 
{

    public  static void evennumbersinrange(int num)
    {
        if(num==0)
        {
            return ;
        }
        System.out.print(num+" ");
        evennumbersinrange(num-2);
    }
    public  static void oddnubersinrange(int num)
    {
        //System.out.println("odd numbers :");
        if(num==3)
        {
            return ;
        }
        System.out.print(num+" ");
       oddnubersinrange(num-3);
    }

    public  static  void printnames(int num)
    {
        if(num<1)
        {
            return;
        }
        System.out.println("Darshan"+num);
        printnames(num-1);
    }
    public  static  void seriesnumber(int i,int j)
    {
        if(i>j)
        {
            return;
        }
        System.out.print(i+" ");
        seriesnumber(i+1, j);
    }

    public  static   void reverseseries(int i,int j)
    {
        if(i<j)
        {
            return;
        }
        System.out.print(i+" ");
        reverseseries(i-1, j);
    }

    public  static  void reversearray(int arr[],int start,int end)
    {
      if(start>=end)
      {
        return ;
      }

        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reversearray(arr, start+1, end-1);

    }
    public static void main(String[] args) 
    {
        evennumbersinrange(30);
        System.out.println("odd  numbers from range ");
        oddnubersinrange(27);
        System.out.println("print name  in  n times :");
        printnames(4);
        seriesnumber(1, 5);
        System.out.println("number series from n to 0");
        reverseseries(5, 1);
        int arr[]={1,2,3,4,5};
        int start=0,end=arr.length-1;
        System.out.println("Original Array: " + Arrays.toString(arr));
        reversearray(arr, start, end);
        System.out.println("reverse array :");
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }


    
}
