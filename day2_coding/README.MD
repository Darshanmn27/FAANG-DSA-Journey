# 🚀 Day 2: Reverse a Number

## 📜 Problem Statement
Given an **integer number**, reverse the digits of the number.

For example:

| Input Number   | Reversed Number    |
|----------------|-------------------|
| **12345**      | **54321**          |
| **98765**      | **56789**          |
| **100**        | **1**              |

Your task is to solve this problem using **three different approaches**:
- ✅ **Approach 1: Using While Loop**
- ✅ **Approach 2: Using StringBuilder**
- ✅ **Approach 3: Using Recursion**

---

## 💡 Approach 1: Using While Loop (Most Common Approach)

### ✅ Explanation
- We use a simple **while loop** to extract each digit from the number.
- Multiply the **reversedNumber** by 10 and add the extracted digit.
- Divide the original number by 10 each time.
- Repeat the process until the number becomes 0.

### 💻 Code
```java
package day1_coding.day2_coding;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed Number: " + reversedNumber);
    }
}
```

### ⏩ Time Complexity (TC)
- **O(log10(N))** → The loop runs until the number becomes 0.

### ⏩ Space Complexity (SC)
- **O(1)** → No extra space is used.

### 💯 Why Is This Approach Standard?
- ✅ Simple and easy to understand.
- ✅ Efficient for small to large numbers.

---

## 💎 Approach 2: Using StringBuilder (Quick and Clean Code)

### ✅ Explanation
- Convert the integer to a **String** using `String.valueOf()`.
- Use `StringBuilder` to reverse the String.
- This approach is very clean and professional.

### 💻 Code
```java
package day1_coding.day2_coding;

class ReverseNumberUsingStringBuilder {
    public static void main(String[] args) {
        int number = 12345;
        StringBuilder sb = new StringBuilder(String.valueOf(number));
        System.out.println("Reversed Number: " + sb.reverse());
    }
}
```

### ⏩ Time Complexity (TC)
- **O(N)** → N is the number of digits in the number.

### ⏩ Space Complexity (SC)
- **O(N)** → Because a new StringBuilder is created.

### 💯 Why Is This Approach Cool?
- ✅ It is a clean one-liner solution.
- ✅ Great for quick coding challenges.

---

## 💎 Approach 3: Using Recursion (FAANG-Level Thinking)

### ✅ Explanation
- Recursion is a method where a function calls itself.
- We keep appending the last digit to `reversedNumber` and reduce the number.
- Base Condition: If `number == 0`, return the `reversedNumber`.

### 💻 Code
```java
package day1_coding.day2_coding;

class ReverseNumberUsingRecursion {

    static int reverseNumber(int number, int reversedNumber) {
        if (number == 0)
            return reversedNumber;
        reversedNumber = reversedNumber * 10 + number % 10;
        return reverseNumber(number / 10, reversedNumber);
    }

    public static void main(String[] args) {
        int number = 12345;
        int reversed = reverseNumber(number, 0);
        System.out.println("Reversed Number: " + reversed);
    }
}
```

### ⏩ Time Complexity (TC)
- **O(log10(N))** → Recursive calls until the number becomes 0.

### ⏩ Space Complexity (SC)
- **O(log10(N))** → Recursive call stack.

### 💯 Why Is This Approach Professional?
- ✅ Demonstrates your understanding of recursion.
- ✅ FAANG-level coding style.

---

## 🎯 Key Takeaways (FAANG Mindset)
| Approach         | Time Complexity (TC) | Space Complexity (SC) | Why To Use It?             |
|----------------|--------------------|--------------------|----------------------------|
| **While Loop**   | O(log10(N))         | O(1)               | Simple and space-efficient   |
| **StringBuilder** | O(N)                | O(N)               | Quick and clean             |
| **Recursion**     | O(log10(N))         | O(log10(N))        | Professional-level thinking  |

---

## 💡 Learning Outcome
- ✅ You learned **three different ways** to reverse a number.
- ✅ You understood **Time Complexity (TC)** and **Space Complexity (SC)**.
- ✅ You wrote **clean, efficient, and professional code**.
- ✅ This is exactly how FAANG engineers approach coding problems.

### 💡 Pro Tip:
👉 Always start with the **brute force** approach in interviews.
👉 Then optimize your solution to a **better approach**.
👉 Finally, hit the **optimal solution** with **clean code**.

---
