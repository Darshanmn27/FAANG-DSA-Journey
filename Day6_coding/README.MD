# 🚀 Day 6 - Armstrong Number Problem

## 📌 Problem Statement
Write a **Java program** to check if a given number is an **Armstrong Number** or not using different approaches.

### 💡 What is an Armstrong Number?
An **Armstrong Number** (also known as a **Narcissistic Number**, **Pluperfect Digital Invariant (PPDI)**, or **Pluperfect Number**) is a number that is equal to the sum of its own digits raised to the power of the number of digits.

**Example:**
- **153** → 1^3 + 5^3 + 3^3 = 153 ✅ Armstrong Number
- **9474** → 9^4 + 4^4 + 7^4 + 4^4 = 9474 ✅ Armstrong Number
- **123** → 1^3 + 2^3 + 3^3 = 36 ❌ Not an Armstrong Number

---

## ✅ Approach 1: Brute Force Solution (For 3-digit Numbers)
### 💡 Logic:
- Convert the number to a String.
- Extract each digit using modulus (%) and division (/).
- Cube each digit (for 3-digit numbers) and sum them.
- Compare the sum with the original number.

### 💻 Code: Brute Force Solution
```java
import java.util.Scanner;

public class ArmstrongNumberBruteForce {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;

        // Extract each digit using % and /
        int digit1 = num % 10;
        num /= 10;
        int digit2 = num % 10;
        num /= 10;
        int digit3 = num % 10;

        // Cube each digit and sum it
        sum = (digit1 * digit1 * digit1) +
              (digit2 * digit2 * digit2) +
              (digit3 * digit3 * digit3);

        // Check if the sum is equal to the original number
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong Number.");
        } else {
            System.out.println(originalNum + " is NOT an Armstrong Number.");
        }
    }
}
```

### ✅ Time & Space Complexity (Brute Force)
| Approach      | Time Complexity   | Space Complexity   |
|---------------|------------------|--------------------|
| **Brute Force** | ✅ O(1) Constant Time | ✅ O(1) Constant Space  |

### ⚠ Limitations of Brute Force
- ❌ Only works for **3-digit numbers**.
- ❌ Needs manual digit extraction.
- ❌ Not scalable for **n-digit numbers**.

---

## ✅ Approach 2: Better Solution (For Any 'n' Digit Number)
### 💡 Logic:
- Use a **while loop** to extract each digit using `%10`.
- Count the number of digits (**n**).
- Sum the **power of each digit raised to the number of digits (n)**.
- Compare the sum with the original number.

### 💻 Code: Better Solution
```java
import java.util.Scanner;

public class ArmstrongNumberBetter {

    public static void main(String[] args) {
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
            sum += Math.pow(digit, n);
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
```

### ✅ Time & Space Complexity (Better Solution)
| Approach        | Time Complexity     | Space Complexity     |
|-----------------|--------------------|---------------------|
| **Better Solution** | ✅ O(log10(n))      | ✅ O(1) Constant Space  |

### 💎 Why Is This Solution Better?
- ✅ Handles any number of digits (n).
- ✅ Uses **Math.pow()** for power calculation.
- ✅ Time complexity is efficient.

---

## ✅ Approach 3: Optimal Solution (Most Efficient)
### 💡 Logic:
- Instead of using **Math.pow()**, use a manual power function.
- Avoid unnecessary function calls.
- Completely reduce space complexity to **O(1)**.

### 💻 Code: Optimal Solution
```java
import java.util.Scanner;

public class ArmstrongNumberOptimal {

    // Function to calculate power without Math.pow()
    public static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
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
```

### ✅ Time & Space Complexity (Optimal Solution)
| Approach        | Time Complexity     | Space Complexity     |
|-----------------|--------------------|---------------------|
| **Optimal Solution** | ✅ O(log10(n))      | ✅ O(1) Constant Space  |

### 💯 Why Is This Solution Most Optimal?
- ✅ Removed the usage of **Math.pow()**.
- ✅ Direct power calculation without any extra space.
- ✅ Scalable for any **n-digit number**.

---

## 🥇 Side-by-Side Comparison
| Approach       | Time Complexity     | Space Complexity     | Handles Any 'n'? | Most Optimal? |
|----------------|--------------------|---------------------|-------------------|---------------|
| **Brute**      | ✅ O(1)             | ✅ O(1)            | ❌ No (3-digit only) | ❌ No         |
| **Better**     | ✅ O(log10(n))      | ✅ O(1)            | ✅ Yes            | 🟢 Better     |
| **Optimal**    | ✅ O(log10(n))      | ✅ O(1)            | ✅ Yes            | ✅ Most Optimal |

---

## 💯 Final Verdict
- 🚀 **Always use the Optimal Solution** in FAANG/Product-Based Interviews.
- 💼 For **Service-Based Companies (TCS, Infosys, Cognizant)**, the Better Solution is sufficient.
- ❌ Never use Brute Force in interviews.

✅ **Star this repository** if you found it helpful! ⭐

