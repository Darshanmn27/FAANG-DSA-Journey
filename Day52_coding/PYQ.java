import java.util.*;
public class PYQ
{
    public  static  void subarrayswithgivensum()
    {
        int arr[]={3,4,-7,1,3,3,1,-4};
        int sum=7;
        for(int i=0;i<arr.length;i++)
        {
        int cursum=0;
        //System.out.print(arr[i]+" ");
        for(int j=i;j<arr.length-1;j++)
        {
            cursum=cursum+arr[j];
            if(cursum==sum)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(" "+arr[k]+"");
                }
                System.out.println();
            }
        }

    }

    }
    public static  void main(String a[])
    {
        subarrayswithgivensum();

    }
}