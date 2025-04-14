# Day 12: Swapping of Two Numbers in 3 Ways

## 📌 Problem Statement
Given two integers `a` and `b`, the task is to swap the values of the two integers without affecting any other variables.

You need to solve this problem using **3 different approaches:**
1. **Using a Temporary Variable.**
2. **Without Using a Temporary Variable.**
3. **Using Bitwise XOR Operator.**

You also need to provide the **time complexity (TC)** and **space complexity (SC)** for each approach.

---

## ✅ Approach 1: Using Temporary Variable (Brute Force)

### 💡 Approach Explanation
- In this method, we use a temporary variable (`temp`) to store one of the values.
- We then swap the values using the temporary variable.

### 💻 Code
```java
public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before Swapping: a = " + a + ", b = " + b);

        // Swap using temporary variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping: a = " + a + ", b = " + b);
    }
}
```

### ✅ Output
```
Before Swapping: a = 5, b = 10
After Swapping: a = 10, b = 5
```

### 📊 Time and Space Complexity
| Time Complexity  | Space Complexity |
|-----------------|------------------|
| **O(1)**         | **O(1)**         |

**Explanation:** Constant time and constant space as we are using only one temporary variable.

---

## ✅ Approach 2: Without Using Temporary Variable (Better Approach)

### 💡 Approach Explanation
- In this method, we do not use any temporary variable.
- Instead, we use simple arithmetic operations (addition and subtraction) to swap the values.

### 💻 Code
```java
public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before Swapping: a = " + a + ", b = " + b);

        // Swap without using temporary variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping: a = " + a + ", b = " + b);
    }
}
```

### ✅ Output
```
Before Swapping: a = 5, b = 10
After Swapping: a = 10, b = 5
```

### 📊 Time and Space Complexity
| Time Complexity  | Space Complexity |
|-----------------|------------------|
| **O(1)**         | **O(1)**         |

**Explanation:** We only perform **3 arithmetic operations**, so the time complexity is constant.

**Note:** This approach may lead to **integer overflow** in some languages if the sum of `a` and `b` exceeds the integer limit.

---

## ✅ Approach 3: Using Bitwise XOR Operator (Optimal Solution)

### 💡 Approach Explanation
- In this method, we use the bitwise XOR (`^`) operator to swap the numbers.
- XOR has the property that:  
    - `a ^ a = 0`  
    - `a ^ 0 = a`  
    - `a ^ b ^ a = b`
- This property helps us swap two numbers without any temporary variable.

### 💻 Code
```java
public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before Swapping: a = " + a + ", b = " + b);

        // Swap using bitwise XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swapping: a = " + a + ", b = " + b);
    }
}
```

### ✅ Output
```
Before Swapping: a = 5, b = 10
After Swapping: a = 10, b = 5
```

### 📊 Time and Space Complexity
| Time Complexity  | Space Complexity |
|-----------------|------------------|
| **O(1)**         | **O(1)**         |

**Explanation:**
- Bitwise XOR operation takes constant time.
- No extra space is used.
- This approach is highly optimized and is considered the best for swapping two numbers.

---

## ✅ Test Cases
| Test Case No. | Input (a, b) | Expected Output (a, b) |
|----------------|----------------|-----------------------|
| **Test Case 1** | 5, 10            | 10, 5                 |
| **Test Case 2** | -5, 15           | 15, -5                |
| **Test Case 3** | 0, 100           | 100, 0                |
| **Test Case 4** | 25, 25           | 25, 25                |
| **Test Case 5** | Integer.MIN_VALUE, Integer.MAX_VALUE | Integer.MAX_VALUE, Integer.MIN_VALUE |

---

## ✅ Summary
| Approach | Time Complexity | Space Complexity | Notes |
|-----------|----------------|-----------------|-------|
| **Using Temporary Variable** | **O(1)**        | **O(1)**        | Simple but uses extra space.    |
| **Without Using Temporary Variable** | **O(1)** | **O(1)** | May cause integer overflow. |
| **Using Bitwise XOR Operator** | **O(1)**      | **O(1)**      | Most optimized, no extra space. |

---

## 💯 Conclusion
In this problem, you learned **3 different ways** to swap two numbers:
1. ✅ Using a **temporary variable** (traditional method).
2. ✅ Without using a **temporary variable** (by arithmetic operations).
3. ✅ Using **Bitwise XOR Operator** (highly optimized method).

### 💎 Recommendation
👉 Always use the **Bitwise XOR Operator** if you want the **most optimized solution**. 💯🔥
👉 However, if you are in a coding interview, **explain all three methods** to show your in-depth knowledge.

---

## 🚀 Bonus Tip for Interview
💡 **Interviewer may ask:**
> **Why do we use XOR instead of a temporary variable?**

✅ Answer: Using XOR is:
- Highly optimized.
- Does not use extra space.
- Extremely fast in swapping two variables.
- No overflow issues like arithmetic operations.

---

# 📅 Leap Year Checker in Java

This Java program demonstrates **multiple approaches** to determine whether a given year is a **leap year** or not:

1. ✅ Using `if-else` condition
2. ✅ Using the `ternary` operator
3. ✅ Using `LocalDate` from Java's `java.time` package

---

## 🧠 Problem Statement

Determine whether a year is a **leap year** or not.

> A year is a leap year if:
> - It is **divisible by 4** but **not divisible by 100**, OR
> - It is **divisible by 400**

---

## 🚀 Approaches

### ✅ 1. Using `if-else` Condition

```
int year = 100;
if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
{
    System.out.println("given year is leap year");
}
else 
{
    System.out.println("given year is normal year");
}
```
Time Complexity: O(1)

Space Complexity: O(1)

✅ 2. Using Ternary Operator
java
```
int year = 2024;
String result = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                ? "is a Leap Year." 
                : "is not a Leap Year.";
System.out.println(year + " " + result);
```
Time Complexity: O(1)

Space Complexity: O(1)

✅ 3. Using java.time.LocalDate Class
```
int year = 2024;
boolean res = LocalDate.of(year, 1, 1).isLeapYear();
if (res) 
{
    System.out.println(year + " is a leap year.");
} 
else 
{
    System.out.println(year + " is not a leap year.");
}
```
Time Complexity: O(1)

Space Complexity: O(1)

✅ Uses Java's built-in date handling for readability and clarity.

🧾 Full Code
```
import java.time.LocalDate;

public class Leap_year_or_not 
{

    public static void leap_year_using_if_else() 
{
        int year = 100;
if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
{
            System.out.println("given year is leap year");
}
else 
{
            System.out.println("given year is normal year");
       
}
   
}

    public static void checkleap_year_using_ternary() 
{
        System.out.println("check leap year using the ternary operators:");
        int year = 2024;
        String result = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
                        ? "is a Leap Year." 
                        : "is not a Leap Year.";
        System.out.println(year + " " + result);
    }

    public static void check_leap_using_datetimeclass() {
        System.out.println("using the datetime class:");
        int year = 2024;
        boolean res = LocalDate.of(year, 1, 1).isLeapYear();
        if (res) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static void main(String[] args) {
        leap_year_using_if_else();
        checkleap_year_using_ternary();
        // Uncomment this line to use the datetime class approach
        // check_leap_using_datetimeclass();
    }
}
```
💻 Sample Output
given year is normal year
check leap year using the ternary operators:
2024 is a Leap Year.
Note: The third method using LocalDate is not called in main() unless you uncomment the line.

📈 Time and Space Complexity
Approach	Time Complexity	Space Complexity
If-Else Condition	O(1)	O(1)
Ternary Operator	O(1)	O(1)
LocalDate Class (Built-in)	O(1)	O(1)
