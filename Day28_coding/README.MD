# 🚀 **Day 28: Mastering Arrays & ArrayList in Java**

## 📜 **Introduction to Arrays and ArrayList**

In Java, **Arrays** and **ArrayList** are used to store multiple values in a single variable. Both are part of the Java Collection framework but have different functionalities.

---

## 📌 **What is an Array in Java?**

- An **Array** is a **fixed-size data structure** used to store a collection of elements of the **same data type**.
- Arrays have **fixed length** once declared and cannot be modified.
- It is part of **Java primitive collections**.

### ✅ **Syntax of Array in Java:**
```java
int[] arr = new int[5]; // Declaring an array of size 5
arr[0] = 10;
arr[1] = 20;
arr[2] = 30;
arr[3] = 40;
arr[4] = 50;
```

---

## 📊 **Memory Allocation in Array:**

| Index | Value  |
|-------|--------|
| 0     | 10     |
| 1     | 20     |
| 2     | 30     |
| 3     | 40     |
| 4     | 50     |

**Fixed size:** Once the array size is defined, you cannot change it.

---

## 💻 **Code Example of Array:**
### Example 1: Basic Array Example
```java
public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        for(int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }
}
```
**Output:**
```
Element at index 0: 10
Element at index 1: 20
Element at index 2: 30
Element at index 3: 40
Element at index 4: 50
```

---

## ✅ **Advantages of Arrays:**
- **Fast access:** Accessing elements using an index is very fast.
- **Memory Efficient:** Stores data in a contiguous memory block.

## ❌ **Disadvantages of Arrays:**
- **Fixed Size:** Cannot increase or decrease the size of the array after declaration.
- **Less flexible:** To add or remove elements, you need to create a new array.

---

## 💯 **Time & Space Complexity for Arrays**
| Operation   | Time Complexity | Space Complexity |
|-------------|----------------|------------------|
| Access      | O(1)            | O(n)             |
| Insertion   | O(n)            | O(n)             |
| Deletion    | O(n)            | O(n)             |

---

## 💎 **What is an ArrayList in Java?**

- **ArrayList** is part of the **Java Collections Framework**.
- It is a **resizable array** that can dynamically grow and shrink as per the requirement.
- It is present in the **java.util** package.

### ✅ **Syntax of ArrayList:**
```java
import java.util.ArrayList;

ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
list.add("Mango");
```

---

## 📊 **Memory Allocation in ArrayList:**
| Index | Value  |
|-------|--------|
| 0     | Apple  |
| 1     | Banana |
| 2     | Mango  |


---

## 💻 **Code Example of ArrayList:**
### Example 2: ArrayList Example
```java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println("Fruits List: " + list);

        // Remove an element
        list.remove("Banana");
        System.out.println("After removing Banana: " + list);
    }
}
```
**Output:**
```
Fruits List: [Apple, Banana, Mango]
After removing Banana: [Apple, Mango]
```

---

## ✅ **Advantages of ArrayList:**
- **Resizable:** Can grow or shrink dynamically.
- **In-built methods:** Provides powerful methods like add(), remove(), get(), etc.

## ❌ **Disadvantages of ArrayList:**
- **Slow Insertion/Deletion:** Inserting or deleting elements in the middle is slower.
- **More Memory:** Requires more memory than arrays.

---

## 💯 **Time & Space Complexity for ArrayList**
| Operation   | Time Complexity | Space Complexity |
|-------------|----------------|------------------|
| Access      | O(1)            | O(n)             |
| Insertion   | O(n)            | O(n)             |
| Deletion    | O(n)            | O(n)             |

---

## 🧐 **Difference Between Array and ArrayList**

| Feature          | Array      | ArrayList         |
|-----------------|------------|-------------------|
| Size             | Fixed      | Dynamic            |
| Memory           | Contiguous | Dynamic Allocation |
| Type             | Primitive  | Objects            |
| Flexibility      | Low        | High              |

---

## 💯 **Real-World Example of Array:**
### 📊 Scenario: Student Marks
- You have a fixed number of students in a class (30).
- You can use an **array** to store their marks.

### ✅ Code Example:
```java
int[] marks = new int[30];
```

---

## 💯 **Real-World Example of ArrayList:**
### 📊 Scenario: Shopping Cart
- In an e-commerce website, customers can add or remove items dynamically.
- **ArrayList** is the best choice here.

### ✅ Code Example:
```java
ArrayList<String> cart = new ArrayList<>();
cart.add("Shirt");
cart.add("Shoes");
```

---

## 🚀 **Conclusion**
| Feature     | Array     | ArrayList      |
|-------------|-----------|----------------|
| Size        | Fixed     | Dynamic        |
| Flexibility | Low       | High           |
| Memory      | Fixed     | Dynamic        |
| Efficiency  | High      | Moderate       |

✅ **If you need fixed-size data, use Arrays.**  
✅ **If you need dynamic-size data, use ArrayList.**

---
