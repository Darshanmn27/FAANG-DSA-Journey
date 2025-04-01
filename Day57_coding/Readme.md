# 🚀 Find the Maximum Continuous Increasing Subarray Length

## ✅ Problem Statement
You are given an integer array `arr[]`. Your task is to find the **length of the longest continuous increasing subarray**.

👉 A **continuous increasing subarray** means each element is strictly greater than the previous one.

---

## 📊 Example Input & Output
| Input Array             | Output (Max Length) |
|-------------------------|---------------------|
| `{1, 56, 2, 3, 6, 8}`   | `4`                 |
| `{1, 9, 6, 9, 18, 78}`  | `4`                 |
| `{10, 20, 30, 10, 20}`  | `3`                 |

---

## 💻 Approach 1: Brute Force Solution

### 💡 Logic:
- Consider all possible subarrays and check if they are increasing.
- Track the maximum length of such subarrays.
- This is a **O(N^2)** solution.

### ✅ Code (Brute Force Solution)
```java
public class LongestIncreasingSubarray {
    public static int findLongestIncreasingSubarray(int[] arr) {
        int n = arr.length;
        int maxLength = 1;

        for (int i = 0; i < n; i++) {
            int currentLength = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[j - 1]) {
                    currentLength++;
                } else {
                    break;
                }
            }
            maxLength = Math.max(maxLength, currentLength);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, 56, 2, 3, 6, 8};
        System.out.println("Maximum Length: " + findLongestIncreasingSubarray(arr));
    }
}
```

### ✅ Output:
```
Maximum Length: 4
```

### ✅ Time Complexity:
| Operation     | Time Complexity    |
|--------------|-------------------|
| Outer Loop    | O(N)               |
| Inner Loop    | O(N)               |
| **Total**     | O(N * N) = O(N^2)  |

### ✅ Space Complexity: **O(1)**

---

## 💎 Approach 2: Better Solution (Sliding Window)

### 💡 Logic:
- Use a **two-pointer approach**.
- Keep expanding the window while numbers are increasing.
- When a decrease is found, update `maxLength` and restart the count.
- This reduces the complexity to **O(N)**.

### ✅ Code (Sliding Window)
```java
public class LongestIncreasingSubarray {
    public static int findLongestIncreasingSubarray(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;
        
        int maxLength = 1, currentLength = 1;
        
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }
        
        return Math.max(maxLength, currentLength);
    }

    public static void main(String[] args) {
        int[] arr = {1, 56, 2, 3, 6, 8};
        System.out.println("Maximum Length: " + findLongestIncreasingSubarray(arr));
    }
}
```

### ✅ Output:
```
Maximum Length: 4
```

### ✅ Time Complexity:
| Operation     | Time Complexity    |
|--------------|-------------------|
| Single Loop   | O(N)               |
| **Total**     | O(N)               |

### ✅ Space Complexity: **O(1)**

---

## 🔥 Approach 3: Optimal Solution (Kadane’s Algorithm)

### 💡 Logic:
- This approach is similar to the sliding window but with **Kadane’s Algorithm**.
- We maintain `maxLength` and `currentLength` in a single pass.
- **O(N) time complexity**.

### ✅ Code (Kadane's Algorithm)
```java
public class LongestIncreasingSubarray {
    public static int findLongestIncreasingSubarray(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;
        
        int maxLength = 1, currentLength = 1;
        
        for (int i = 1; i < n; i++) {
            currentLength = (arr[i] > arr[i - 1]) ? currentLength + 1 : 1;
            maxLength = Math.max(maxLength, currentLength);
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, 56, 2, 3, 6, 8};
        System.out.println("Maximum Length: " + findLongestIncreasingSubarray(arr));
    }
}
```

### ✅ Output:
```
Maximum Length: 4
```

### ✅ Time Complexity:
| Operation     | Time Complexity    |
|--------------|-------------------|
| Single Loop   | O(N)               |
| **Total**     | O(N)               |

### ✅ Space Complexity: **O(1)**

---

## 📊 Comparison of All Approaches
| Approach        | Time Complexity  | Space Complexity  | Best Choice?   |
|----------------|-----------------|-------------------|---------------|
| **Brute Force** | O(N^2)           | O(1)              | ❌ Avoid       |
| **Sliding Window** | O(N)          | O(1)              | 👍 Good Choice |
| **Kadane’s Algorithm** | O(N)      | O(1)              | ✅ Best Choice |

---

## 🚀 Conclusion
| Approach        | Time Complexity  | Space Complexity  | Best Choice      |
|----------------|-----------------|-------------------|-----------------|
| **Brute Force** | O(N^2)           | O(1)              | ❌ Avoid        |
| **Sliding Window** | O(N)          | O(1)              | 👍 Good Choice |
| **Kadane’s Algorithm** | O(N)      | O(1)              | ✅ Best Choice |

💯 **Kadane's Algorithm** is the most optimized solution. 🚀

