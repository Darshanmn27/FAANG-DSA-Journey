import java.util.Arrays;

public class reversearray 
{
    public  static  void reversearray(int arr[],int start)
    {
      if(start>=arr.length/2)
      {
        return ;
      }

        int temp=arr[start];
        arr[start]=arr[arr.length-start-1];
        arr[arr.length-start-1]=temp;
        reversearray(arr, arr.length-start-1);

    }

    public  static  void main (String ar[])
    {
         int arr[]={1,2,3,4,5};
        int start=0,end=arr.length-1;
        System.out.println("Original Array: " + Arrays.toString(arr));
        reversearray(arr, start);
        System.out.println("reverse array :");
        System.out.println("Reversed Array: " + Arrays.toString(arr));
  

    }
    
}
