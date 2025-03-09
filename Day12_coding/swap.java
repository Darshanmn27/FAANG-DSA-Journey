import java.util.*;
public class swap
{

    public static void swappingusingtemp()
    {
        int a = 5;
        int b = 10;

        System.out.println("Before Swapping: a = " + a + ", b = " + b);

        // Swap using temporary variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping: a = " + a + ", b = " + b);
  
    }
    public static void swappingwithoutusingtemp()
    {

        int a = 5;
        int b = 10;

        System.out.println("Before Swapping: a = " + a + ", b = " + b);

        // Swap without using temporary variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping: a = " + a + ", b = " + b);


    }

    public static void swappingusingxor()
    {

        int a = 5;
        int b = 10;

        System.out.println("Before Swapping: a = " + a + ", b = " + b);

        // Swap using bitwise XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swapping: a = " + a + ", b = " + b);


    }
    public static void main(String[] args) 
    {
        swappingusingtemp();
        swappingwithoutusingtemp();
        swappingusingxor();
        
    }
}