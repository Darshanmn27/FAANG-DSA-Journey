# Linked List in Data Structures

## 📖 Introduction
A **Linked List** is a linear data structure in which elements are not stored at contiguous memory locations. Instead, each element (node) contains two parts:
- **Data**: The value of the node.
- **Pointer (next)**: Address of the next node in the list.

Unlike arrays, Linked Lists are dynamic in nature, allowing for efficient insertion and deletion operations.

---

## 💠 Types of Linked List

### 1. Singly Linked List (SLL)
- Each node contains **data** and a **pointer to the next node**.
- Traversal is unidirectional (from head to tail).
- Memory is allocated dynamically.

**Structure:**
```
Head --> Node1 --> Node2 --> Node3 --> NULL
```

**Java Code:**
```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```

---

### 2. Doubly Linked List (DLL)
- Each node contains **data**, **pointer to the next node**, and **pointer to the previous node**.
- Traversal is bidirectional (both forward and backward).

**Structure:**
```
NULL <-- Node1 <--> Node2 <--> Node3 --> NULL
```

**Java Code:**
```java
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
```

---

### 3. Circular Linked List (CLL)
- In a Circular Linked List, the **last node points to the first node**, making a circular connection.
- Can be **Singly Circular** or **Doubly Circular**.

**Structure:**
```
Head --> Node1 --> Node2 --> Node3 --> Head
```

**Java Code:**
```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```

---

## 🛠 Basic Operations in Linked List

### 1. Insertion
**a. At the beginning**
```java
Node newNode = new Node(data);
newNode.next = head;
head = newNode;
```

**b. At the end**
```java
Node newNode = new Node(data);
Node temp = head;
while(temp.next != null) {
    temp = temp.next;
}
temp.next = newNode;
```

**c. At a given position**
```java
Node newNode = new Node(data);
Node temp = head;
for(int i=0; i<position-1; i++) {
    temp = temp.next;
}
newNode.next = temp.next;
temp.next = newNode;
```

---

### 2. Deletion
**a. From the beginning**
```java
head = head.next;
```

**b. From the end**
```java
Node temp = head;
while(temp.next.next != null) {
    temp = temp.next;
}
temp.next = null;
```

**c. From a given position**
```java
Node temp = head;
for(int i=0; i<position-1; i++) {
    temp = temp.next;
}
temp.next = temp.next.next;
```

---

### 3. Traversal
**Iterating through a Linked List:**
```java
Node temp = head;
while(temp != null) {
    System.out.print(temp.data + " ");
    temp = temp.next;
}
```

---

### 4. Searching
**Searching for a node in Linked List:**
```java
Node temp = head;
while(temp != null) {
    if(temp.data == target) {
        return true;
    }
    temp = temp.next;
}
return false;
```

---

## 📊 Time and Space Complexity
| Operation      | Time Complexity     | Space Complexity    |
|----------------|--------------------|---------------------|
| Insertion      | O(1) at head, O(n) at tail | O(1)              |
| Deletion       | O(1) at head, O(n) at tail | O(1)              |
| Searching      | O(n)                  | O(1)              |
| Traversal      | O(n)                  | O(1)              |

---

## ✅ Advantages of Linked List
1. **Dynamic size**: Linked List can grow or shrink as needed.
2. **Efficient insertion/deletion**: Inserting or deleting elements does not require shifting.
3. **Memory Utilization**: No memory is wasted, as it is dynamically allocated.

---

## ❌ Disadvantages of Linked List
1. **Extra memory space**: Each node requires a pointer, increasing memory usage.
2. **Sequential access**: Cannot access elements randomly like arrays.
3. **Complexity**: Implementation and operations can be complex.

---

## 💡 Practical Applications of Linked List
| Application               | Explanation                      |
|-------------------------|-----------------------------------|
| **Implementing Stack/Queue** | Used in dynamic stacks and queues. |
| **Graph Representation** | Used in adjacency list representation. |
| **Memory Management**    | Used in dynamic memory allocation. |
| **Undo Functionality**   | Used in applications like MS Word. |

---

## 🏗 Full Working Code for Linked List in Java

### Singly Linked List Example
```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();
    }
}
```

**Output:**
```
10 -> 20 -> 30 -> null
```

---

## 🚀 Conclusion
Linked List is a fundamental and powerful data structure that allows dynamic memory management. It is widely used in:
- **Implementing Stacks, Queues, and Hash Maps**
- **Dynamic Memory Allocation**
- **Undo and Redo operations**
- **Graph Representations**

Mastering Linked List concepts will significantly boost your problem-solving and coding skills in competitive programming and technical interviews.

---
