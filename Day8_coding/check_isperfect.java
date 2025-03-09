import java.util.*;
public class check_isperfect 
{

    public static void  PerfectNumber_BruteForce()
    {
        int N = 28;
        int sum = 0;

        for (int i = 1; i < N; i++) 
        {
            if (N % i == 0) 
            {
                sum += i;
            }
        }

        if (sum == N) 
        {
            System.out.println(N + " is a Perfect Number.");
        } else 
        {
            System.out.println(N + " is not a Perfect Number.");
        }

    } 


    public static void   PerfectNumber_Better()
    {
        int N = 28;
        int sum = 0;

        for (int i = 1; i <= N/2; i++) 
        {
            if (N % i == 0) 
            {
                sum += i;
            }
        }

        if (sum == N) 
        {
            System.out.println(N + " is a Perfect Number.");
        } else 
        {
            System.out.println(N + " is not a Perfect Number.");
        }

    }


    public static boolean isPerfectNumber(int N) 
    {
        if (N <= 1) return false;

        int sum = 1; // Start with 1 as a divisor

        for (int i = 2; i * i <= N; i++) 
        {
            if (N % i == 0) 
            {
                sum += i;
                if (i != N / i) 
                {
                    sum += N / i;
                }
            }
        }

        return sum == N;
    }


    public static void main(String[] args) 
    {
        PerfectNumber_BruteForce();
        PerfectNumber_Better();
        System.out.println(isPerfectNumber(28));
        
    }

    
}