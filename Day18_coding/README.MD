# Ceiling of a Number in Array

## 📝 Problem Statement
**Given a sorted array of integers and a target value, find the ceiling of that number.**

**Ceiling of a number** is defined as the **smallest element in the array that is greater than or equal to the target value.**

If no ceiling exists (i.e., all elements are smaller than the target), return -1.

---

## 💡 Example

### Example 1
```
Input: arr[] = {2, 3, 5, 9, 14, 16, 18}
       target = 15

Output: 16
```
Explanation: The smallest element that is >= 15 is 16.

---

### Example 2
```
Input: arr[] = {2, 3, 5, 9, 14, 16, 18}
       target = 20

Output: -1
```
Explanation: No element is greater than or equal to 20, hence output is -1.

---

### Example 3
```
Input: arr[] = {2, 3, 5, 9, 14, 16, 18}
       target = 4

Output: 5
```
Explanation: The smallest element that is >= 4 is 5.

---

## 💻 Approach 1: Brute Force Solution

### ✅ Approach:
- Traverse the entire array.
- For each element, check if it is **greater than or equal to the target**.
- Track the minimum element among those greater than or equal to the target.
- If no such element is found, return -1.

### 💡 Code:
```java
public class CeilingNumber {
    public static int findCeiling(int[] arr, int target) {
        int ceiling = Integer.MAX_VALUE;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= target && arr[i] < ceiling) {
                ceiling = arr[i];
                found = true;
            }
        }

        return found ? ceiling : -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        System.out.println(findCeiling(arr, target));
    }
}
```

### ⏩ Time Complexity:
```
O(N)  -> Where N is the size of the array
```

### ⏩ Space Complexity:
```
O(1)  -> Constant space as no extra space is used.
```

---

## 💻 Approach 2: Better Solution (Sort + Binary Search)

### ✅ Approach:
- Since the array is already sorted, apply **Binary Search**.
- Use **start** and **end** pointers.
- If `arr[mid] >= target`, store `mid` as a potential ceiling and move left.
- If `arr[mid] < target`, move right.
- After the loop, return the ceiling value.

### 💡 Code:
```java
public class CeilingNumber {
    public static int findCeiling(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int ceiling = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] >= target) {
                ceiling = arr[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ceiling;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        System.out.println(findCeiling(arr, target));
    }
}
```

### ⏩ Time Complexity:
```
O(log N) -> Binary Search Time Complexity
```

### ⏩ Space Complexity:
```
O(1) -> Constant space, no extra space used.
```

---

## ✅ Dry Run Example
**Input:**
```
arr[] = {2, 3, 5, 9, 14, 16, 18}
target = 15
```

| Start | End | Mid | arr[Mid] | Action        |
|-------|-----|-----|----------|---------------|
| 0     | 6   | 3   | 9        | Move Right    |
| 4     | 6   | 5   | 16       | Store 16, Move Left |
| 4     | 4   | 4   | 14       | Move Right    |

**Answer: 16**

---

## ✅ Edge Cases
1. **If the target is smaller than the first element:** Return the first element.
2. **If the target is greater than the last element:** Return -1.
3. **If the target itself exists in the array:** Return the same element.

---

## 🚀 Conclusion
- The **brute force** approach took O(N) time complexity.
- The **optimal approach** reduced it to O(log N) using Binary Search.
- **Space complexity** in all approaches is constant O(1).
- Always use **Binary Search** when dealing with sorted arrays and searching for upper bounds like **Ceiling/Floor**.

✅ **This problem is a classic example of Binary Search and is commonly asked in interviews.**

