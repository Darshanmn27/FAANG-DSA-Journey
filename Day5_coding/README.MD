# 🚀 Day 1: Prime Number Check in Java

## 📜 Problem Statement
Given an integer **N**, write a program to check whether the number is **Prime or Not**.

A **Prime Number** is a number that is only divisible by **1** and **itself**. (Example: 2, 3, 5, 7, 11, 13, 17, 19...)

You need to implement the solution using **four different approaches**:
- ✅ **Brute Force Approach**
- ✅ **Better Approach**
- ✅ **Optimal Approach**
- ✅ **Most Optimal Approach (6k±1 Rule)**

---

## 💡 Approach 1: Brute Force (Dividing By All Numbers)

### ✅ Explanation
- Check if the number **N** is divisible by any number from **1 to N**.
- Count the number of divisors.
- If the divisor count == 2 → Prime Number.
- Else → Not a Prime Number.

### 💻 Code
```java
import java.util.*;
public class Brute_checkprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        
        if(count == 2) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is NOT a Prime Number");
        }
    }
}
```

### ⏩ Time Complexity (TC)
- **O(N)** → Iterating from **1 to N**.

### ⏩ Space Complexity (SC)
- **O(1)** → Constant space.

### ❌ Why Is This Approach Not Recommended?
- 💻 It takes too long for large numbers like **10^9**.
- 😢 Highly inefficient.

---

## 💎 Approach 2: Better Approach (Iterating Till N/2)

### ✅ Explanation
- A number **N** cannot have any factor beyond **N/2** except itself.
- So, iterate only till **N/2** to reduce the complexity.

### 💻 Code
```java
import java.util.*;
public class Better_checkprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int count = 0;
        for(int i = 1; i <= n/2; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        
        if(count == 1) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is NOT a Prime Number");
        }
    }
}
```

### ⏩ Time Complexity (TC)
- **O(N/2)** → Reduced complexity.

### ⏩ Space Complexity (SC)
- **O(1)** → Constant space.

### ❌ Why Is This Approach Still Not Good?
- 🤦‍♂️ It still takes **half the time** but not efficient for large numbers.

---

## 💎 Approach 3: Optimal Approach (Iterating Till √N)

### ✅ Explanation
- Any factor of **N** must appear in a pair.
- For any factor **i**, there exists a factor **N/i**.
- Therefore, **no need to check beyond √N**.

### 💻 Code
```java
import java.util.*;
public class Optimal_check_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        boolean isPrime = true;
        if(n == 1) {
            isPrime = false;
        }
        
        for(int i = 2; i*i <= n; i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        if(isPrime) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is NOT a Prime Number");
        }
    }
}
```

### ⏩ Time Complexity (TC)
```sql
for(int i = 2; i*i <= n; i++)
       --> Loop runs only √N times
TC = O(√N)
```

### ⏩ Space Complexity (SC)
- **O(1)** → Constant space.

### 💯 Why Is This Approach Best?
- ✅ **Reduced Time Complexity to O(√N)** 💯🔥
- ✅ Perfect for checking Prime for very large numbers like:
  - **10^6 (1 million)** → Checked in milliseconds. 😎🚀
  - **10^9 (1 billion)** → Still very fast. 💯🔥

---

## 💎 Approach 4: Most Optimal Approach (Using 6k±1 Rule)

### ✅ Explanation
- All Prime Numbers > 3 can be represented in the form of **6k±1**.
- So, instead of checking every number, check only:
  ```java
  i = 5; i*i <= n; i += 6
  ```
- This reduces unnecessary iterations.

### 💻 Code
```java
import java.util.*;
public class Optimal2isprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        if(n == 1) {
            System.out.println(n + " is NOT a Prime Number");
            return;
        }
        if(n == 2 || n == 3) {
            System.out.println(n + " is a Prime Number");
            return;
        }
        if(n % 2 == 0 || n % 3 == 0) {
            System.out.println(n + " is NOT a Prime Number");
            return;
        }
        
        for(int i = 5; i*i <= n; i += 6) {
            if(n % i == 0 || n % (i+2) == 0) {
                System.out.println(n + " is NOT a Prime Number");
                return;
            }
        }
        
        System.out.println(n + " is a Prime Number");
    }
}
```

### ⏩ Time Complexity (TC)
- **O(√N)** → Reduced even further.

### ⏩ Space Complexity (SC)
- **O(1)** → Constant space.

### 💯 Why Is This The Most Optimal?
- 🚀 Handles large values up to **10^18**.
- ✅ Perfect for competitive coding & FAANG interviews.

---

## 🎯 Final Comparison
| Approach     | Time Complexity | Space Complexity | Best Use Case             |
|-------------|----------------|-----------------|---------------------------|
| **Brute Force**  | O(N)            | O(1)           | Small numbers             |
| **Better Approach** | O(N/2)         | O(1)           | Moderate numbers          |
| **Optimal Approach** | O(√N)          | O(1)           | Large numbers             |
| **Most Optimal** | O(√N/6)        | O(1)           | Competitive coding        |

---

## 💡 Key Takeaway
- 🚀 Always optimize from Brute → Better → Optimal.
- ✅ Use **6k±1** rule for large prime numbers.
- 💯 Perfect code for FAANG and product-based companies.

