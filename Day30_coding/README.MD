# HashSet, TreeSet, and LinkedHashSet in Java

## 📖 Introduction
In Java, the `Set` interface is a part of the **Java Collections Framework (JCF)** and is used to store a collection of **unique elements**. It does not allow duplicate values. The three most commonly used classes implementing the `Set` interface are:

- ✅ **HashSet**
- ✅ **TreeSet**
- ✅ **LinkedHashSet**

Each of these classes has its own **special characteristics**, which makes them useful in different scenarios. In this documentation, we'll cover all three in depth.

---

## 📌 1. HashSet
### ✅ What is a HashSet?
A `HashSet` is a class that implements the **Set interface** using a **Hash Table** (based on HashMap). It does not maintain any insertion order and uses **hashing** to store elements.

### ✅ Key Characteristics
- **Does not allow duplicates**.
- **Unordered**: The insertion order is not preserved.
- Allows **null values**.
- Provides constant-time performance (O(1)) for basic operations like **add, remove, contains, size**.

### ✅ HashSet Syntax
```java
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Apple"); // Duplicate element

        System.out.println(set); // Output: [Apple, Banana, Mango]
    }
}
```

### ✅ Output
```
[Apple, Banana, Mango]
```

### ✅ Time Complexities
| Operation     | Time Complexity |
|---------------|-----------------|
| add()         | O(1)              |
| remove()      | O(1)              |
| contains()    | O(1)              |
| size()        | O(1)              |

### ✅ When to Use HashSet?
- When you need **unique elements** in your collection.
- When **insertion order** is not important.
- When you need **fast access (O(1) time complexity)**.

---

## 📌 2. TreeSet
### ✅ What is a TreeSet?
A `TreeSet` is a class that implements the `Set` interface using a **Red-Black Tree (Self-balancing Binary Search Tree)**. It maintains elements in a **sorted order** (ascending by default).

### ✅ Key Characteristics
- **Does not allow duplicates**.
- **Sorted in natural ordering** (ascending order).
- Does not allow **null values**.
- Provides **logarithmic time complexity (O(log n))**.

### ✅ TreeSet Syntax
```java
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(40);
        set.add(10);
        set.add(30);
        set.add(20);

        System.out.println(set); // Output: [10, 20, 30, 40]
    }
}
```

### ✅ Output
```
[10, 20, 30, 40]
```

### ✅ Time Complexities
| Operation     | Time Complexity |
|---------------|-----------------|
| add()         | O(log n)         |
| remove()      | O(log n)         |
| contains()    | O(log n)         |
| size()        | O(1)             |

### ✅ When to Use TreeSet?
- When you need **sorted elements**.
- When **order matters**.
- When you want to perform **range queries (e.g., headSet, tailSet)**.

---

## 📌 3. LinkedHashSet
### ✅ What is a LinkedHashSet?
A `LinkedHashSet` is a class that combines the behavior of a **HashSet** and a **LinkedList**. It maintains the **insertion order** of elements.

### ✅ Key Characteristics
- **Does not allow duplicates**.
- **Maintains insertion order**.
- Allows **null values**.
- Provides constant-time performance (O(1)) for basic operations.

### ✅ LinkedHashSet Syntax
```java
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Banana");
        set.add("Apple");
        set.add("Mango");

        System.out.println(set); // Output: [Banana, Apple, Mango]
    }
}
```

### ✅ Output
```
[Banana, Apple, Mango]
```

### ✅ Time Complexities
| Operation     | Time Complexity |
|---------------|-----------------|
| add()         | O(1)              |
| remove()      | O(1)              |
| contains()    | O(1)              |
| size()        | O(1)              |

### ✅ When to Use LinkedHashSet?
- When you need **unique elements**.
- When **insertion order** matters.
- When you need **constant-time access (O(1))**.

---

## ✅ Comparison Table (HashSet vs TreeSet vs LinkedHashSet)
| Feature         | HashSet       | TreeSet      | LinkedHashSet |
|----------------|---------------|--------------|----------------|
| Duplicates     | ❌ No          | ❌ No         | ❌ No          |
| Null Value     | ✅ Allowed     | ❌ Not Allowed| ✅ Allowed     |
| Insertion Order| ❌ No          | ✅ Sorted    | ✅ Maintained  |
| Time Complexity| O(1)          | O(log n)     | O(1)           |
| Best Use Case  | Fast Access   | Sorted Data  | Maintain Order |

---

## ✅ Real-World Applications
| Class            | Real-world Usage                                      |
|-----------------|------------------------------------------------------|
| **HashSet**     | To store unique elements like **usernames, email IDs**|
| **TreeSet**     | To store elements in **sorted order** like **Leaderboard ranks** |
| **LinkedHashSet** | To maintain **order of elements** like **Browsing history** |

---

## ✅ Quick Interview Questions
1. **What is the difference between HashSet and TreeSet?**
2. **Why is HashSet faster than TreeSet?**
3. **When should we use LinkedHashSet instead of HashSet?**
4. **Can TreeSet contain null values? Why?**
5. **Why is TreeSet slower than HashSet?**

---

## ✅ Conclusion
In this professional documentation, we have learned:
- ✔ **HashSet**: Fast, Unordered, No duplicates.
- ✔ **TreeSet**: Sorted, No duplicates, Slow.
- ✔ **LinkedHashSet**: Ordered, No duplicates, Fast.

### 🚀 Recommendation
| Scenario                          | Recommended Set     |
|-----------------------------------|--------------------|
| Fast Access                       | **HashSet**         |
| Sorted Elements                   | **TreeSet**         |
| Maintain Insertion Order           | **LinkedHashSet**   |


