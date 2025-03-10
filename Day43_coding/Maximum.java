import java.util.*;
public class Maximum
{

    public  static void maximumsubarrysumbrute()
    {
        int arr[]={1,4,1,-1,23,-2,-3,-2,5};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            int cursum=0;
            for(int j=i;j<arr.length;j++)
            {
                cursum=cursum+arr[j];
                max=Math.max(max, cursum);
                if(cursum<0)
                {
                    cursum=0;
                }
            }
        }
        System.out.println(max);
    }
    public  static void optimalformaximum()
    {
        System.out.println("optimal solution is :");

        int arr[]={1,4,1,-1,23,-2,-3,-2,5};
        int max=Integer.MIN_VALUE;
        int cursum=0;
        for(int num:arr)
        {
            cursum=cursum+num;
                max=Math.max(max, cursum);
        
             if(cursum<0)
            {
                cursum=0;
            }

        }
        System.out.println(max);

    }
    public static void main(String a[])
    {
        maximumsubarrysumbrute();
        optimalformaximum();

    }
}