import java.time.Year;
import java.util.*;
import java.util.stream.IntStream;
public class Fact_Leap 
{


    public static void  FactorialIterative()
    {
        int num = 5;

        int fact = 1;
        for(int i=1; i<=num; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + num + " is: " + fact);

    }
    public static int factorial(int n)
     {
        if(n == 0 || n == 1) 
        {
            return 1;
        }
        return n * factorial(n-1);
    }


    public static void streamsfactorial()
    {
         int num = 5;
        int factorial = IntStream.rangeClosed(1, num)
                         .reduce(1, (a, b) -> a * b);
        System.out.println("Factorial of " + num + " is: " + factorial);

    }





    public static  void leapyearsimplecondition()
    {

        int year = 2024;
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
        {
            System.out.println(year + " is a Leap Year.");
        } else 
        {
            System.out.println(year + " is not a Leap Year.");
        }

    }

    public static void leapyearnested()
    {
       
        int year = 2024;

        if(year % 4 == 0) 
        {
            if(year % 100 == 0) 
            {
                if(year % 400 == 0) 
                {
                    System.out.println(year + " is a Leap Year.");
                } else 
                {
                    System.out.println(year + " is not a Leap Year.");
                }
            }
             else 
             {
                System.out.println(year + " is a Leap Year.");
            }
        } else 
        {
            System.out.println(year + " is not a Leap Year.");
        }
    }


    public static void leapyeardatetimeapi()
    {

        int year = 2024;
        boolean isLeap = Year.of(year).isLeap();
        System.out.println(year + " is a Leap Year? " + isLeap);
    }



    public static void main(String[] args) 
    {
        FactorialIterative();
        System.out.println(factorial(5));
        streamsfactorial();
        leapyearsimplecondition();
        leapyearnested();
        leapyeardatetimeapi();
    }

    
}
