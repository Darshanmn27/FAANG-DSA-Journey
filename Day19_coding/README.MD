# Floor of a Number in a Sorted Array

## 📜 Problem Statement
Given a sorted array of integers **arr[]** and a target value **target**, your task is to find the **floor value** of the target.

👉 **Floor of a number** is defined as the **greatest element** in the array **less than or equal** to the target.

### ✅ Constraints
- The array is sorted in ascending order.
- The array may contain duplicate elements.
- If no floor exists, return -1.

## 📊 Example Input & Output

| Input Array | Target | Floor of Target |
|-------------|--------|-----------------|
| {1, 2, 8, 10, 10, 12, 19} | 5      | 2               |
| {1, 2, 8, 10, 10, 12, 19} | 20     | 19              |
| {1, 2, 8, 10, 10, 12, 19} | 0      | -1              |

---

## 💡 Approach 1: Brute Force Solution (Linear Search)
### ✅ Logic
- Traverse the entire array.
- Track the maximum element that is less than or equal to the target.
- Return the maximum found element, else return -1.

### 💻 Code (Brute Force Solution)
```java
public class FloorOfNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 10, 10, 12, 19};
        int target = 5;

        int floor = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= target) {
                floor = arr[i];
            }
        }
        System.out.println("Floor of " + target + " is: " + floor);
    }
}
```

### ✅ Dry Run
| Index | Element | Target = 5 | Floor |
|--------|---------|------------|-------|
| 0      | 1       | ✅ <= 5     | 1     |
| 1      | 2       | ✅ <= 5     | 2     |
| 2      | 8       | ❌ > 5      | 2     |
| 3      | 10      | ❌ > 5      | 2     |

👉 **Output:** Floor of 5 is: 2

### ✅ Time Complexity
| Operation  | Time Complexity |
|------------|-----------------|
| Traverse Array | O(N)          |

### ✅ Space Complexity
| Space Used | Space Complexity |
|------------|-----------------|
| No Extra Space | O(1)          |

---

## 💡 Approach 2: Better Solution (Binary Search)
### ✅ Logic
- Since the array is sorted, we can apply **Binary Search**.
- Maintain two pointers, **low** and **high**.
- Track the floor element whenever `arr[mid] <= target`.
- Move to the right side of mid to find a greater but valid floor element.

### 💻 Code (Binary Search)
```java
public class FloorOfNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 10, 10, 12, 19};
        int target = 5;

        int low = 0, high = arr.length - 1;
        int floor = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= target) {
                floor = arr[mid];
                low = mid + 1; // Search on the right side
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Floor of " + target + " is: " + floor);
    }
}
```

### ✅ Dry Run
| Low | High | Mid | arr[mid] | Comparison |
|------|------|-----|----------|------------|
| 0    | 6    | 3   | 10       | 10 > 5     |
| 0    | 2    | 1   | 2        | 2 <= 5     |
| 2    | 2    | 2   | 8        | 8 > 5      |

👉 **Output:** Floor of 5 is: 2

### ✅ Time Complexity
| Operation         | Time Complexity |
|------------------|-----------------|
| Binary Search     | O(log N)         |

### ✅ Space Complexity
| Space Used       | Space Complexity |
|-----------------|-----------------|
| No Extra Space   | O(1)             |

---

## 💎 Approach 3: Optimal Solution (Handling Edge Cases)

### ✅ Logic
- Same as Binary Search.
- Additionally handle edge cases like:
  - If target < arr[0] → Return -1
  - If target >= arr[N-1] → Return arr[N-1]

### 💻 Code (Optimal Solution)
```java
public class FloorOfNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 10, 10, 12, 19};
        int target = 5;

        if (target < arr[0]) {
            System.out.println("Floor of " + target + " is: -1");
            return;
        }

        int low = 0, high = arr.length - 1;
        int floor = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= target) {
                floor = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Floor of " + target + " is: " + floor);
    }
}
```

### ✅ Time Complexity
| Operation         | Time Complexity |
|------------------|-----------------|
| Binary Search     | O(log N)         |

### ✅ Space Complexity
| Space Used       | Space Complexity |
|-----------------|-----------------|
| No Extra Space   | O(1)             |

### ✅ Edge Cases
| Target  | Floor Value  |
|---------|---------------|
| Less than Min Value | -1         |
| Greater than Max Value | Max Value |

---

## 📊 Comparison of All Approaches
| Approach            | Time Complexity     | Space Complexity |
|-------------------|--------------------|-----------------|
| **Brute Force**     | O(N)                | O(1)             |
| **Binary Search**   | O(log N)            | O(1)             |
| **Optimal**         | O(log N)            | O(1)             |

## 🚀 Conclusion
- ✅ The Brute Force approach is inefficient for large arrays.
- ✅ Binary Search is the optimal solution with **O(log N)** time complexity.
- ✅ This solution handles edge cases like target being smaller or larger than the array elements.

👉 💯 Best Practice: Always use **Binary Search** when the array is sorted.

---

