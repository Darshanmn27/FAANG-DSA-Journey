# 🚀 Day 13: Mastering Bitwise Operators in Java

## 📌 Overview
In this document, we will explore the most powerful and performance-efficient concept in programming - **Bitwise Operators**. Bitwise operators are often used in competitive programming, system programming, and low-level tasks. Understanding these operators is a game-changer for technical interviews.

---

## ✅ Bitwise Operators and Their Functionality

| Operator | Symbol | Description |
|-----------|--------|-------------|
| **AND**   | `&`    | Sets each bit to 1 if both bits are 1. |
| **OR**    | `|`    | Sets each bit to 1 if one of the bits is 1. |
| **XOR**   | `^`    | Sets each bit to 1 if only one of the bits is 1. |
| **NOT**   | `~`    | Inverts all the bits (one's complement). |
| **Left Shift** | `<<`   | Shifts bits to the left by a specified number of positions. |
| **Right Shift** | `>>`   | Shifts bits to the right by a specified number of positions. |
| **Unsigned Right Shift** | `>>>` | Shifts bits to the right and fills 0 from the left. |

---

## ✅ Two's Complement (for Negative Numbers)
- In **Java**, negative numbers are represented using **Two's Complement**.
- The **Most Significant Bit (MSB)** determines if the number is **positive (0)** or **negative (1)**.
- Example:

| Decimal | Binary Representation (32-bit) |
|---------|-------------------------------|
| +5      | 00000000000000000000000000000101 |
| -5      | 11111111111111111111111111111011 |

---

## ✅ Coding Questions Using Bitwise Operators

### 1. **Check if a Number is Positive or Negative Using MSB**

#### 💻 Code
```java
public class CheckSign {
    public static void main(String[] args) {
        int num = -5;
        if ((num >> 31) == 0) {
            System.out.println("Positive Number");
        } else {
            System.out.println("Negative Number");
        }
    }
}
```

#### ✅ Time Complexity: O(1)
#### ✅ Space Complexity: O(1)

#### ✅ Test Cases
| Input | Output |
|-------|--------|
| 5     | Positive Number |
| -5    | Negative Number |
| 0     | Positive Number |

---

### 2. **Check if a Number is Even or Odd Using Bitwise AND**

#### 💻 Code
```java
public class CheckEvenOdd {
    public static void main(String[] args) {
        int num = 5;
        if ((num & 1) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
```

#### ✅ Time Complexity: O(1)
#### ✅ Space Complexity: O(1)

#### ✅ Test Cases
| Input | Output |
|-------|--------|
| 4     | Even Number |
| 5     | Odd Number |
| 0     | Even Number |

---

### 3. **Check if a Number is a Power of Two**

#### 💻 Code
```java
public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8));
        System.out.println(isPowerOfTwo(7));
    }
}
```

#### ✅ Time Complexity: O(1)
#### ✅ Space Complexity: O(1)

#### ✅ Test Cases
| Input | Output |
|-------|--------|
| 8     | true |
| 7     | false |
| 1     | true |

---

### 4. **Count Set Bits in a Number (Hamming Weight)**

#### 💻 Code
```java
public class CountSetBits {
    public static int countBits(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1);
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countBits(5));
    }
}
```

#### ✅ Time Complexity: O(logN)
#### ✅ Space Complexity: O(1)

#### ✅ Test Cases
| Input | Output |
|-------|--------|
| 5     | 2      |
| 7     | 3      |
| 9     | 2      |

---

### 5. **Swap Two Numbers Without Using Temp Variable (Using XOR)**

#### 💻 Code
```java
public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5, b = 3;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
```

#### ✅ Time Complexity: O(1)
#### ✅ Space Complexity: O(1)

#### ✅ Test Cases
| Input  | Output |
|--------|--------|
| 5, 3   | a: 3, b: 5 |
| 10, 20 | a: 20, b: 10 |

---

## ✅ Summary

| Question  | Time Complexity | Space Complexity |
|-----------|-----------------|-----------------|
| Check Positive/Negative Number | O(1)            | O(1)          |
| Check Even/Odd Number         | O(1)            | O(1)          |
| Check Power of Two            | O(1)            | O(1)          |
| Count Set Bits                | O(logN)         | O(1)          |
| Swap Two Numbers              | O(1)            | O(1)          |

---

## ✅ Key Notes for Interviews
1. **Bitwise AND (`&`)** is mostly used to check even/odd numbers.
2. **Bitwise XOR (`^`)** can swap two numbers without any temporary variable.
3. **Right Shift (`>>`)** with 31 bits can determine if a number is positive or negative.
4. **Power of Two** can be checked using `(n & (n-1)) == 0`.
5. Counting Set Bits is one of the most common bitwise problems in technical interviews.
