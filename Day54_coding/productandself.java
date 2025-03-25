import  java.util.*;
public class productandself 
{


    public  static void productitself()
    {

        int arr[]={1,2,4,6};
        int sum=0;
        int newarr[]= new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int p=1;
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j)
                {
                    p=p*arr[j];
                }

            }
            newarr[i]=p;
        }
        for(int num:newarr)
        {
            System.out.print(" "+num);

        }
    }
    public static void main(String[] args) 
    {
        productitself();
        
    }

    

    
}