import java.util.*;
public class Fibanocci_series 
{



    public static void bruteforce()
    {
        int N = 5;
        int a = 0, b = 1;

        System.out.print(a + ", " + b);

        for (int i = 2; i < N; i++) 
        {
            int next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }
    }


    public static void fibanoccidynamic()
    {
        System.out.println(" dynamic programming concepts :");
        int N = 5;
        int[] fib = new int[N];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < N; i++) 
        {
            fib[i] = fib[i-1] + fib[i-2];
        }

        for (int i = 0; i < N; i++) 
        {
            System.out.print(fib[i] + ", ");
        }
    }


    public static void main(String[] args) 
    {
        bruteforce();
        fibanoccidynamic();
        
    }

     
}