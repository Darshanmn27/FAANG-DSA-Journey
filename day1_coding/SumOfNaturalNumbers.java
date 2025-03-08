import java.util.*;
public class SumOfNaturalNumbers {

    // ✅ Brute Force Approach (Using Loop)
    public static int sumBruteForce(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // ✅ Better Approach (Using Formula but iterative)
    public static int sumBetterApproach(int n) {
        return n * (n + 1) / 2;
    }

    // ✅ Optimal Approach (Single Line Formula)
    public static int sumOptimalApproach(int n) {
        return (int)((long)n * (n + 1) / 2); // Handling integer overflow
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        // Calling all three approaches
        System.out.println("Brute Force Approach: " + sumBruteForce(n));
        System.out.println("Better Approach: " + sumBetterApproach(n));
        System.out.println("Optimal Approach: " + sumOptimalApproach(n));

        scanner.close();
    }
}