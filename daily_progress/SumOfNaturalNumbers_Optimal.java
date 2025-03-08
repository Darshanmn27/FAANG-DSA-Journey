import java.util.*;

public class SumOfNaturalNumbers_Optimal 
{


    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of n :");
        int n=sc.nextInt();
        int sum=(n*(n+1))/2;
        System.out.println("sum of first "+n +" natural numbers is :"+sum);
        sc.close();
        
    }

    
}