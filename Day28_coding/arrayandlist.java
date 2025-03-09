import java.util.ArrayList;

public class arrayandlist 
{



    public  static  void  list()
    {
        ArrayList aa=  new ArrayList<>();
        aa.add("darshan");
        aa.add(2027);
        System.out.println(aa.get(0));
    }
    public static void main(String[] args) 
    {
        int[] arr = {10, 20, 30, 40, 50};

        for(int i = 0; i < arr.length; i++) 
        {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }
}