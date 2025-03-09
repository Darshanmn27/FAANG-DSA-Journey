# Stack and Queue in Java

## 🚀 Introduction
In this professional documentation, we will cover **Stack** and **Queue** data structures in Java with:
- ✅ **Real-world examples** 📊
- ✅ **Proper Java code implementation** 💻
- ✅ **Detailed Explanation** 🔥
- ✅ **Time and Space Complexity** ⏳
- ✅ **Practical Use Cases** 🚀

---

## 📚 What is Stack?
### Definition
A **Stack** is a **linear data structure** that follows the **LIFO (Last In First Out)** principle.
- **LIFO:** The element that is inserted last, is the first to come out.
- Imagine a stack of plates in a canteen:
  - You place a plate on top.
  - You remove the top plate first.

---

## ✅ Real-World Example of Stack
### Example 1: Stack of Plates 🍽️
Imagine you have a stack of plates:
- You put a plate on top (Push Operation)
- You take the top plate off (Pop Operation)
- You can only access the **top plate** (Peek Operation)

### Example 2: Browser Back Button 🌐
- When you browse web pages, each visited page is pushed into a **stack**.
- When you press **back**, the most recent page (top) is popped out.

---

## 💻 Stack Operations
| Operation | Description |
|------------|-------------|
| **push()**  | Insert an element into the stack |
| **pop()**   | Remove the top element from the stack |
| **peek()**  | View the top element without removing it |
| **isEmpty()** | Check if the stack is empty |

---

## ✅ Java Code: Stack Implementation
### Using Stack Class in Java
```java
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push elements into the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Mango");

        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack: " + stack);

        // Pop element from stack
        stack.pop();
        System.out.println("After pop: " + stack);
    }
}
```

### Output
```
Top element: Mango
Stack: [Apple, Banana, Mango]
After pop: [Apple, Banana]
```

---

## ✅ Time and Space Complexity
| Operation | Time Complexity | Space Complexity |
|-----------|----------------|-----------------|
| push()     | O(1)            | O(N)            |
| pop()      | O(1)            | O(N)            |
| peek()     | O(1)            | O(N)            |
| isEmpty()  | O(1)            | O(N)            |

---

# 📚 What is Queue?
## Definition
A **Queue** is a **linear data structure** that follows the **FIFO (First In First Out)** principle.
- **FIFO:** The element that is inserted first, is the first to come out.
- Imagine a line in a ticket counter:
  - The person who comes first, gets served first.

---

## ✅ Real-World Example of Queue
### Example 1: Movie Ticket Line 🎬
- People stand in a line.
- The person at the front gets served first (Dequeue)
- New people join from the end (Enqueue)

### Example 2: Printer Queue 🖨️
- When you give multiple print commands, the first command will be executed first.

---

## 💻 Queue Operations
| Operation | Description |
|------------|-------------|
| **enqueue()**  | Insert an element into the queue |
| **dequeue()**  | Remove the front element from the queue |
| **peek()**  | View the front element without removing it |
| **isEmpty()** | Check if the queue is empty |

---

## ✅ Java Code: Queue Implementation
### Using LinkedList in Java
```java
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Enqueue elements
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Mango");

        System.out.println("Front element: " + queue.peek());
        System.out.println("Queue: " + queue);

        // Dequeue element
        queue.poll();
        System.out.println("After dequeue: " + queue);
    }
}
```

### Output
```
Front element: Apple
Queue: [Apple, Banana, Mango]
After dequeue: [Banana, Mango]
```

---

## ✅ Time and Space Complexity
| Operation | Time Complexity | Space Complexity |
|-----------|----------------|-----------------|
| enqueue() | O(1)            | O(N)            |
| dequeue() | O(1)            | O(N)            |
| peek()     | O(1)            | O(N)            |
| isEmpty()  | O(1)            | O(N)            |

---

# ✅ Stack vs Queue
| Feature     | Stack      | Queue      |
|-------------|------------|------------|
| Principle   | LIFO       | FIFO       |
| Insert      | push()     | enqueue()  |
| Remove      | pop()      | dequeue()  |
| Top Element | peek()     | peek()     |
| Usage       | Back Button, Plates  | Ticket Line, Printer Queue |

---

## 💻 When to use Stack and Queue?
| Scenario | Use Stack | Use Queue |
|----------|------------|------------|
| **Backtracking Problems** | ✅ Yes   | ❌ No     |
| **Job Scheduling**        | ❌ No    | ✅ Yes    |
| **Browser History**      | ✅ Yes   | ❌ No     |
| **Printer Tasks**        | ❌ No    | ✅ Yes    |

---

## 🚀 Final Note
- ✅ **Stack** is used when you need **Last In First Out (LIFO)** operations.
- ✅ **Queue** is used when you need **First In First Out (FIFO)** operations.
---

