# Rearrange Array in Increasing-Decreasing Order

## 🚀 Problem Statement
Given an array of **N** integers, rearrange the array such that:
- The first half of the array is sorted in **increasing order**.
- The second half of the array is sorted in **decreasing order**.

### 🔹 Example 1:
**Input:**  
```
n = 6
a[] = {5, 2, 9, 1, 6, 3}
```
**Output:**  
```
1 2 3 9 6 5
```

### 🔹 Example 2:
**Input:**  
```
n = 5
a[] = {8, 7, 2, 4, 5}
```
**Output:**  
```
2 4 5 8 7
```

---

## 💡 Approach
1. **Sort the array** in increasing order.
2. **Divide the array** into two parts:
   - First half remains sorted in ascending order.
   - Second half is reversed to get descending order.
3. **Merge the two halves** to get the final output.

### 🛠️ Algorithm:
1. Sort the given array.
2. Compute the middle index: `mid = n / 2` (if `n` is odd, consider `ceil(n/2)`).
3. Store the first half as-is.
4. Reverse the second half.
5. Print or return the modified array.

---

## 📌 Code Implementation (Java)
```java
import java.util.*;

public class RearrangeArray {
    public static void rearrangeArray(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int mid = (n + 1) / 2;
        
        // Print first half (increasing order)
        for (int i = 0; i < mid; i++) {
            System.out.print(arr[i] + " ");
        }
        
        // Print second half (decreasing order)
        for (int i = n - 1; i >= mid; i--) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6, 3};
        rearrangeArray(arr);
    }
}
```

---

## 📝 Complexity Analysis
- **Sorting the array:** `O(N log N)` (Using quicksort or mergesort internally)
- **Printing the array:** `O(N)`
- **Overall Complexity:** `O(N log N)`, which is efficient for large arrays.

---

## 🔥 Edge Cases Considered
✔️ Arrays with duplicate elements.  
✔️ Already sorted arrays.  
✔️ Arrays with an odd number of elements.  
✔️ Arrays with negative numbers.

