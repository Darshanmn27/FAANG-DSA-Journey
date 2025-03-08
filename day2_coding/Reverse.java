package day1_coding.day2_coding;
public class Reverse 
{
// Approach 1: Using while loop
public class ReverseNumber 
{
    public static void main(String[] args) 
    {
        int number = 12345;
        int reversedNumber = 0;

        while (number != 0) 
        {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed Number: " + reversedNumber);
    }
}


// Approach 2: Using StringBuilder
class ReverseNumberUsingStringBuilder 
{
    public static void main(String[] args) 
    {
        int number = 12345;
        StringBuilder sb = new StringBuilder(String.valueOf(number));
        System.out.println("Reversed Number: " + sb.reverse());
    }
}


// Approach 3: Using Recursion
class ReverseNumberUsingRecursion 
{
    static int reverseNumber(int number, int reversedNumber)
     {
        if (number == 0)
            return reversedNumber;
        reversedNumber = reversedNumber * 10 + number % 10;
        return reverseNumber(number / 10, reversedNumber);
    }

    public static void main(String[] args) 
    {
        int number = 12345;
        int reversed = reverseNumber(number, 0);
        System.out.println("Reversed Number: " + reversed);
    }
}
    
    
}
