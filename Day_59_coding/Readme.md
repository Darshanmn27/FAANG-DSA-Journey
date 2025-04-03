# Longest Subarray with Sum K (Brute Force, Better, and Optimal Approaches)

## Introduction
Finding the longest subarray with a given sum `K` is a fundamental problem in array processing and is often encountered in competitive programming and coding interviews. In this documentation, we will cover **Brute Force**, **Better**, and **Optimal** approaches with their **time complexity (TC)** and **space complexity (SC)**.

---

## Problem Statement
Given an array `arr[]` and an integer `K`, find the **length of the longest subarray** that sums to `K`.

---

## **Brute Force Approach**
### **Idea**
1. Generate all possible subarrays.
2. Compute the sum for each subarray.
3. If the sum equals `K`, update the maximum length.

### **Code Implementation**
```java
import java.util.*;
public class BruteForceSolution {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 4, 5, 5, 4, 5, 4, 6, 5, 46, 5, 6, 5, 45, 4, 6, 3, 4, 5, 5, 3};
        int k = 20;
        int len = 0;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int kk = i; kk <= j; kk++) {
                    sum += arr[kk];
                }
                if (sum == k) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        System.out.println("Longest Subarray Length: " + len);
    }
}
```

### **Time & Space Complexity**
- **Time Complexity:** `O(N^3)` (Three nested loops: picking `i`, `j`, and summing elements).
- **Space Complexity:** `O(1)` (No extra space used).

---

## **Better Approach (Using Prefix Sum)**
### **Idea**
1. Precompute prefix sums to avoid recomputing sums for each subarray.
2. Store prefix sums in a hashmap to quickly find required sums.

### **Code Implementation**
```java
import java.util.*;
public class BetterSolution {
    public static int longestSubarrayWithSumK(int[] arr, int k) {
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        int sum = 0, maxLen = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                maxLen = i + 1;
            }
            if (prefixSumMap.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - prefixSumMap.get(sum - k));
            }
            prefixSumMap.putIfAbsent(sum, i);
        }
        return maxLen;
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 4, 5, 5, 4, 5, 4, 6, 5, 46, 5, 6, 5, 45, 4, 6, 3, 4, 5, 5, 3};
        int k = 20;
        System.out.println("Longest Subarray Length: " + longestSubarrayWithSumK(arr, k));
    }
}
```

### **Time & Space Complexity**
- **Time Complexity:** `O(N)` (Traverses array once, hashmap operations are O(1)).
- **Space Complexity:** `O(N)` (Stores prefix sums in hashmap).

---

## **Optimal Approach (Using Two Pointers / Sliding Window)**
### **Idea**
1. Maintain a **sliding window** with two pointers.
2. Expand the right pointer to increase sum.
3. Shrink the left pointer if sum exceeds `K`.
4. If sum equals `K`, update maximum length.

### **Code Implementation**
```java
public class OptimalSolution {
    public static int longestSubarrayWithSumK(int[] arr, int k) {
        int left = 0, right = 0, sum = 0, maxLen = 0;
        
        while (right < arr.length) {
            sum += arr[right];
            
            while (sum > k && left <= right) {
                sum -= arr[left];
                left++;
            }
            
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            
            right++;
        }
        return maxLen;
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 4, 5, 5, 4, 5, 4, 6, 5, 46, 5, 6, 5, 45, 4, 6, 3, 4, 5, 5, 3};
        int k = 20;
        System.out.println("Longest Subarray Length: " + longestSubarrayWithSumK(arr, k));
    }
}
```

### **Time & Space Complexity**
- **Time Complexity:** `O(N)` (Each element is processed at most twice).
- **Space Complexity:** `O(1)` (No extra space used).

---

## **Final Comparison**
| Approach | Time Complexity | Space Complexity | Technique Used |
|----------|---------------|-----------------|----------------|
| **Brute Force** | `O(N^3)` | `O(1)` | Three nested loops |
| **Better Approach** | `O(N)` | `O(N)` | HashMap (Prefix Sum) |
| **Optimal Approach** | `O(N)` | `O(1)` | Two Pointers / Sliding Window |

---

## **Conclusion**
- **Brute Force** is easy to understand but inefficient for large arrays.
- **Better Approach** using HashMap improves efficiency but requires extra space.
- **Optimal Approach** using the **Sliding Window Technique** achieves best performance (`O(N)`) without extra space.

**Choose the right approach based on problem constraints and input size!** 🚀

---

### **🚀 Keep Practicing!**
If you found this helpful, consider implementing variations like:
- **Handling negative numbers in arrays** (HashMap approach is needed).
- **Finding the subarray instead of just length**.
