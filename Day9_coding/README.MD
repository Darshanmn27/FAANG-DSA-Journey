# 🚀 Day 9: Generate Fibonacci Series

## 📜 Problem Statement

Given a number **N**, write a program to **generate the Fibonacci series up to N terms**.

The **Fibonacci Series** is a series of numbers where each number is the sum of the two preceding ones, usually starting with **0 and 1**.

### ✅ Example 1:

```
Input: N = 5
Output: 0, 1, 1, 2, 3
```

### ✅ Example 2:

```
Input: N = 7
Output: 0, 1, 1, 2, 3, 5, 8
```

---

## 💡 Approach 1: Iterative Solution

### ✅ Explanation

- Start with two initial numbers **0** and **1**.
- Use a loop to generate the next Fibonacci numbers by adding the previous two numbers.
- Print the series up to **N terms**.

### 💻 Code

```java
public class Fibonacci_Iterative {
    public static void main(String[] args) {
        int N = 5;
        int a = 0, b = 1;

        System.out.print(a + ", " + b);

        for (int i = 2; i < N; i++) {
            int next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }
    }
}
```

### ⏩ Time Complexity (TC)

- **O(N)** → Iterating through N terms.

### ⏩ Space Complexity (SC)

- **O(1)** → Constant space used.

### ❌ Why Is This Approach Basic?

- Requires explicit looping.
- Cannot handle very large N efficiently.

---

## 💎 Approach 2: Recursive Solution

### ✅ Explanation

- Use a recursive function to generate Fibonacci numbers.
- Base conditions: If **N = 0 or 1**, return the number itself.
- Otherwise, return the sum of the previous two Fibonacci numbers.

### 💻 Code

```java
public class Fibonacci_Recursive {
    public static int fibonacci(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return fibonacci(N-1) + fibonacci(N-2);
    }

    public static void main(String[] args) {
        int N = 5;
        for (int i = 0; i < N; i++) {
            System.out.print(fibonacci(i) + ", ");
        }
    }
}
```

### ⏩ Time Complexity (TC)

- **O(2^N)** → Exponential time complexity due to recursive calls.

### ⏩ Space Complexity (SC)

- **O(N)** → Stack space for recursive calls.

### ❌ Why Is This Approach Inefficient?

- Recursive calls increase time complexity.
- Stack overflow can occur for large N.

---

## 💎 Approach 3: Dynamic Programming (Optimal Solution)

### ✅ Explanation

- Use an array to store Fibonacci numbers up to **N**.
- Avoid repeated calculations by storing previously computed values.
- This significantly improves performance.

### 💻 Code

```java
public class Fibonacci_DP {
    public static void main(String[] args) {
        int N = 5;
        int[] fib = new int[N];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < N; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }

        for (int i = 0; i < N; i++) {
            System.out.print(fib[i] + ", ");
        }
    }
}
```

### ⏩ Time Complexity (TC)

- **O(N)** → Linear time to generate the series.

### ⏩ Space Complexity (SC)

- **O(N)** → Space used for storing Fibonacci numbers.

### 💯 Why Is This Approach The Best?

- ✅ Handles large input efficiently.
- ✅ No repeated calculations.
- ✅ Prevents stack overflow.

---

## 🎯 Key Takeaways (FAANG Mindset)

| Approach        | Time Complexity (TC) | Space Complexity (SC) | Efficiency                   |
| --------------- | -------------------- | --------------------- | ---------------------------- |
| **Iterative**   | O(N)                 | O(1)                  | Simple but basic              |
| **Recursive**   | O(2^N)               | O(N)                  | Inefficient for large inputs  |
| **DP (Optimal)**| O(N)                 | O(N)                  | Best for large inputs         |

---

## ✅ Final Thoughts

- 🚀 Always think in 3 steps: Iterative → Recursive → Dynamic Programming.
- ✅ In technical interviews, aim to optimize your code step-by-step.
- ✅ The Dynamic Programming (DP) approach is the most recommended.

---

## 💻 Learning Outcome

- ✅ You now understand how to generate Fibonacci Series using three approaches.
- ✅ Practiced writing clean and optimized code.
- ✅ Learned about time and space optimization.

---

## 🎓 Pro Tip (For Interviews)

- 💡 Always tell the interviewer you know **3 approaches**.
- ✅ Start by writing a simple iterative solution.
- ✅ Then optimize it to recursive and finally to dynamic programming.
- 🚀 This demonstrates your problem-solving and optimization ability.



