# 🚀 Day 15: Search an Element in an Array

## ✅ Problem Statement
You are given an integer array **arr[]** of size **N** and an integer **target**.

👉 Your task is to **search the target element in the array** and **return its index** (if found). If not found, return **-1**.

### 📊 Example Input & Output
| Input Array | Target Element | Output Index |
|-------------|----------------|-------------|
| {1, 2, 3, 4, 5} | 4 | 3 |
| {5, 6, 7, 8, 9} | 6 | 1 |
| {10, 20, 30, 40} | 25 | -1 |

---

## 💎 Approach 1: Brute Force Solution

### 💡 Logic:
- Traverse the array using a single loop.
- Compare each element with the **target element**.
- If found, return the index.
- If the loop ends without finding the element, return **-1**.

---

## ✅ Code (Brute Force Solution)
```java
import java.util.*;

public class SearchElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int target = 4;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}
```

### ✅ Output:
```
Element found at index: 3
```

---

## ✅ Dry Run
| Index | Element | Is it Target? |
|-------|---------|----------------|
| 0     | 1       | ❌ No          |
| 1     | 2       | ❌ No          |
| 2     | 3       | ❌ No          |
| 3     | 4       | ✅ Yes (Answer)|

---

## ✅ Time Complexity
| Operation      | Time Complexity     |
|----------------|--------------------|
| Single Loop    | **O(N)**              |

## ✅ Space Complexity
| Space Used     | Space Complexity     |
|----------------|--------------------|
| No Extra Space | **O(1)**              |

---

## 💎 Approach 2: Better Solution (Using HashMap)

### 💡 Logic:
- Use a **HashMap** to store the element and its index.
- Traverse the array and insert each element in the HashMap.
- Search for the target element using HashMap in **O(1)** time.

---

## ✅ Code (Using HashMap)
```java
import java.util.*;

public class SearchElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int target = 4;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        if(map.containsKey(target)) {
            System.out.println("Element found at index: " + map.get(target));
        } else {
            System.out.println("Element not found");
        }
    }
}
```

### ✅ Output:
```
Element found at index: 3
```

---

## ✅ Time Complexity
| Operation      | Time Complexity     |
|----------------|--------------------|
| Insert in HashMap | **O(N)**              |
| Search in HashMap | **O(1)**              |
| Total            | **O(N)**              |

## ✅ Space Complexity
| Space Used     | Space Complexity     |
|----------------|--------------------|
| HashMap Space  | **O(N)**              |

---

## 💎 Approach 3: Optimal Solution (Using Binary Search)

### 💡 Logic:
- Sort the array (if unsorted).
- Use **Binary Search** to find the target element.
- Binary Search works by reducing the search space by half every iteration.

👉 **Condition for Binary Search:** Array must be **sorted**.

---

## ✅ Code (Binary Search)
```java
import java.util.*;

public class SearchElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int target = 4;

        int low = 0, high = arr.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                return;
            }
            else if(arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        System.out.println("Element not found");
    }
}
```

### ✅ Output:
```
Element found at index: 3
```

---

## ✅ Time Complexity
| Operation      | Time Complexity     |
|----------------|--------------------|
| Sort Array     | **O(N log N)**        |
| Binary Search  | **O(log N)**          |
| Total          | **O(N log N)**        |

## ✅ Space Complexity
| Space Used     | Space Complexity     |
|----------------|--------------------|
| No Extra Space | **O(1)**              |

---

## 📊 Comparison of All Approaches
| Approach      | Time Complexity    | Space Complexity   | Best Choice?  |
|---------------|------------------|--------------------|---------------|
| **Brute Force** | **O(N)**           | **O(1)**           | ❌ Avoid       |
| **HashMap**     | **O(N)**           | **O(N)**           | 👍 Better     |
| **Binary Search** | **O(log N)**      | **O(1)**           | ✅ Best Choice |

---

## 🎉 Why Binary Search Is The Best Solution?
✅ It requires very less time to search the element.
✅ Works efficiently for large input size.
✅ Space complexity is constant **O(1)**.

💎 **Pro Tip:** Always use Binary Search when searching elements in **sorted arrays**.

---

## ✅ 🚀 Conclusion
| Approach      | Time Complexity    | Space Complexity   | Best Choice?  |
|---------------|------------------|--------------------|---------------|
| **Brute Force** | **O(N)**           | **O(1)**           | ❌ Avoid       |
| **HashMap**     | **O(N)**           | **O(N)**           | 👍 Better     |
| **Binary Search** | **O(log N)**      | **O(1)**           | ✅ Best Choice |

🔥 Use **Binary Search** when the array is sorted. If not, sort it first or use a HashMap.

