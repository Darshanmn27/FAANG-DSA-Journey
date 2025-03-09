import java.util.*;
public class Optimal2isprime 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        if(n == 1) 
        {
            System.out.println(n + " is NOT a Prime Number");
            return;
        }
        if(n == 2 || n == 3) {
            System.out.println(n + " is a Prime Number");
            return;
        }
        if(n % 2 == 0 || n % 3 == 0) {
            System.out.println(n + " is NOT a Prime Number");
            return;
        }
        
        // Now check from 6k-1 and 6k+1
        for(int i = 5; i*i <= n; i += 6) {
            if(n % i == 0 || n % (i+2) == 0) {
                System.out.println(n + " is NOT a Prime Number");
                return;
            }
        }
        
        System.out.println(n + " is a Prime Number");
    }
        
    }

    

