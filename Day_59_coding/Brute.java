import  java.util.*;
public class Brute
{
    public  static void main(String a[])
    {

        int arr[]={1,2,3,4,5,4,5,5,4,5,4,6,5,46,5,6,5,45,4,6,3,4,5,5,3};
        int k=20;
        int len=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int sum=0;
                for(int kk=i;kk<=j;kk++)
                {
                    sum=sum+arr[kk];
                }
                if(sum==k)
                {
                    len=Math.max(len, j-i+1);
                }
            }
        }
        System.out.println(len);

    }
}