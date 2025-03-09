# 🚀 Day 4 - Factorial of a Number & Leap Year Check

## 📌 Problem 1: Factorial of a Number
### **Problem Statement:**
Write a Java program to calculate the **Factorial of a given number** using different approaches.

### ✅ Approach 1: Using Iterative Method
```java
import java.util.Scanner;

public class FactorialIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int fact = 1;
        for(int i=1; i<=num; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
```

### ✅ Time & Space Complexity
| Method      | Time Complexity | Space Complexity |
|-------------|----------------|-----------------|
| Iterative   | O(N)            | O(1)            |

---

### ✅ Approach 2: Using Recursion
```java
public class FactorialRecursion {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }

    static int factorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
```

### ✅ Time & Space Complexity
| Method      | Time Complexity | Space Complexity |
|-------------|----------------|-----------------|
| Recursion   | O(N)            | O(N) (stack space)|

---

### ✅ Approach 3: Using Java Streams (Lambda Expression)
```java
import java.util.stream.IntStream;

public class FactorialUsingStream {
    public static void main(String[] args) {
        int num = 5;
        int factorial = IntStream.rangeClosed(1, num)
                         .reduce(1, (a, b) -> a * b);
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
```

### ✅ Time & Space Complexity
| Method      | Time Complexity | Space Complexity |
|-------------|----------------|-----------------|
| Streams     | O(N)            | O(1)            |

---

### ✅ Test Cases
| Input Number | Expected Output |
|-------------|-----------------|
| 5           | 120               |
| 0           | 1                 |
| 1           | 1                 |
| 10          | 3628800           |

---


## 📌 Problem 2: Leap Year Check
### **Problem Statement:**
Write a Java program to check whether a **given year is a Leap Year or not** using different approaches.

### ✅ Approach 1: Using Simple Conditions
```java
public class LeapYear {
    public static void main(String[] args) {
        int year = 2024;
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
```

### ✅ Time & Space Complexity
| Method      | Time Complexity | Space Complexity |
|-------------|----------------|-----------------|
| Simple IF Condition | O(1)      | O(1)            |

---

### ✅ Approach 2: Using Nested If Conditions
```java
public class LeapYearNested {
    public static void main(String[] args) {
        int year = 2024;

        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    System.out.println(year + " is a Leap Year.");
                } else {
                    System.out.println(year + " is not a Leap Year.");
                }
            } else {
                System.out.println(year + " is a Leap Year.");
            }
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
```

### ✅ Time & Space Complexity
| Method      | Time Complexity | Space Complexity |
|-------------|----------------|-----------------|
| Nested IF   | O(1)            | O(1)            |

---

### ✅ Approach 3: Using DateTime API (java.time)
```java
import java.time.Year;

public class LeapYearUsingDateTime {
    public static void main(String[] args) {
        int year = 2024;
        boolean isLeap = Year.of(year).isLeap();
        System.out.println(year + " is a Leap Year? " + isLeap);
    }
}
```

### ✅ Time & Space Complexity
| Method      | Time Complexity | Space Complexity |
|-------------|----------------|-----------------|
| DateTime API| O(1)            | O(1)            |

---

### ✅ Test Cases
| Year  | Expected Output |
|-------|-----------------|
| 2024  | true             |
| 1900  | false            |
| 2000  | true             |
| 2100  | false            |
| 2020  | true             |

---
