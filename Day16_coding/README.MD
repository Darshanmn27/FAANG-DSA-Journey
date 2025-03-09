# 🚀 Day 16: Find the First and Last Occurrence of an Element in an Array

## ✅ Problem Statement
You are given an integer array `arr[]` of size **N** and a target element `target`. Your task is to find the **first and last occurrence index** of the target element in the array.

If the target is not found, return `{-1, -1}`.

---

## 📊 Example Input & Output

| Input Array      | Target | Output     |
|----------------|--------|------------|
| {1, 10, 21, 1, 30, 1, 4, 4} | 1      | {0, 5}    |
| {5, 6, 7, 8, 8, 10}  | 8      | {3, 4}    |
| {10, 20, 30, 40}   | 25     | {-1, -1} |

---

## 💻 Approach 1: Brute Force Solution

### 💡 Logic
- Traverse the array twice using two loops.
- In the first loop, find the **first occurrence** of the target.
- In the second loop, find the **last occurrence** of the target.
- Return the result as `{first, last}`.

### ✅ Code (Brute Force Solution)
```java
import java.util.*;

public class FirstLastOccurrence {
    public static void main(String[] args) {
        int arr[] = {1, 10, 21, 1, 30, 1, 4, 4};
        int target = 1;
        int n = arr.length;

        int first = -1, last = -1;
        
        // Find the first occurrence
        for(int i = 0; i < n; i++) {
            if(arr[i] == target) {
                first = i;
                break;
            }
        }
        
        // Find the last occurrence
        for(int i = n-1; i >= 0; i--) {
            if(arr[i] == target) {
                last = i;
                break;
            }
        }
        
        System.out.println("{" + first + ", " + last + "}");
    }
}
```

### ✅ Output:
```
{0, 5}
```

### ✅ Dry Run:
| Element | Index | First Occurrence | Last Occurrence |
|---------|-------|------------------|-----------------|
| 1       | 0     | ✅ 0              |                 |
| 10      | 1     |                  |                 |
| 21      | 2     |                  |                 |
| 1       | 3     |                  |                 |
| 30      | 4     |                  |                 |
| 1       | 5     |                  | ✅ 5           |

### ✅ Time Complexity:
| Operation      | Time Complexity     |
|----------------|--------------------|
| First Loop     | O(N)                 |
| Second Loop    | O(N)                 |
| **Total**      | O(N + N) = O(2N)     |

### ✅ Space Complexity:
| Space Used     | Space Complexity     |
|----------------|--------------------|
| No extra space | O(1)                 |

### 🚨 Why Avoid This?
- This approach traverses the array **twice**, resulting in **O(2N)** time complexity.
- Can we do it in **one traversal**? Yes, let's move to a better approach.

---

## 💻 Approach 2: Better Solution (Single Traversal)

### 💡 Logic
- Traverse the array **once**.
- Track the first occurrence using a variable `first`.
- Track the last occurrence using another variable `last`.
- Return `{first, last}`.

### ✅ Code (Better Solution)
```java
import java.util.*;

public class FirstLastOccurrence {
    public static void main(String[] args) {
        int arr[] = {1, 10, 21, 1, 30, 1, 4, 4};
        int target = 1;
        int n = arr.length;

        int first = -1, last = -1;

        for(int i = 0; i < n; i++) {
            if(arr[i] == target) {
                if(first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        
        System.out.println("{" + first + ", " + last + "}");
    }
}
```

### ✅ Output:
```
{0, 5}
```

### ✅ Dry Run:
| Element | Index | First Occurrence | Last Occurrence |
|---------|-------|------------------|-----------------|
| 1       | 0     | ✅ 0              | ✅ 0           |
| 10      | 1     |                  |                 |
| 21      | 2     |                  |                 |
| 1       | 3     |                  | ✅ 3           |
| 30      | 4     |                  |                 |
| 1       | 5     |                  | ✅ 5           |

### ✅ Time Complexity:
| Operation      | Time Complexity     |
|----------------|--------------------|
| Single Loop    | O(N)                 |

### ✅ Space Complexity:
| Space Used     | Space Complexity     |
|----------------|--------------------|
| No extra space | O(1)                 |

### 🚀 Why Is This Better?
- It uses **single traversal (O(N))** instead of two.
- It still uses **constant space (O(1))**.
- But can we do it faster using Binary Search? Yes! 💯🔥

---

## 💻 Approach 3: Optimal Solution (Binary Search)

### 💡 Logic
- Use **Binary Search** to find the **first occurrence**.
- Use **Binary Search** again to find the **last occurrence**.
- Binary Search reduces time complexity to **O(log N)**.

### ✅ Code (Optimal Solution)
```java
import java.util.*;

public class FirstLastOccurrence {

    public static int firstOccurrence(int arr[], int target) {
        int low = 0, high = arr.length - 1, first = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == target) {
                first = mid;
                high = mid - 1;
            } else if(arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }

    public static int lastOccurrence(int arr[], int target) {
        int low = 0, high = arr.length - 1, last = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if(arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }
}
```

### ✅ Time Complexity:
| Operation      | Time Complexity     |
|----------------|--------------------|
| Binary Search  | O(log N)            |

### ✅ Space Complexity:
| Space Used     | Space Complexity     |
|----------------|--------------------|
| No extra space | O(1)                 |

---

## 🚀 Conclusion
| Approach    | Time Complexity | Space Complexity |
|-------------|-----------------|-------------------|
| Brute Force | O(2N)            | O(1)             |
| Better      | O(N)             | O(1)             |
| Optimal     | O(log N)         | O(1)             |

