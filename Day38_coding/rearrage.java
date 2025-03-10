import  java.util.*;
public class rearrage 
{

    public static void main(String[] args) 
    {

        int arr[]={5, 2, 9, 1, 6, 3};
        Arrays.sort(arr);
        for(int i=0;i<(arr.length+1)/2;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=arr.length-1;i>=(arr.length)/2;i--)
        {
            System.out.print(arr[i]+" ");
        }
        
    }

    
}