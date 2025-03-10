import java.util.*;
public class sorting  
{
  public static void main(String args[]) 
  {
    int n = 6;
    int arr[] = {20,15,26,2,98,6};

    for (int i = 0; i < n; i++) 
    {
      Set < Integer > s = new HashSet < Integer > ();
      for (int j = 0; j < n; j++) 
      {
        if (arr[j] < arr[i]) 
        {
          s.add(arr[j]);
        }
      }
      int rank = s.size() + 1;
      System.out.print(rank + " ");
    }
  }
}