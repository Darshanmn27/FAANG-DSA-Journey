# HCF/GCD and LCM of Two Numbers

## ✅ Problem 1: HCF/GCD of Two Numbers
### 💡 What is HCF/GCD?
HCF (Highest Common Factor) or GCD (Greatest Common Divisor) is the largest positive integer that divides two or more numbers without leaving any remainder.

### Example:
```
HCF(12, 18) = 6
HCF(7, 13) = 1 (because they are co-prime)
```

---

## ✅ Approach 1: Brute Force Solution (Iterate Until Min)
### 💡 Logic:
- Start a loop from 1 to `min(a,b)`.
- Check if both numbers are divisible by the current number.
- The largest divisor found will be the HCF/GCD.

### 💻 Code: Brute Force Solution
```java
import java.util.Scanner;

public class HCFBruteForce {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int min = Math.min(a, b);
        int hcf = 1;

        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        System.out.println("HCF (GCD) of " + a + " and " + b + " is: " + hcf);
    }
}
```

### ✅ Dry Run (For a = 12, b = 18):
```
i = 1 → 12%1==0 && 18%1==0 → hcf=1
i = 2 → 12%2==0 && 18%2==0 → hcf=2
i = 3 → 12%3==0 && 18%3==0 → hcf=3
i = 6 → 12%6==0 && 18%6==0 → hcf=6
```
### ✅ Output:
```
HCF (GCD) of 12 and 18 is: 6
```

### ❌ Why Is This Brute Force BAD?
- 🚩 Inefficient for large numbers (like 1000000, 1200000).
- 🚩 Time Complexity: O(min(a,b))
- 🚩 Space Complexity: O(1)

---

## ✅ Approach 2: Better Solution (Using Euclidean Algorithm)
### 💡 Logic:
- Use the famous Euclidean Algorithm.
- Formula:
```
GCD(a,b) = GCD(b, a % b)
```
- Keep reducing numbers until one of them becomes 0.

### 💻 Code: Better Solution
```java
import java.util.Scanner;

public class HCFBetter {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("HCF (GCD) of " + a + " and " + b + " is: " + gcd(a,b));
    }
}
```

### ✅ Example Calculation (For a = 12, b = 18):
```
GCD(12,18) → GCD(18, 12%18) → GCD(18,12)
GCD(18,12) → GCD(12, 18%12) → GCD(12,6)
GCD(12,6) → GCD(6, 12%6) → GCD(6,0)
Answer = 6
```

### ✅ Time & Space Complexity:
| Approach   | Time Complexity     | Space Complexity  |
|------------|-------------------|-------------------|
| Euclidean  | ✅ O(log(min(a,b))) | ✅ O(1)          |

---

## ✅ Approach 3: Optimal Solution (Using Recursion)
### 💡 Logic:
- Same as the Euclidean Algorithm but using Recursion.
- Formula:
```
GCD(a,b) = GCD(b, a % b)
```

### 💻 Code: Optimal Solution
```java
import java.util.Scanner;

public class HCFOptimal {

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("HCF (GCD) of " + a + " and " + b + " is: " + gcd(a,b));
    }
}
```

### ✅ Time & Space Complexity:
| Approach   | Time Complexity     | Space Complexity  |
|------------|-------------------|-------------------|
| Recursive  | ✅ O(log(min(a,b))) | ✅ O(1)          |

---

## ✅ Problem 2: LCM of Two Numbers
### 💡 Formula:
The formula to calculate LCM is:
```
LCM(a,b) = (a*b) / GCD(a,b)
```

### 💻 Code: LCM Solution
```java
import java.util.Scanner;

public class LCM {

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("LCM of " + a + " and " + b + " is: " + lcm(a,b));
    }
}
```

### ✅ Example Calculation (For a = 12, b = 18):
```
LCM(12,18) = (12*18) / GCD(12,18)
LCM(12,18) = 216 / 6
LCM(12,18) = 36
```

### ✅ Time & Space Complexity:
| Approach   | Time Complexity     | Space Complexity  |
|------------|-------------------|-------------------|
| LCM        | ✅ O(log(min(a,b))) | ✅ O(1)          |

---

## ✅ Why Is This Optimal?
- 🚀 Handles very large numbers in milliseconds.
- 🚀 Uses the Euclidean Algorithm with O(log(min(a,b))).
- 🚀 Best for coding rounds and interviews.

## 📂 Conclusion
- ✅ We solved HCF/GCD using three approaches (Brute Force, Euclidean, Recursion).
- ✅ We solved LCM using GCD.
- ✅ We used the most optimal and fastest solution (Recursion + Euclidean).
- ✅ Recommended for coding rounds.

