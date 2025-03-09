# 📜 Find Lower Bound, Upper Bound, and Total Occurrences in a Sorted Array

## ✅ Problem Statement
Given a **sorted array of integers** and a **target value**, your task is to:

1. **Find the Lower Bound (First Occurrence)** of the target.
2. **Find the Upper Bound (Last Occurrence)** of the target.
3. **Find the Total Number of Occurrences** of the target.

### 📊 Example Input & Output

| Input Array         | Target | Lower Bound (First Occurrence) | Upper Bound (Last Occurrence) | Total Occurrences |
|--------------------|--------|--------------------------------------|------------------------------|-------------------|
| {2, 4, 4, 4, 6, 7} | 4      | 1                                | 3                            | 3                 |
| {1, 2, 3, 4, 5, 5} | 5      | 4                                | 5                            | 2                 |
| {1, 2, 3, 4, 5, 6} | 7      | -1                               | -1                           | 0                 |

---

## 💡 Approach 1: Brute Force Solution
### ✅ Logic
- Traverse the entire array.
- Track the **first and last occurrence** of the target.
- Count the total occurrences.
- This approach works but is inefficient for large arrays.

### 💻 Code (Brute Force Solution)
```java
public class LowerUpperBound {
    public static void main(String[] args) {
        int arr[] = {2, 4, 4, 4, 6, 7};
        int target = 4;

        int firstOccurrence = -1;
        int lastOccurrence = -1;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (firstOccurrence == -1) {
                    firstOccurrence = i;
                }
                lastOccurrence = i;
                count++;
            }
        }

        System.out.println("First Occurrence: " + firstOccurrence);
        System.out.println("Last Occurrence: " + lastOccurrence);
        System.out.println("Total Occurrences: " + count);
    }
}
```

### ✅ Time Complexity
| Operation         | Time Complexity |
|-------------------|-----------------|
| Traverse Array     | O(N)             |

### ✅ Space Complexity
| Space Used         | Space Complexity |
|-------------------|-----------------|
| No Extra Space     | O(1)             |

### ⚠ Drawback
- Inefficient for large arrays.
- Requires traversing the entire array.

---

## 💎 Approach 2: Binary Search (Optimal Solution)
### ✅ Logic
- Use **Binary Search** to find the **first occurrence (Lower Bound)**.
- Use **Binary Search** again to find the **last occurrence (Upper Bound)**.
- The total occurrences = `(last occurrence - first occurrence + 1)`.

### ✅ Steps
1. **Find Lower Bound (First Occurrence)**:
    - Apply binary search and move `high = mid - 1` whenever `arr[mid] == target`.
2. **Find Upper Bound (Last Occurrence)**:
    - Apply binary search and move `low = mid + 1` whenever `arr[mid] == target`.


### 💻 Code (Binary Search)
```java
public class LowerUpperBound {
    public static void main(String[] args) {
        int arr[] = {2, 4, 4, 4, 6, 7};
        int target = 4;

        int firstOccurrence = findFirstOccurrence(arr, target);
        int lastOccurrence = findLastOccurrence(arr, target);

        int totalOccurrences = (firstOccurrence == -1) ? 0 : (lastOccurrence - firstOccurrence + 1);

        System.out.println("First Occurrence: " + firstOccurrence);
        System.out.println("Last Occurrence: " + lastOccurrence);
        System.out.println("Total Occurrences: " + totalOccurrences);
    }

    // Function to find the Lower Bound (First Occurrence)
    static int findFirstOccurrence(int arr[], int target) {
        int low = 0, high = arr.length - 1;
        int first = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                first = mid;
                high = mid - 1; // Keep searching in the left part
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }

    // Function to find the Upper Bound (Last Occurrence)
    static int findLastOccurrence(int arr[], int target) {
        int low = 0, high = arr.length - 1;
        int last = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                last = mid;
                low = mid + 1; // Keep searching in the right part
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }
}
```

### ✅ Dry Run
| Low | High | Mid | arr[mid] | Action         |
|-----|------|-----|----------|----------------|
| 0   | 5    | 2   | 4        | Found, go left  |
| 0   | 1    | 0   | 2        | Move right     |
| 1   | 1    | 1   | 4        | Found, go left  |

👉 First Occurrence = **1**

👉 Last Occurrence = **3**

👉 Total Occurrences = **3**


### ✅ Time Complexity
| Operation     | Time Complexity |
|---------------|-----------------|
| First Occurrence | O(log N)       |
| Last Occurrence  | O(log N)       |
| Total            | O(log N + log N) = O(log N) |

### ✅ Space Complexity
| Space Used | Space Complexity |
|------------|-----------------|
| No Extra Space | O(1)          |


---

## 🧠 Edge Cases
| Case                         | Output              |
|-----------------------------|--------------------|
| Target is less than minimum   | -1, -1, 0          |
| Target is greater than maximum| -1, -1, 0          |
| All elements are same         | first = 0, last = N-1, count = N |
| Single occurrence             | first = last = index |

---

## ✅ Comparison of All Approaches
| Approach     | Time Complexity  | Space Complexity |
|-------------|-----------------|-----------------|
| **Brute Force** | O(N)           | O(1)             |
| **Binary Search** | O(log N)     | O(1)             |

---

## 🚀 Conclusion
- ✅ Binary Search is the most optimal approach for finding **Lower Bound, Upper Bound, and Total Occurrences**.
- ✅ This pattern is frequently asked in FAANG-level coding interviews.
- ✅ **Always apply Binary Search** whenever the array is sorted.

---