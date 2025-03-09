# 🚀 Day 8: Check if a Number is Perfect or Not

## 📜 Problem Statement
Given an integer **N**, write a program to **check whether the number is a Perfect Number or not**.

A **Perfect Number** is a **positive integer** that is equal to the **sum of its proper divisors** (excluding itself).

### ✅ Example 1:
```
Input: N = 28
Output: Yes, it's a Perfect Number
Explanation: Divisors of 28 are 1, 2, 4, 7, 14
1 + 2 + 4 + 7 + 14 = 28 → Perfect Number
```

### ✅ Example 2:
```
Input: N = 15
Output: No, it's not a Perfect Number
Explanation: Divisors of 15 are 1, 3, 5
1 + 3 + 5 = 9 ≠ 15 → Not a Perfect Number
```

---

## 💡 Approach 1: Brute Force (Iterative Solution)

### ✅ Explanation
- Traverse from **1 to N-1**.
- Check if the number divides **N** completely without remainder.
- If yes, add the divisor to the **sum**.
- After the loop, check if **sum == N**.
- If true, it's a Perfect Number.

### 💻 Code
```java
public class PerfectNumber_BruteForce {
    public static void main(String[] args) {
        int N = 28;
        int sum = 0;

        for (int i = 1; i < N; i++) {
            if (N % i == 0) {
                sum += i;
            }
        }

        if (sum == N) {
            System.out.println(N + " is a Perfect Number.");
        } else {
            System.out.println(N + " is not a Perfect Number.");
        }
    }
}
```

### ⏩ Time Complexity (TC)
- **O(N)** → Iterating from 1 to N-1.

### ⏩ Space Complexity (SC)
- **O(1)** → Constant space used.

### ❌ Why Is This Approach Not Recommended?
- Inefficient for very large numbers.
- Traverses from **1 to N-1**, resulting in higher execution time.

---

## 💎 Approach 2: Better Approach (Iterating Up to N/2)

### ✅ Explanation
- Instead of iterating till **N-1**, we can iterate till **N/2**.
- Any number greater than **N/2** can't be a divisor.
- This reduces the number of iterations by half.

### 💻 Code
```java
public class PerfectNumber_Better {
    public static void main(String[] args) {
        int N = 28;
        int sum = 0;

        for (int i = 1; i <= N/2; i++) {
            if (N % i == 0) {
                sum += i;
            }
        }

        if (sum == N) {
            System.out.println(N + " is a Perfect Number.");
        } else {
            System.out.println(N + " is not a Perfect Number.");
        }
    }
}
```

### ⏩ Time Complexity (TC)
- **O(N/2) ≈ O(N)** → Reduced the number of iterations by half.

### ⏩ Space Complexity (SC)
- **O(1)** → Constant space used.

### 💎 Why Is This Better Than Brute Force?
- 🚀 Reduced the number of iterations by 50%.
- ✅ Slightly faster execution.

---

## 💎 Approach 3: Optimal Approach (Iterate up to √N)

### ✅ Explanation
- The most optimal solution is to iterate till **√N**.
- If a divisor is found, add both **i** and **N/i** to the sum.
- Exclude the number itself (N).
- This approach works in **O(√N)** time complexity.

### 💻 Code
```java
public class PerfectNumber_Optimal {
    public static boolean isPerfectNumber(int N) {
        if (N <= 1) return false;

        int sum = 1; // Start with 1 as a divisor

        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                sum += i;
                if (i != N / i) {
                    sum += N / i;
                }
            }
        }

        return sum == N;
    }

    public static void main(String[] args) {
        int N = 28;
        if (isPerfectNumber(N)) {
            System.out.println(N + " is a Perfect Number.");
        } else {
            System.out.println(N + " is not a Perfect Number.");
        }
    }
}
```

### ⏩ Time Complexity (TC)
- **O(√N)** → Iterating up to the square root of N.

### ⏩ Space Complexity (SC)
- **O(1)** → Constant space.

### 💯 Why Is This Optimal Approach The Best?
- ✅ Fastest approach.
- ✅ Handles large inputs efficiently.
- ✅ Commonly used in competitive programming.

---

## 🎯 Key Takeaways (FAANG Mindset)
| Approach       | Time Complexity (TC) | Space Complexity (SC) | Efficiency                   |
|----------------|--------------------|--------------------|-------------------------------|
| **Brute Force** | O(N)                  | O(1)                  | Slow for large numbers        |
| **Better**      | O(N/2) ≈ O(N)         | O(1)                  | Faster but still not optimal  |
| **Optimal**     | O(√N)                  | O(1)                  | Best for large inputs         |

---

## ✅ Final Thoughts
- 🚀 **Always think in 3 steps:** Brute → Better → Optimal.
- ✅ In FAANG interviews, they expect you to optimize your solution.
- ✅ Start by writing a simple brute force, then optimize step-by-step.
- ✅ The optimal solution is the gold standard.

---

## 💻 Learning Outcome
- ✅ You now understand how to optimize time complexity from **O(N) → O(√N)**.
- ✅ Practiced writing clean and professional code.
- ✅ Learned about divisors and mathematical optimizations.

---

## 🎓 Pro Tip (For Interviews)
- 💡 Always tell the interviewer you know **3 approaches**.
- 💯 Write the brute force solution first.
- ✅ Then optimize step-by-step to the optimal solution.
- 🚀 This demonstrates your problem-solving ability.

