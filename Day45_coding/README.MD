# 📊 Sort Elements of an Array by Frequency

## 💡 Problem Statement
Given an array of integers, having some duplicate elements, sort the array by frequency. If two elements have the same frequency, sort them in increasing order.

### 🔥 Example 1:
**Input:**
```
N = 8
array[] = {1,2,3,2,4,3,1,2}
```

**Output:**
```
2 2 2 1 1 3 3 4
```

**Explanation:**
- Element `2` appears **3 times** → Print it 3 times.
- Element `1` appears **2 times** → Print it 2 times.
- Element `3` appears **2 times** → Print it 2 times.
- Element `4` appears **1 time** → Print it 1 time.

The highest frequency element should appear first.

---

### 🔥 Example 2:
**Input:**
```
N = 6
array[] = {-199,6,7,-199,3,5}
```

**Output:**
```
-199 -199 3 5 6 7
```

**Explanation:**
- Element `-199` appears **2 times** → Print it 2 times.
- Elements `3, 5, 6, 7` appear **1 time each** → Print in sorted order.

---

## 💯 Approach 1: Brute Force Solution (O(N^2))

### ✅ Steps to Solve:
1. Traverse the array.
2. Count the frequency of each element manually.
3. Print the elements according to their frequency.
4. Time Complexity: **O(N^2)**

### 💻 Code:
```java
public static void bruteForce(int[] arr) {
   // Traverse each element and count its frequency
}
```

### 📊 Time Complexity: O(N^2)
### 💾 Space Complexity: O(1)

---

## 💯 Approach 2: Better Solution Using HashMap (O(N log N))

### ✅ Steps to Solve:
1. Use a **HashMap** to store frequency.
2. Convert HashMap keys to a list.
3. Sort the list by frequency and then by value.
4. Print the result.

### 💻 Code:
```java
public static void betterSolution(int[] arr) {
   HashMap<Integer, Integer> map = new HashMap<>();
   // Count frequency
   for (int i : arr) {
       map.put(i, map.getOrDefault(i, 0) + 1);
   }

   List<Integer> list = new ArrayList<>(map.keySet());
   Collections.sort(list, (a, b) -> {
       if (map.get(a).equals(map.get(b))) return a - b;
       return map.get(b) - map.get(a);
   });
}
```

### 📊 Time Complexity: O(N log N)
### 💾 Space Complexity: O(N)

---

## 💯 Approach 3: Optimal Solution Using PriorityQueue (O(N log N))

### ✅ Steps to Solve:
1. Use **HashMap** to count frequency.
2. Use **PriorityQueue (MaxHeap)** to sort by frequency.
3. Extract elements from PriorityQueue and print them.

### 💻 Code:
```java
public static void optimalSolution(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i : arr) {
        map.put(i, map.getOrDefault(i, 0) + 1);
    }

    PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
        new PriorityQueue<>((a, b) -> {
            if (a.getValue().equals(b.getValue())) return a.getKey() - b.getKey();
            return b.getValue() - a.getValue();
        });

    maxHeap.addAll(map.entrySet());
}
```

### 📊 Time Complexity: O(N log N)
### 💾 Space Complexity: O(N)

---

## ✅ Output
```
Brute Force Solution:
2 2 2 1 1 3 3 4

Better Solution:
2 2 2 1 1 3 3 4

Optimal Solution:
2 2 2 1 1 3 3 4
```


