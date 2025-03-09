# 🚀 Find the Unique Element in an Array

## ✅ Problem Statement
You are given an integer array `arr[]` of size `N`, where **all the elements appear twice except one element** that appears **once**.

👉 Your task is to find the **unique element** in the array and print it.

---

## 📊 Example Input & Output
| Input Array             | Unique Element |
|-------------------------|-----------------|
| `{1, 2, 3, 4, 1, 2, 3}` | `4`             |
| `{5, 6, 7, 5, 6}`       | `7`             |
| `{10, 20, 30, 10, 20}`  | `30`            |

---

## 💻 Approach 1: Brute Force Solution

### 💡 Logic:
- Traverse the array using two nested loops (**O(N^2)** approach).
- For each element, traverse the entire array again and count its occurrences.
- If the `count == 1`, it is the **unique element**.
- Break the loop after finding the unique element.

### ✅ Code (Brute Force Solution)
```java
import java.util.*;

public class UniqueElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 1, 2, 3};
        int n = arr.length;
        
        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count == 1) {
                System.out.println("Unique element is: " + arr[i]);
                break;
            }
        }
    }
}
```

### ✅ Output:
```
Unique element is: 4
```

### ✅ Time Complexity:
| Operation     | Time Complexity    |
|----------------|-------------------|
| Outer Loop    | O(N)                |
| Inner Loop    | O(N)                |
| **Total**     | O(N * N) = O(N^2)   |

### ✅ Space Complexity:
- No extra space is used except for the input array.
- Space Complexity = **O(1)**.

---

## 💎 Approach 2: Better Solution (Using HashMap)

### 💡 Logic:
- Use a **HashMap** to store the frequency count of each element.
- Traverse the array and insert each element with its frequency count.
- Traverse the HashMap and find the element with **count = 1** (which is the unique element).
- Break the loop once the unique element is found.

### ✅ Code (Using HashMap)
```java
import java.util.*;

public class UniqueElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 1, 2, 3};
        int n = arr.length;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                System.out.println("Unique element is: " + entry.getKey());
                break;
            }
        }
    }
}
```

### ✅ Output:
```
Unique element is: 4
```

### ✅ Time Complexity:
| Operation     | Time Complexity     |
|---------------|--------------------|
| Insert in Map | O(N)                |
| Traverse Map  | O(N)                |
| **Total**     | O(N + N) = O(2N)    |

### ✅ Space Complexity:
- **Space Used:** O(N) for HashMap.
- Extra Space: O(N)

---

## 🔥 Approach 3: Optimal Solution (Using XOR Bit Manipulation) 💯

### 💡 Logic (XOR Property):
The **XOR** operator has a unique property:

| XOR Operation  | Result |
|----------------|--------|
| a ^ a          | 0      |
| a ^ 0          | a      |
| a ^ b ^ a      | b      |

👉 When you XOR all elements in the array, **the duplicate elements cancel each other**, and only the **unique element remains**.

### ✅ Code (Using XOR)
```java
public class UniqueElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 1, 2, 3};
        int n = arr.length;
        
        int xor = 0;
        for(int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }
        
        System.out.println("Unique element is: " + xor);
    }
}
```

### ✅ Output:
```
Unique element is: 4
```

### 💡 How It Works (Dry Run):
```
1 ^ 2 ^ 3 ^ 4 ^ 1 ^ 2 ^ 3
=> (1 ^ 1) ^ (2 ^ 2) ^ (3 ^ 3) ^ 4
=> 0 ^ 0 ^ 0 ^ 4
=> 4
```

### ✅ Time Complexity:
| Operation     | Time Complexity    |
|---------------|-------------------|
| Single Loop   | O(N)                |
| **Total**     | O(N)                |

### ✅ Space Complexity:
- **Space Used:** O(1) (Constant Space)

---

## 📊 Comparison of All Approaches
| Approach        | Time Complexity  | Space Complexity  | Best Choice?   |
|----------------|-----------------|-------------------|----------------|
| **Brute Force** | O(N^2)           | O(1)              | ❌ Avoid        |
| **HashMap**     | O(N)             | O(N)              | 👍 Good Choice  |
| **XOR Method**  | O(N)             | O(1)              | ✅ Best Choice  |

---

## 🎉 Why XOR Is The Best Solution?
✅ It requires **only one traversal** of the array.
✅ No extra space is used (**O(1)**).
✅ It works like magic by canceling out similar elements.
✅ Best solution for finding unique elements.

---

## 🚀 Conclusion
| Approach        | Time Complexity  | Space Complexity  | Best Choice      |
|----------------|-----------------|-------------------|-----------------|
| **Brute Force** | O(N^2)           | O(1)              | ❌ Avoid        |
| **HashMap**     | O(N)             | O(N)              | 👍 Good Choice  |
| **XOR Method**  | O(N)             | O(1)              | ✅ Best Choice  |

💯 **The XOR method** is the most optimized solution. 🚀

🔥 **Pro Tip:**
If you encounter any similar problem where one element appears once, and the rest appear twice — **use XOR without any doubt.** 💯🔥

---