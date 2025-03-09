import java.util.*;
public class Armstrong_Check
{
  
    // Function to calculate power without Math.pow()
    public static int power(int base, int exp) 
    {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;
        int n = 0;

        // Count the number of digits
        int temp = num;
        while (temp > 0) {
            n++;
            temp /= 10;
        }

        // Calculate the sum of nth power of each digit
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += power(digit, n);
            temp /= 10;
        }

        // Check if the sum is equal to the original number
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong Number.");
        } else {
            System.out.println(originalNum + " is NOT an Armstrong Number.");
        }
    }
}
        
    }
}
