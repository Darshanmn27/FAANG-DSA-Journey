import java.util.*;
public class Better_checkprime 
{




    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int count = 0;
        for(int i = 1; i <= n/2; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        
        if(count == 1) {  // Only 1 divisor before itself
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is NOT a Prime Number");
        }

        
    }
    
}
