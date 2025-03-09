# 🚀 Find the Second Maximum Element in an Array

## ✅ Problem Statement
You are given an integer array **arr[]** of size **N**. Your task is to **find the second maximum (largest) element** in the array.

### 📊 Example Input & Output
| Input Array    | Second Maximum Element |
|----------------|-----------------------|
| {1, 10, 21, 30, 4} | 21                    |
| {5, 5, 5, 5, 5}   | -1 (No second max)    |
| {1, 10, 21, 21, 30} | 21                    |

---

## 💻 Approach 1: Brute Force Solution (O(N^2))
### 💡 Logic:
- Traverse the array.
- For each element, compare it with all other elements to find the maximum.
- Then ignore the maximum and find the second maximum.

### ✅ Code (Brute Force Solution)
```java
import java.util.*;

public class SecondMaximumElement {
    public static void main(String[] args) {
        int arr[] = {1, 10, 21, 30, 4};
        int n = arr.length;

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[j] > max) {
                    secondMax = max;
                    max = arr[j];
                } else if(arr[j] > secondMax && arr[j] != max) {
                    secondMax = arr[j];
                }
            }
        }

        if(secondMax == Integer.MIN_VALUE) {
            System.out.println("No Second Maximum Element");
        } else {
            System.out.println("Second Maximum Element: " + secondMax);
        }
    }
}
```

### ✅ Output:
```
Second Maximum Element: 21
```

### ✅ Dry Run:
| i  | j  | max  | secondMax  |
|----|----|------|------------|
| 0  | 0  | 1    | -2147483648 |
| 0  | 1  | 10   | 1          |
| 0  | 2  | 21   | 10         |
| 0  | 3  | 30   | 21         |
| 0  | 4  | 30   | 21         |

### ✅ Time Complexity:
| Operation     | Time Complexity |
|---------------|-----------------|
| Outer Loop    | O(N)             |
| Inner Loop    | O(N)             |
| Total         | O(N^2)           |

### ✅ Space Complexity:
| Space Used     | Space Complexity |
|----------------|-----------------|
| No extra space | O(1)              |

---

## 💡 Approach 2: Better Solution (Using Sorting)
### 💡 Logic:
- Sort the array in descending order.
- The second maximum element will be at index 1 (if distinct elements).
- If no distinct element exists, return -1.

### ✅ Code (Using Sorting)
```java
import java.util.*;

public class SecondMaximumElement {
    public static void main(String[] args) {
        int arr[] = {1, 10, 21, 30, 4};
        int n = arr.length;

        Arrays.sort(arr);
        int max = arr[n-1];

        for(int i=n-2; i>=0; i--) {
            if(arr[i] != max) {
                System.out.println("Second Maximum Element: " + arr[i]);
                return;
            }
        }

        System.out.println("No Second Maximum Element");
    }
}
```

### ✅ Output:
```
Second Maximum Element: 21
```

### ✅ Time Complexity:
| Operation     | Time Complexity |
|---------------|-----------------|
| Sorting       | O(N log N)       |
| Traversing    | O(N)             |
| Total         | O(N log N)       |

### ✅ Space Complexity:
| Space Used     | Space Complexity |
|----------------|-----------------|
| No extra space | O(1)              |

---

## 🚀 Approach 3: Optimal Solution (Single Traversal)
### 💡 Logic:
- Traverse the array once.
- Track the **maximum** and **second maximum** in a single pass.
- Update both variables accordingly.

### ✅ Code (Optimal Solution)
```java
public class SecondMaximumElement {
    public static void main(String[] args) {
        int arr[] = {1, 10, 21, 30, 4};
        int n = arr.length;

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if(arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        if(secondMax == Integer.MIN_VALUE) {
            System.out.println("No Second Maximum Element");
        } else {
            System.out.println("Second Maximum Element: " + secondMax);
        }
    }
}
```

### ✅ Output:
```
Second Maximum Element: 21
```

### ✅ Dry Run:
| Element | Max | Second Max |
|---------|-----|------------|
| 1       | 1   | -Infinity   |
| 10      | 10  | 1          |
| 21      | 21  | 10         |
| 30      | 30  | 21         |
| 4       | 30  | 21         |

### ✅ Time Complexity:
| Operation     | Time Complexity |
|---------------|-----------------|
| Single Pass   | O(N)             |
| Total         | O(N)             |

### ✅ Space Complexity:
| Space Used     | Space Complexity |
|----------------|-----------------|
| No extra space | O(1)              |

---

## 📊 Comparison of All Approaches
| Approach       | Time Complexity   | Space Complexity | Best Choice? |
|----------------|------------------|-----------------|--------------|
| Brute Force    | O(N^2)             | O(1)            | ❌ Avoid      |
| Sorting        | O(N log N)         | O(1)            | ❌ Average    |
| Optimal        | O(N)               | O(1)            | ✅ Best 💯     |

## 🎉 Why Optimal Solution Is Best?
- ✅ It performs only **one traversal**.
- ✅ It uses **constant space** (O(1)).
- ✅ It is the most efficient and professional approach.

## 💯 Final Recommendation
| Scenario     | Recommended Solution    |
|--------------|------------------------|
| Large Input  | ✅ Optimal Solution     |
| Small Input  | ✅ Sorting (if needed)  |
| Interview    | ✅ Always Optimal Solution |
