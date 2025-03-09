# 🔥 Search Element in Rotated Sorted Array (Using Binary Search)

## 📜 Problem Statement
Given a **rotated sorted array** of distinct integers `arr[]` and a target value `target`, write a function to **search the target in the array**.

The array is sorted in ascending order, but it has been rotated **at some pivot** unknown to you. Your task is to find the index of the target if it exists, otherwise return -1.

👉 **You must solve it in O(log N) time complexity.**

### ✅ Constraints
- Array is rotated at some pivot (unknown).
- Array elements are distinct.
- You need to find the target index.
- If the target does not exist, return -1.

---

## 📊 Example Input & Output

| Input Array      | Target | Output (Index) |
|-----------------|--------|----------------|
| [4,5,6,7,0,1,2] | 0      | 4              |
| [4,5,6,7,0,1,2] | 3      | -1             |
| [1]             | 0      | -1             |

---

## 💡 Approach 1: Brute Force Solution (Linear Search)

### ✅ Logic
- Traverse the entire array.
- Compare each element with the target.
- If found, return the index.
- Otherwise, return -1.

### 💻 Code (Brute Force Solution)
```java
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}
```

### ✅ Dry Run
| Index | Element | Target = 0 | Found?  |
|-------|---------|------------|--------|
| 0     | 4       | ❌         | No     |
| 1     | 5       | ❌         | No     |
| 2     | 6       | ❌         | No     |
| 3     | 7       | ❌         | No     |
| 4     | 0       | ✅         | Yes    |

👉 **Output:** Element found at index: 4

### ✅ Time Complexity
| Operation     | Time Complexity |
|---------------|-----------------|
| Traverse Array | O(N)            |

### ✅ Space Complexity
| Space Used | Space Complexity |
|------------|-----------------|
| No Extra Space | O(1)          |

---

## 💡 Approach 2: Better Solution (Divide and Conquer)

### ✅ Logic
- Identify the pivot where the array is rotated.
- Apply Binary Search in two halves of the array.
- If found, return the index.
- Otherwise, return -1.

### 💻 Code (Divide and Conquer Solution)
```java
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int index = search(arr, target);
        System.out.println("Element found at index: " + index);
    }

    public static int search(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[low] <= arr[mid]) {
                if (target >= arr[low] && target <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target >= arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
```

### ✅ Dry Run
| Low | High | Mid | arr[mid] | Comparison          | Result   |
|-----|------|-----|----------|--------------------|----------|
| 0   | 6    | 3   | 7        | 7 > target          | Search left |
| 4   | 6    | 5   | 1        | 1 < target          | Search right |
| 4   | 4    | 4   | 0        | 0 == target         | Found     |

👉 **Output:** Element found at index: 4

### ✅ Time Complexity
| Operation       | Time Complexity     |
|----------------|---------------------|
| Binary Search  | O(log N)             |

### ✅ Space Complexity
| Space Used       | Space Complexity   |
|-----------------|--------------------|
| No Extra Space   | O(1)               |

---

## 💡 Approach 3: Optimal Solution (Modified Binary Search)

### ✅ Logic
- Find the pivot where the array is rotated.
- Perform Binary Search on the two halves.
- If found, return the index. Otherwise, return -1.

### 💻 Code (Optimal Solution)
```java
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int index = search(arr, target);
        System.out.println("Element found at index: " + index);
    }

    public static int search(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[low] <= arr[mid]) {
                if (target >= arr[low] && target <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target >= arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
```

### ✅ Time Complexity
| Operation     | Time Complexity |
|---------------|-----------------|
| Binary Search | O(log N)        |

### ✅ Space Complexity
| Space Used     | Space Complexity |
|----------------|-----------------|
| No Extra Space | O(1)             |

---

## 💎 Comparison of All Approaches
| Approach     | Time Complexity     | Space Complexity |
|-------------|-------------------|-----------------|
| **Brute**    | O(N)                | O(1)            |
| **Better**   | O(log N)            | O(1)            |
| **Optimal**  | O(log N)            | O(1)            |

---