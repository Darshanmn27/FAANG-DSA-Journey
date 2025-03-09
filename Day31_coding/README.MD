# HashMap vs TreeMap vs LinkedHashMap in Java

## 🚀 Overview
In Java, the **Collections Framework** provides several classes for storing and manipulating key-value pairs, commonly known as **Map** interfaces. Among them, **HashMap**, **TreeMap**, and **LinkedHashMap** are the most commonly used Map implementations.

In this professional README, we will cover:
- ✔ What is HashMap, TreeMap, LinkedHashMap?
- ✔ How do they work internally?
- ✔ Key differences with examples.
- ✔ Time complexity for operations.
- ✔ When to use which?

---

## 📜 1. HashMap
### ✅ What is HashMap?
A **HashMap** is a part of the Java Collections Framework that implements the **Map interface** using a **hash table**. It stores data in **key-value pairs** and provides constant-time complexity for **get()** and **put()** operations on average.

### ✅ Key Features of HashMap
| Feature            | Description |
|-------------------|-------------|
| **Ordering**       | No guarantee of order. |
| **Null Keys**      | Allows **one null key**. |
| **Null Values**    | Allows **multiple null values**. |
| **Thread-Safety**  | **Not synchronized**. (Use ConcurrentHashMap for thread-safety) |
| **Performance**    | O(1) for **get()** and **put()** operations on average. |

### ✅ Internal Working of HashMap
- **Uses a Hash Table (Array + LinkedList)**.
- HashCode of the key is converted into an index using the formula:
```plaintext
Index = hashCode(key) % (n-1)
```
- If two keys have the same hash, it uses **chaining** (LinkedList or TreeNode in modern Java versions) to resolve collisions.

### ✅ Example of HashMap
```java
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Mango", 30);
        
        System.out.println(map);
        System.out.println("Price of Apple: " + map.get("Apple"));
    }
}
```
**Output:**
```plaintext
{Mango=30, Banana=20, Apple=10}
Price of Apple: 10
```

---

## 📜 2. TreeMap
### ✅ What is TreeMap?
A **TreeMap** is a part of Java's **Map interface** which implements a **Red-Black Tree** internally. It stores key-value pairs in **sorted order of keys** (Natural ordering or Custom Comparator).

### ✅ Key Features of TreeMap
| Feature            | Description |
|-------------------|-------------|
| **Ordering**       | Sorted by natural order of keys. |
| **Null Keys**      | Does not allow **null keys**. |
| **Null Values**    | Allows **multiple null values**. |
| **Thread-Safety**  | **Not synchronized**. |
| **Performance**    | O(log n) for **get()**, **put()** operations. |

### ✅ Internal Working of TreeMap
- Internally uses a **Red-Black Tree**.
- Automatically sorts the keys in **natural ordering**.
- Provides **O(log n)** time complexity.

### ✅ Example of TreeMap
```java
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        
        map.put("Banana", 20);
        map.put("Apple", 10);
        map.put("Mango", 30);
        
        System.out.println(map);
    }
}
```
**Output:**
```plaintext
{Apple=10, Banana=20, Mango=30}
```

---

## 📜 3. LinkedHashMap
### ✅ What is LinkedHashMap?
A **LinkedHashMap** is a part of the Java Collections Framework that maintains the **insertion order** of key-value pairs. It is like a **HashMap**, but it uses a **doubly linked list** along with a hash table to maintain the order.

### ✅ Key Features of LinkedHashMap
| Feature            | Description |
|-------------------|-------------|
| **Ordering**       | Maintains **insertion order**. |
| **Null Keys**      | Allows **one null key**. |
| **Null Values**    | Allows **multiple null values**. |
| **Thread-Safety**  | **Not synchronized**. |
| **Performance**    | O(1) for **get()** and **put()** operations. |

### ✅ Internal Working of LinkedHashMap
- Uses **Hash Table + Doubly Linked List**.
- Provides **predictable iteration order**.

### ✅ Example of LinkedHashMap
```java
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Mango", 30);
        
        System.out.println(map);
    }
}
```
**Output:**
```plaintext
{Apple=10, Banana=20, Mango=30}
```

---

## 📊 4. Comparison Chart
| Property       | HashMap        | TreeMap        | LinkedHashMap  |
|----------------|----------------|----------------|----------------|
| Ordering       | No order        | Natural order  | Insertion order |
| Null Key       | ✔ Allowed       | ❌ Not Allowed | ✔ Allowed      |
| Null Values    | ✔ Allowed       | ✔ Allowed      | ✔ Allowed      |
| Thread-Safety  | ❌ Not synchronized | ❌ Not synchronized | ❌ Not synchronized |
| Time Complexity| O(1) avg        | O(log n)       | O(1) avg       |

---

## 💯 When to Use Which?
| Scenario                             | Recommended Map         |
|---------------------------------------|------------------------|
| Fast insertion/deletion without order | **HashMap**            |
| Sorted data based on key              | **TreeMap**            |
| Preserve insertion order              | **LinkedHashMap**      |

---

## 💡 Quick Summary
- ✅ **HashMap:** Fast, no order, best for random key-value access.
- ✅ **TreeMap:** Sorted by key, slower due to Red-Black Tree.
- ✅ **LinkedHashMap:** Fast, predictable iteration order.

---

## 💻 Best Practices
1. **Use HashMap** when order does not matter and performance is a priority.
2. **Use TreeMap** when you need sorting based on keys.
3. **Use LinkedHashMap** when you want predictable iteration order.

---

