import java.util.*;
public class PALINDROME 
{

    public  static  boolean  ispali()
    {
        String ss="malayalam";
        char arr[]=ss.toCharArray();
        int start=0,end=ss.length()-1;
        while (start<=end) 
        {
            if(arr[start]!=arr[end])
            {
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) 
    {
      System.out.println(ispali());
    }

    
}