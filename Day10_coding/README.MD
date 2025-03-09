# 🚀 Day 10: Check if a Number is a Perfect Square or Not

## 📜 Problem Statement

Given an integer **N**, write a program to **check whether the number is a Perfect Square or not**.

A **Perfect Square** is a number that can be expressed as the **square of an integer**.

### ✅ Example 1:

```
Input: N = 25
Output: Yes, it's a Perfect Square
Explanation: 5 * 5 = 25
```

### ✅ Example 2:

```
Input: N = 20
Output: No, it's not a Perfect Square
Explanation: No integer squared gives 20.
```

---

## 💡 Approach 1: Brute Force (Iterate Until N)

### ✅ Explanation

- Traverse from **1 to N**.
- Check if **i * i == N**.
- If found, it's a Perfect Square.
- Otherwise, it's not.

### 💻 Code

```java
public class PerfectSquare_BruteForce {
    public static void main(String[] args) {
        int N = 25;
        boolean isPerfectSquare = false;

        for (int i = 1; i <= N; i++) {
            if (i * i == N) {
                isPerfectSquare = true;
                break;
            }
        }

        if (isPerfectSquare) {
            System.out.println(N + " is a Perfect Square.");
        } else {
            System.out.println(N + " is not a Perfect Square.");
        }
    }
}
```

### ⏩ Time Complexity (TC)
- **O(N)** → Iterates from 1 to N.

### ⏩ Space Complexity (SC)
- **O(1)** → Constant space.

---

## 💎 Approach 2: Binary Search (Optimal Solution)

### ✅ Explanation

- Use Binary Search from **1 to N**.
- Check mid * mid == N.
- If true, it's a Perfect Square.
- Otherwise, move left or right.

### 💻 Code

```java
public class PerfectSquare_Optimal {
    public static boolean isPerfectSquare(int N) {
        if (N < 1) return false;

        int left = 1, right = N;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid * mid == N) {
                return true;
            } else if (mid * mid < N) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int N = 25;
        System.out.println(isPerfectSquare(N));
    }
}
```

### ⏩ Time Complexity (TC)
- **O(log N)** → Binary Search.

### ⏩ Space Complexity (SC)
- **O(1)** → Constant space.

---

## 💎 Key Takeaways

| Approach        | Time Complexity (TC) | Space Complexity (SC) | Efficiency                |
| --------------- | -------------------- | --------------------- | ------------------------- |
| **Brute Force** | O(N)                 | O(1)                  | Very slow                 |
| **Optimal**     | O(log N)             | O(1)                  | Best approach             |


#  Check if a Number is an Ugly Number

## 📜 Problem Statement

Given an integer **N**, write a program to **check whether the number is an Ugly Number or not**.

An **Ugly Number** is a number whose **prime factors are only 2, 3, or 5**.

### ✅ Example 1:

```
Input: N = 6
Output: Yes, it's an Ugly Number
Explanation: 6 = 2 * 3
```

### ✅ Example 2:

```
Input: N = 14
Output: No, it's not an Ugly Number
Explanation: 14 has prime factor 7.
```

---

## 💡 Approach 1: Brute Force (Divide By Prime Factors)

### ✅ Explanation

- Divide N by **2, 3, or 5** until not divisible.
- If result == 1 → Ugly Number.
- Otherwise → Not an Ugly Number.

### 💻 Code

```java
public class UglyNumber_BruteForce {
    public static boolean isUgly(int N) {
        if (N <= 0) return false;

        while (N % 2 == 0) N /= 2;
        while (N % 3 == 0) N /= 3;
        while (N % 5 == 0) N /= 5;

        return N == 1;
    }

    public static void main(String[] args) {
        int N = 6;
        System.out.println(isUgly(N));
    }
}
```

### ⏩ Time Complexity (TC)
- **O(log N)** → Logarithmic division.

### ⏩ Space Complexity (SC)
- **O(1)** → Constant space.

---

## 💎 Approach 2: Optimized (Recursive Approach)

### ✅ Explanation

- Use Recursion to divide by **2, 3, 5**.
- Base case: If N == 1 → Ugly Number.
- Else, divide and check recursively.

### 💻 Code

```java
public class UglyNumber_Optimal {
    public static boolean isUgly(int N) {
        if (N <= 0) return false;
        if (N == 1) return true;

        if (N % 2 == 0) return isUgly(N / 2);
        if (N % 3 == 0) return isUgly(N / 3);
        if (N % 5 == 0) return isUgly(N / 5);

        return false;
    }

    public static void main(String[] args) {
        int N = 6;
        System.out.println(isUgly(N));
    }
}
```

### ⏩ Time Complexity (TC)
- **O(log N)** → Recursive division.

### ⏩ Space Complexity (SC)
- **O(log N)** → Recursive stack.

---

## 💎 Key Takeaways

| Approach        | Time Complexity (TC) | Space Complexity (SC) | Efficiency                   |
| --------------- | -------------------- | --------------------- | ----------------------------- |
| **Brute Force** | O(log N)             | O(1)                  | Slow but acceptable           |
| **Optimal**     | O(log N)             | O(log N)              | Best approach (Recursive)    |

---

## 🎓 Pro Tip (For Interviews)

- ✅ Always ask if **1 is considered an Ugly Number**.
- ✅ Use Recursive Method if allowed.
- ✅ Mention Time and Space Complexity.

---

