import java.util.*;
public class max_min 
{

    public  static  void maximum()
    {
        int arr[]={10,20,30,12,2,12,3,34,343,45};
        int max=arr[0];
        for(int num:arr)
        {
            if(num>max)
            {
                max=num;
            }
        }
        System.out.println("maximum number in array is :"+max);
    }
    public  static  void minimum()
    {
        int arr[]={10,20,30,12,2,12,3,34,343,45};
        int min=arr[0];
        for(int num:arr)
        {
            if(num<min)
            {
                min=num;
            }
        }
        System.out.println("minimum number in array is :"+min);
    }
    public  static void main(String a[])
    {
        maximum();
        minimum();


    }

    
}