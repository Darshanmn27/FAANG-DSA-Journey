# 🚀 Day 11: Print All Prime Factors of a Number

## 📜 Problem Statement

Given a **positive integer N**, write a program to **print all the prime factors of N**.

A **Prime Factor** of a number is a prime number that **divides the number N completely without any remainder**.

Your task is to:
- **Find all prime factors** of the given number.
- Print them in ascending order.

---

## ✅ Example 1:

```
Input: N = 28
Output: 2 2 7
Explanation: 28 = 2 * 2 * 7
```

## ✅ Example 2:

```
Input: N = 84
Output: 2 2 3 7
Explanation: 84 = 2 * 2 * 3 * 7
```

## ✅ Example 3:

```
Input: N = 13
Output: 13
Explanation: 13 is itself a prime number, hence its only prime factor is 13.
```

---

## 💡 Approach 1: Brute Force (Check All Numbers)

### ✅ Explanation

- Traverse from **2 to N**.
- Check if the number **N** is divisible by any number.
- If divisible, keep dividing the number and print the divisor.
- Continue until N reduces to 1.

### 💻 Code

```java
public class PrimeFactors_BruteForce {
    public static void main(String[] args) {
        int N = 84;

        for (int i = 2; i <= N; i++) {
            while (N % i == 0) {
                System.out.print(i + " ");
                N /= i;
            }
        }
    }
}
```

### ✅ Test Cases

| Input | Output     |
|-------|------------|
| 28    | 2 2 7      |
| 84    | 2 2 3 7    |
| 13    | 13         |
| 100   | 2 2 5 5    |

### ⏩ Time Complexity (TC)

- **O(N)** in the worst case.
- Because we are checking divisibility for all numbers up to **N**.

### ⏩ Space Complexity (SC)

- **O(1)** (Constant space usage).

### ❌ Why Is This Approach Not Recommended?

- 🚫 Inefficient for large numbers.
- 🚫 Traverses up to **N**, making it slower.

---

## 💎 Approach 2: Better Approach (Divide by Smaller Primes)

### ✅ Explanation

- Instead of checking **all numbers**, only check from **2 to √N**.
- For every divisor found, keep dividing the number.
- This drastically reduces the iterations.

### 💻 Code

```java
public class PrimeFactors_Better {
    public static void main(String[] args) {
        int N = 84;

        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                System.out.print(i + " ");
                N /= i;
            }
        }

        // If N is still > 1, it means it's a prime number.
        if (N > 1) {
            System.out.print(N);
        }
    }
}
```

### ✅ Test Cases

| Input | Output     |
|-------|------------|
| 28    | 2 2 7      |
| 84    | 2 2 3 7    |
| 13    | 13         |
| 100   | 2 2 5 5    |

### ⏩ Time Complexity (TC)

- **O(√N)** in the worst case.
- Reason: We are reducing N significantly after each division.

### ⏩ Space Complexity (SC)

- **O(1)** (Constant space).

### 💎 Why Is This Better Than Brute Force?

- 🚀 Drastically reduces time from **O(N)** to **O(√N)**.
- ✅ Handles large numbers efficiently.

---

## 💎 Approach 3: Optimal Approach (Using Prime Factorization)

### ✅ Explanation

- Start dividing the number **by 2** until it's no longer divisible by 2.
- Then move to **odd numbers** and divide until **N reduces to 1**.
- This is the fastest way to get prime factors.

### 💻 Code

```java
public class PrimeFactors_Optimal {
    public static void main(String[] args) {
        int N = 84;

        // Print all 2's
        while (N % 2 == 0) {
            System.out.print(2 + " ");
            N /= 2;
        }

        // Now check odd numbers
        for (int i = 3; i * i <= N; i += 2) {
            while (N % i == 0) {
                System.out.print(i + " ");
                N /= i;
            }
        }

        // If N is still prime
        if (N > 1) {
            System.out.print(N);
        }
    }
}
```

### ✅ Test Cases

| Input | Output     |
|-------|------------|
| 28    | 2 2 7      |
| 84    | 2 2 3 7    |
| 13    | 13         |
| 100   | 2 2 5 5    |

### ⏩ Time Complexity (TC)

- **O(√N)** → Best possible time complexity.

### ⏩ Space Complexity (SC)

- **O(1)** → Constant space usage.

### 💯 Why Is This The Best Approach?

- 🚀 Handles very large numbers efficiently.
- ✅ Fastest time complexity.
- ✅ Commonly used in competitive coding.

---

## 🎯 Key Takeaways (FAANG Standard)

| Approach        | Time Complexity (TC) | Space Complexity (SC) | Efficiency                   |
|----------------|---------------------|---------------------|-----------------------------|
| **Brute Force** | O(N)                 | O(1)                | Very Slow                    |
| **Better**      | O(√N)                | O(1)                | Efficient                    |
| **Optimal**     | O(√N)                | O(1)                | Best for large inputs         |

---

## ✅ Final Thoughts

- 🚀 Always think in **3 steps**: Brute → Better → Optimal.
- ✅ This problem is very common in **interviews**.
- ✅ Mention that you know **3 approaches** during technical rounds.
- 💯 Optimize your code to O(√N) for the best performance.

---

## 💻 Learning Outcome

- ✅ You now understand **Prime Factorization**.
- ✅ Practiced writing clean and professional code.
- ✅ Improved problem-solving skills.

---

## 🎓 Pro Tip (For Interviews)

- 💡 Always start with the brute force solution.
- ✅ Then optimize step-by-step.
- 💯 In FAANG-level interviews, always mention time complexity.
- 🚀 Aim to reach O(√N) for large input problems.



