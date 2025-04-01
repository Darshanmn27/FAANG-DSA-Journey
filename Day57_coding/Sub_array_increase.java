import  java.util.*;
public  class Sub_array_increase 
{


    public  static  void bruteforce()
    {
        int arr[]={10,20,30,10,20};
        int max=1;
        for(int i=0;i<arr.length;i++)
        {
            int cur=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[j-1])
                {
                    cur++;
                }
                else
                {
                    break;
                }
            }
            max=Math.max(max, cur);
        }
        System.out.println(max);
    }


    public  static  void  betterapproach()
    {
        int arr[]={10,20,30,10,20};
        int maxi=1,cur=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
                cur++;
            }
            else
            {
                maxi=Math.max(maxi, cur);
                cur=1;
            }

        }
        System.out.println(Math.max(maxi, cur));
    }
    public static void main(String[] args)
    {
        bruteforce();
        betterapproach();
    }

    
}