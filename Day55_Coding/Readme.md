# Java Collections Framework: HashMap, TreeMap, LinkedHashMap, HashSet, TreeSet, LinkedHashSet

## 📌 Overview
Java provides various collection classes to store and manipulate data efficiently. This guide covers:

- **HashMap** 🗂️ - Unordered key-value mapping
- **TreeMap** 🌲 - Sorted key-value mapping
- **LinkedHashMap** 🔗 - Ordered key-value mapping
- **HashSet** 🔥 - Unordered unique elements
- **TreeSet** 🌳 - Sorted unique elements
- **LinkedHashSet** 🔄 - Ordered unique elements

---

## 📌 1. HashMap (Key-Value Pair Storage)

### ✅ Properties:
- Stores key-value pairs.
- Allows **null** keys and multiple null values.
- **Unordered**.
- Fast access with **O(1)** time complexity for get/put operations.

### 💻 Code Example:
```java
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(1, "Avocado"); // Overwrites previous value
        
        System.out.println(map); // Output: {1=Avocado, 2=Banana, 3=Cherry}
    }
}
```

---

## 📌 2. TreeMap (Sorted Map)

### ✅ Properties:
- Stores key-value pairs in **sorted order**.
- Does **not allow null keys** but allows null values.
- Uses **Red-Black Tree**, making get/put operations **O(log n)**.

### 💻 Code Example:
```java
import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "Cherry");
        map.put(1, "Apple");
        map.put(2, "Banana");
        
        System.out.println(map); // Output: {1=Apple, 2=Banana, 3=Cherry} (Sorted by Key)
    }
}
```

---

## 📌 3. LinkedHashMap (Maintains Insertion Order)

### ✅ Properties:
- Stores key-value pairs.
- **Preserves insertion order**.
- Allows **null** keys and multiple null values.
- Slightly slower than HashMap due to ordering overhead.

### 💻 Code Example:
```java
import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Apple");
        map.put(3, "Cherry");
        map.put(2, "Banana");
        
        System.out.println(map); // Output: {1=Apple, 3=Cherry, 2=Banana} (Insertion Order Maintained)
    }
}
```

---

## 📌 4. HashSet (Unique Elements, Unordered)

### ✅ Properties:
- Stores **unique** elements.
- **No order is maintained**.
- Allows **null** values.
- Uses **Hash Table** with O(1) average time complexity for operations.

### 💻 Code Example:
```java
import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // Duplicate, won't be added
        
        System.out.println(set); // Output: [10, 20, 30] (Order may vary)
    }
}
```

---

## 📌 5. TreeSet (Sorted, Unique Elements)

### ✅ Properties:
- Stores **unique** elements in **sorted order**.
- Uses **Red-Black Tree**.
- Does **not allow null values**.
- Operations are O(log n).

### 💻 Code Example:
```java
import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(30);
        set.add(10);
        set.add(20);
        
        System.out.println(set); // Output: [10, 20, 30] (Sorted Order)
    }
}
```

---

## 📌 6. LinkedHashSet (Preserves Insertion Order, Unique Elements)

### ✅ Properties:
- Stores **unique** elements.
- **Preserves insertion order**.
- Allows **null values**.
- Slightly slower than HashSet due to ordering.

### 💻 Code Example:
```java
import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(30);
        set.add(20);
        
        System.out.println(set); // Output: [10, 30, 20] (Maintains Insertion Order)
    }
}
```

---

## 🔥 Key Differences Between Map Implementations
| Feature        | HashMap | TreeMap | LinkedHashMap |
|---------------|---------|---------|---------------|
| Ordering      | No      | Sorted  | Insertion Order |
| Null Keys     | Yes     | No      | Yes |
| Performance   | O(1)    | O(log n) | O(1) |
| Use Case      | Fast access | Sorted keys | Maintain insertion order |

---

## 🔥 Key Differences Between Set Implementations
| Feature        | HashSet | TreeSet | LinkedHashSet |
|---------------|---------|---------|---------------|
| Ordering      | No      | Sorted  | Insertion Order |
| Null Values   | Yes     | No      | Yes |
| Performance   | O(1)    | O(log n) | O(1) |
| Use Case      | Fast lookup | Sorted storage | Maintain insertion order |

---

## 🎯 Conclusion
- **Use HashMap or HashSet** when order doesn’t matter and you need fast lookups.
- **Use TreeMap or TreeSet** when sorting is required.
- **Use LinkedHashMap or LinkedHashSet** when order matters.

Happy Coding! 🚀
