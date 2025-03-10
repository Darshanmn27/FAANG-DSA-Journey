# Check if Array is a Subset of Another Array

## 🚀 Problem Statement
Given two arrays **arr1[]** of size **n** and **arr2[]** of size **m**, the task is to check whether **arr2[]** is a subset of **arr1[]** or not.

An array **arr2[]** is said to be a subset of **arr1[]** if each element of **arr2[]** is present in **arr1[]**, regardless of order.

---

## 💡 Example 1:
**Input:**
```
n = 6, m = 4
arr1[] = {11, 1, 13, 21, 3, 7}
arr2[] = {11, 3, 7, 1}
```
**Output:**
```
Yes
```
**Explanation:**
All elements of `arr2[]` are present in `arr1[]`.

---

## 💡 Example 2:
**Input:**
```
n = 6, m = 4
arr1[] = {1, 2, 3, 4, 5, 6}
arr2[] = {1, 2, 4, 9}
```
**Output:**
```
No
```
**Explanation:**
Element `9` of `arr2[]` is not present in `arr1[]`.

---

## 📌 Approach
We will discuss three different approaches to solve the problem:

### 1️⃣ Brute Force Approach (Nested Loop)
- Traverse each element of `arr2[]` and check if it exists in `arr1[]`.
- If any element of `arr2[]` is not found in `arr1[]`, return "No".
- Else, return "Yes".

✅ **Time Complexity:** `O(n*m)`
✅ **Space Complexity:** `O(1)`

#### Code:
```java
public class CheckSubset {
    public static String isSubset(int[] arr1, int n, int[] arr2, int m) {
        for(int i = 0; i < m; i++) {
            boolean found = false;
            for(int j = 0; j < n; j++) {
                if(arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }
            if(!found)
                return "No";
        }
        return "Yes";
    }

    public static void main(String[] args) {
        int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = {11, 3, 7, 1};
        System.out.println(isSubset(arr1, arr1.length, arr2, arr2.length));
    }
}
```

---

### 2️⃣ Better Approach (Using Sorting + Two Pointers)
- Sort both arrays.
- Use two pointers technique to compare elements of both arrays.
- If all elements of `arr2[]` are found in `arr1[]`, return "Yes".
- Else, return "No".

✅ **Time Complexity:** `O(nlogn + mlogm)` (for sorting)
✅ **Space Complexity:** `O(1)`

#### Code:
```java
import java.util.Arrays;

public class CheckSubset {
    public static String isSubset(int[] arr1, int n, int[] arr2, int m) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;
        while(i < n && j < m) {
            if(arr1[i] < arr2[j])
                i++;
            else if(arr1[i] == arr2[j]) {
                i++;
                j++;
            } else {
                return "No";
            }
        }
        return (j == m) ? "Yes" : "No";
    }

    public static void main(String[] args) {
        int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = {11, 3, 7, 1};
        System.out.println(isSubset(arr1, arr1.length, arr2, arr2.length));
    }
}
```

---

### 3️⃣ Optimal Approach (Using Hashing)
- Insert all elements of `arr1[]` into a **HashSet**.
- Traverse `arr2[]` and check if each element is present in the **HashSet**.
- If all elements are found, return "Yes".
- Else, return "No".

✅ **Time Complexity:** `O(n + m)`
✅ **Space Complexity:** `O(n)`

#### Code:
```java
import java.util.HashSet;

public class CheckSubset {
    public static String isSubset(int[] arr1, int n, int[] arr2, int m) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            set.add(arr1[i]);
        }
        for(int i = 0; i < m; i++) {
            if(!set.contains(arr2[i])) {
                return "No";
            }
        }
        return "Yes";
    }

    public static void main(String[] args) {
        int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = {11, 3, 7, 1};
        System.out.println(isSubset(arr1, arr1.length, arr2, arr2.length));
    }
}
```

---

## 📊 Time & Space Complexity
| Approach                | Time Complexity    | Space Complexity |
|------------------------|--------------------|-----------------|
| **Brute Force**         | `O(n*m)`            | `O(1)`           |
| **Sorting + Two Pointers** | `O(nlogn + mlogm)` | `O(1)`           |
| **Hashing (Optimal)**   | `O(n + m)`          | `O(n)`           |

---

## ✅ Test Cases
| arr1[]                     | arr2[]              | Output |
|----------------------------|---------------------|--------|
| {11, 1, 13, 21, 3, 7}      | {11, 3, 7, 1}       | Yes    |
| {1, 2, 3, 4, 5, 6}        | {1, 2, 4, 9}        | No     |
| {10, 5, 2, 23, 19}        | {19, 5, 23}         | Yes    |
| {2, 3, 4, 5}              | {2, 5, 6}           | No     |

