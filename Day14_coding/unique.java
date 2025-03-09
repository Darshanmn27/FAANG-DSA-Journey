import java.util.*;
public class unique
{



    public  static  void  bruteforce()
    {
        int arr[] = {1, 2, 3, 4, 1, 2, 3};
        int n = arr.length;
        
        for(int i = 0; i < n; i++) 
        {
            int count = 0;
            for(int j = 0; j < n; j++) 
            {
                if(arr[i] == arr[j]) 
                {
                    count++;
                }
            }
            if(count == 1) {
                System.out.println("Unique element is: " + arr[i]);
                break;
            }
        }
    }



    public static  void better()
    {
        System.out.println("  to  find  the element using hashmap: ");
        int arr[] = {1, 2, 3, 4, 1, 2, 3};
        int n = arr.length;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; i++) 
        {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) 
        {
            if(entry.getValue() == 1) 
            {
                System.out.println("Unique element is: " + entry.getKey());
                break;
            }
        }
    }


    public  static  void optmalsolution()
    {
        System.out.println(" to  find elemnt using xor :");
        int arr[] = {1, 2, 3, 4, 1, 2, 3};
        int n = arr.length;
        
        int xor = 0;
        for(int i = 0; i < n; i++) 
        {
            xor = xor ^ arr[i];
        }
        
        System.out.println("Unique element is: " + xor);
    }
    
    public static void main(String args[])
    {
        bruteforce();
        better();
        optmalsolution();

    }
}