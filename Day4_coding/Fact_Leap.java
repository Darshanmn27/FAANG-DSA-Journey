import java.util.*;
import java.util.stream.LongStream;
public class Fact_Leap
{


    public static void FactorialIteration()
    {
        int n = 5;
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + n + " is: " + factorial);
    }


    public static long factorial(int n) 
    {
        if (n < 0) {
            System.out.println("Invalid Input");
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }


    public static void factorialstream()
    {
         int n = 5;
        long factorial = LongStream.rangeClosed(1, n)
                                   .reduce(1, (a, b) -> a * b);
        System.out.println("Factorial of " + n + " is: " + factorial);
    }




    public static void leapyearornot()
    {

        int year = 2024;
        
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }

    }
    public static void main(String ar[])
    {
        FactorialIteration();
        System.out.println(factorial(91));
       factorialstream();
       leapyearornot();

    }
}
