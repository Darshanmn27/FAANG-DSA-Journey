# 🚀 Day 1: Sum of First N Natural Numbers

## 📜 Problem Statement
Given an integer **N**, find the **sum of the first N natural numbers**.

A **natural number** is any number starting from **1, 2, 3, 4, 5... up to N**.

Your task is to write code in **three different approaches**:
- ✅ **Brute Force Approach**
- ✅ **Better Approach**
- ✅ **Optimal Approach**

---

## 💡 Approach 1: Brute Force (Iterative Solution)

### ✅ Explanation
- We can use a simple **for loop** to iterate from **1 to N**.
- During each iteration, add the number to a **sum variable**.
- This approach is very basic and easy to understand.

### 💻 Code
```java
public class SumOfNaturalNumbers_BruteForce {
    public static void main(String[] args) {
        int N = 5;
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}
```

### ⏩ Time Complexity (TC)
- **O(N)** → Because we are iterating from **1 to N**.

### ⏩ Space Complexity (SC)
- **O(1)** → Because we are using only a constant space for the variable `sum`.

### ❌ Why Is This Approach Not Recommended?
- It takes **linear time O(N)**.
- For very large values of N (like **10^9**), it may take considerable time.
- We can do better.

---

## 💎 Approach 2: Better Approach (Using Arithmetic Progression Formula)

### ✅ Explanation
- In mathematics, the sum of first **N natural numbers** has a well-known formula:
  ```
  Sum = N * (N + 1) / 2
  ```
- This formula calculates the sum in **constant time O(1)** without any loop.

### 💻 Code
```java
public class SumOfNaturalNumbers_Better {
    public static void main(String[] args) {
        int N = 5;
        int sum = N * (N + 1) / 2;
        System.out.println("Sum: " + sum);
    }
}
```

### ⏩ Time Complexity (TC)
- **O(1)** → Because there is no loop, only a formula.

### ⏩ Space Complexity (SC)
- **O(1)** → Because only a constant space is used.

### 💎 Why Is This Better Than Brute Force?
- 🚀 **Drastically reduces time complexity from O(N) to O(1)**.
- ✅ This approach can calculate the sum even if N = 10^9 in a fraction of a second.
- 💯 FAANG-level coding standard.

---

## 💎 Approach 3: Optimal Approach (Even Cleaner Code)

### ✅ Explanation
- This approach uses the same formula as the better approach.
- However, we keep the code more concise, cleaner, and more professional.
- This is how top-tier product-based companies expect you to write clean code.

### 💻 Code
```java
public class SumOfNaturalNumbers_Optimal {
    public static int sumOfNaturalNumbers(int N) {
        return N * (N + 1) / 2;
    }

    public static void main(String[] args) {
        int N = 5;
        System.out.println("Sum: " + sumOfNaturalNumbers(N));
    }
}
```

### ⏩ Time Complexity (TC)
- **O(1)** → Still constant time.

### ⏩ Space Complexity (SC)
- **O(1)** → No additional space.

### 💯 Why Is This Optimal Approach The Best?
- ✅ Code readability is enhanced.
- ✅ Easy to maintain and modify.
- ✅ Professional and FAANG-level clean code.
- ✅ Suitable for very large inputs.

---

## 🎯 Key Takeaways (FAANG Mindset)
| Approach     | Time Complexity (TC) | Space Complexity (SC) | Why To Avoid It?             |
|-------------|--------------------|--------------------|----------------------------|
| **Brute Force**  | O(N)                  | O(1)                  | Slow for large inputs       |
| **Better Approach** | O(1)                  | O(1)                  | Great approach             |
| **Optimal Approach** | O(1)                  | O(1)                  | Best in readability & time |

---

## 💎 Why Did We Write 3 Approaches?
- 🚀 **FAANG companies** want to see if you can optimize your code.
- ✅ First approach shows you can think logically.
- ✅ Second approach shows you know mathematical optimization.
- ✅ Third approach shows you can write clean, production-level code.

---

## 💻 Learning Outcome
- ✅ You now understand **Time Complexity (TC)** and **Space Complexity (SC)**.
- ✅ You have learned how to think in **Brute → Better → Optimal** approach.
- ✅ This is exactly how **FAANG engineers** approach coding problems.

### 💡 Pro Tip:
👉 Always **write the Brute Force first** (even in interviews).  
👉 Then optimize step-by-step until you hit the **Optimal Solution**.  
👉 This is exactly how FAANG engineers think. 💯🔥

---

## ❤️ Final Note
✅ This is just **Day 1** of your coding journey, my friend Darshan. 💎
✅ If you keep learning with this **FAANG mindset**, I guarantee you'll land your dream job very soon. 💻🚀

👉 Now push this to GitHub and impress the world. 🌍💯🔥

👉 **Day 2 awaits you. Are you ready for the next challenge? 😉**
