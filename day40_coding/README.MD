# Count Frequency of Each Element in the Array

## 🚀 Problem Statement
Given an array of **N** integers, the task is to **count the frequency of each element** present in the array.

### 🔹 Example 1:
**Input:**  
```
n = 7
a[] = {1, 2, 2, 3, 4, 4, 4}
```
**Output:**  
```
1 -> 1
2 -> 2
3 -> 1
4 -> 3
```

### 🔹 Example 2:
**Input:**  
```
n = 5
a[] = {5, 5, 5, 5, 5}
```
**Output:**  
```
5 -> 5
```

---

## 💡 Approach
1. Use a **HashMap** to store the frequency of each element.
2. Traverse the array and increase the count of each element in the map.
3. Iterate through the map to print the frequency of each element.

### 🛠️ Algorithm:
1. Create an empty **HashMap**.
2. Traverse the array from **0 to N-1**.
3. For each element, increase its count in the HashMap.
4. After traversal, iterate the HashMap and print each element with its count.

---

## 📌 Code Implementation (Java)
```java
import java.util.HashMap;

public class FrequencyCounter {
    public static void countFrequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count the frequency of each element
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Display the frequency of each element
        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4};
        countFrequency(arr);
    }
}
```

---

## 📝 Complexity Analysis
- **Time Complexity:** `O(N)` (Where N is the number of elements in the array)
- **Space Complexity:** `O(N)` (For storing elements in HashMap)

---

## ✅ Test Cases
| Input Array               | Output                  |
|---------------------------|-------------------------|
| {1, 2, 2, 3, 4, 4, 4}     | 1 -> 1, 2 -> 2, 3 -> 1, 4 -> 3 |
| {5, 5, 5, 5, 5}           | 5 -> 5                   |
| {10, 20, 10, 20, 30}      | 10 -> 2, 20 -> 2, 30 -> 1 |
| {100}                     | 100 -> 1                 |

---

## 🔥 Edge Cases Considered
✔️ Arrays with all identical elements.  
✔️ Arrays with a single element.  
✔️ Arrays with negative and positive numbers.  
✔️ Large input size arrays.



