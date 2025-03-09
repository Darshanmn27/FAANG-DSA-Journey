import java.util.*;
public class prime_factors 
{


    public static void  bruteforce()
    {
        System.out.println("brute force approach: ");
        int N = 84;

        for (int i = 2; i <= N; i++) 
        {
            while (N % i == 0) 
            {
                System.out.print(i + " ");
                N /= i;
            }
        }
    }

    public static void better()
    {
        System.out.println("better approach :");
        int N = 84;

        for (int i = 2; i * i <= N; i++) 
        {
            while (N % i == 0) 
            {
                System.out.print(i + " ");
                N /= i;
            }
        }

        // If N is still > 1, it means it's a prime number.
        if (N > 1) 
        {
            System.out.print(N);
        }
    }


    public static void main(String[] args) 
    {
        bruteforce();
        better();
        
    }

    
}