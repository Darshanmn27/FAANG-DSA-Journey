# 🚀 Product of Array Except Self

## ✅ Problem Statement
You are given an integer array `arr[]` of size `N`. Your task is to return a new array such that each element at index `i` is the **product of all elements** in the array **except itself**.

👉 **Constraints:**
- Do not use **division**.
- Solve in **O(N)** time if possible.

---

## 📊 Example Input & Output
| Input Array   | Output Array |
|--------------|--------------|
| `{1, 2, 4, 6}` | `{48, 24, 12, 8}` |
| `{3, 2, 1}`    | `{2, 3, 6}`    |
| `{5, 0, 2, 3}` | `{0, 30, 0, 0}` |

---

## 💻 Approach 1: Brute Force Solution (O(N^2))

### 💡 Logic:
- Use two loops:
  - Outer loop iterates through each element.
  - Inner loop multiplies all elements except the current one.
- Store results in a new array.

### ✅ Code (Brute Force Solution)
```java
import java.util.*;
public class ProductExceptSelf {
    public static void productBruteForce() {
        int arr[] = {1, 2, 4, 6};
        int n = arr.length;
        int newarr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            int p = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    p *= arr[j];
                }
            }
            newarr[i] = p;
        }
        System.out.println(Arrays.toString(newarr));
    }
    public static void main(String[] args) {
        productBruteForce();
    }
}
```

### ✅ Time Complexity:
| Operation    | Time Complexity  |
|-------------|-----------------|
| Nested Loops | O(N^2)          |
| **Total**    | O(N^2)          |

### ✅ Space Complexity:
- Extra array `newarr[]` = **O(N)**.
- Total Space: **O(N)**.

---

## 💎 Approach 2: Better Solution (Using Prefix & Suffix Arrays)

### 💡 Logic:
- Compute **prefix product** for each element.
- Compute **suffix product** for each element.
- Multiply **prefix[i] × suffix[i]** to get the final answer.

### ✅ Code (Using Prefix & Suffix Arrays)
```java
import java.util.*;
public class ProductExceptSelf {
    public static void productBetter() {
        int arr[] = {1, 2, 4, 6};
        int n = arr.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        int result[] = new int[n];
        
        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * arr[i - 1];
        }
        
        suffix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * arr[i + 1];
        }
        
        for (int i = 0; i < n; i++) {
            result[i] = prefix[i] * suffix[i];
        }
        System.out.println(Arrays.toString(result));
    }
    public static void main(String[] args) {
        productBetter();
    }
}
```

### ✅ Time Complexity:
| Operation      | Time Complexity  |
|---------------|-----------------|
| Prefix Array  | O(N)             |
| Suffix Array  | O(N)             |
| Final Compute | O(N)             |
| **Total**     | O(N)             |

### ✅ Space Complexity:
- Extra arrays `prefix[]`, `suffix[]`, `result[]` = **O(N)**.
- Total Space: **O(N)**.

---

## 🔥 Approach 3: Optimal Solution (Using Single Pass & Two Variables) 💯

### 💡 Logic:
- Instead of separate prefix and suffix arrays, maintain two variables:
  - `leftProduct` for the **left-side multiplication**.
  - `rightProduct` for the **right-side multiplication**.
- First pass: Compute **prefix products** and store in `result[]`.
- Second pass: Multiply `result[i]` by `rightProduct` while updating it.

### ✅ Code (Most Optimal Solution)
```java
import java.util.*;
public class ProductExceptSelf {
    public static void productOptimal() {
        int arr[] = {1, 2, 4, 6};
        int n = arr.length;
        int result[] = new int[n];
        
        Arrays.fill(result, 1);
        
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] *= leftProduct;
            leftProduct *= arr[i];
        }
        
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= arr[i];
        }
        
        System.out.println(Arrays.toString(result));
    }
    public static void main(String[] args) {
        productOptimal();
    }
}
```

### ✅ Time Complexity:
| Operation      | Time Complexity  |
|---------------|-----------------|
| First Pass    | O(N)             |
| Second Pass   | O(N)             |
| **Total**     | O(N)             |

### ✅ Space Complexity:
- Extra space used: **O(1)** (only `leftProduct` & `rightProduct`).
- **In-place modification of `result[]` → O(1) extra space.**

---

## 📊 Comparison of All Approaches
| Approach           | Time Complexity  | Space Complexity  | Best Choice?    |
|-------------------|----------------|-----------------|----------------|
| **Brute Force**  | O(N^2)          | O(N)            | ❌ Avoid       |
| **Better (Prefix & Suffix)** | O(N) | O(N) | 👍 Good Choice |
| **Optimal (Two Variables)** | O(N) | O(1) | ✅ Best Choice |

---

## 🎉 Why the Optimal Approach is Best?
✅ It requires **only two traversals** of the array.
✅ Uses **O(1) extra space** instead of additional arrays.
✅ **Most efficient solution** to solve the problem in linear time.

---

## 🚀 Conclusion
| Approach         | Time Complexity | Space Complexity | Best Choice? |
|----------------|---------------|---------------|-------------|
| **Brute Force** | O(N^2)       | O(N)         | ❌ Avoid    |
| **Prefix & Suffix** | O(N) | O(N) | 👍 Good |
| **Two Variables** | O(N) | O(1) | ✅ Best |

💯 **The optimal approach (Two Variables) is the best choice for solving this problem efficiently.** 🚀

