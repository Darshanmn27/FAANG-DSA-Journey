# 🚀 Day 25: Mastering Polymorphism in Java (OOPs)

---

## 📜 What is Polymorphism?
**Polymorphism** means **"many forms"**. It is one of the most powerful and fundamental concepts in **Object-Oriented Programming (OOPs)**.

In **Java**, Polymorphism allows **one interface to have multiple implementations**, or in simple words:
- **A single action** can be performed in **different ways**.

> 💡 Example: A person behaves **differently** in different situations.
- **At Home:** Friendly and relaxed.
- **At Office:** Professional and focused.
- **At Party:** Energetic and fun.

The behavior (method) changes according to the situation (object).

---

## ✅ Types of Polymorphism in Java
Polymorphism is broadly divided into **two types**:

| Type | Description |
|-------|-------------|
| 1. **Compile-Time Polymorphism (Static)** | It is resolved at compile-time. Also known as **Method Overloading**. |
| 2. **Run-Time Polymorphism (Dynamic)** | It is resolved at run-time. Also known as **Method Overriding**. |

---

## 💯 1. Compile-Time Polymorphism (Method Overloading)
### 🚀 Definition
**Method Overloading** is when **multiple methods in a class** have the **same name** but **different parameters (number or type)**.

👉 The method to be called is **determined at compile-time** (hence static polymorphism).


### 💡 Real-World Example
Imagine a **calculator** that can:
- **Add two integers**.
- **Add three integers**.
- **Add two double values**.

✅ **Same method name:** `add()`.
✅ **Different parameters:** number or type of arguments.

### 💻 Code Example (Method Overloading)
```java
class Calculator {

    // Overloaded method - add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method - add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method - add two double values
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(5, 10));    // Output: 15
        System.out.println(calc.add(5, 10, 15)); // Output: 30
        System.out.println(calc.add(5.5, 10.5)); // Output: 16.0
    }
}
```

✅ **Why is it Compile-Time Polymorphism?**
- The method to be called is determined **at compile-time** based on the method signature.
- Hence it is called **Compile-Time Polymorphism**.

### 📊 Time and Space Complexity
| Operation | Time Complexity | Space Complexity |
|------------|----------------|-----------------|
| Method Overloading | O(1) | O(1) |


---

## 💯 2. Run-Time Polymorphism (Method Overriding)
### 🚀 Definition
**Method Overriding** happens when **a subclass** provides a **specific implementation** of a method that is already defined in its **parent class**.

👉 The method to be called is determined **at run-time** based on the object created.
👉 It supports **dynamic polymorphism**.

### 💡 Real-World Example
Imagine a **Bird**.
- A **Sparrow** flies low.
- An **Eagle** flies high.
- A **Penguin** doesn't fly.

✅ **Same method name:** `fly()`.
✅ **Different behavior** based on the object type.

### 💻 Code Example (Method Overriding)
```java
class Bird {
    void fly() {
        System.out.println("Bird can fly");
    }
}

class Sparrow extends Bird {
    void fly() {
        System.out.println("Sparrow flies low");
    }
}

class Eagle extends Bird {
    void fly() {
        System.out.println("Eagle flies high");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird bird1 = new Sparrow();
        bird1.fly();  // Output: Sparrow flies low

        Bird bird2 = new Eagle();
        bird2.fly();  // Output: Eagle flies high
    }
}
```

✅ **Why is it Run-Time Polymorphism?**
- The method to be called is determined **at run-time** based on the object (`Sparrow` or `Eagle`).
- Hence it is called **Run-Time Polymorphism**.

### 📊 Time and Space Complexity
| Operation | Time Complexity | Space Complexity |
|------------|----------------|-----------------|
| Method Overriding | O(1) | O(1) |


---

## 💡 Difference Between Overloading and Overriding

| Aspect | Method Overloading | Method Overriding |
|--------|------------------|------------------|
| Type of Polymorphism | Compile-Time | Run-Time |
| Method Name | Same | Same |
| Parameters | Different (number or type) | Same |
| Class Involved | Same class | Different classes (Parent-Child) |
| Binding Time | Compile-Time | Run-Time |


---

## ✅ Why Java Doesn't Support Multiple Inheritance Using Classes
### 🚨 Problem in Multiple Inheritance
If Java allowed **multiple inheritance**, there would be a huge **ambiguity problem**.

👉 Example:
- Class A has `show()`.
- Class B has `show()`.
- Class C inherits both A and B.
- **Which show() should Class C call?** 🤯

### 💻 Code Example
```java
class A {
    void show() {
        System.out.println("Class A");
    }
}

class B {
    void show() {
        System.out.println("Class B");
    }
}

class C extends A, B { // Error!! Java doesn't support this.
}
```

👉 To avoid this confusion, Java **DOES NOT** support **multiple inheritance** using classes.
👉 Instead, Java uses **Interfaces** to achieve **multiple inheritance**.

---

## 🎉 Summary of Polymorphism
| Type of Polymorphism | Key Concept | Real-World Example |
|---------------------|-------------|------------------|
| **Compile-Time (Overloading)** | Same method, different parameters | Calculator with different add methods |
| **Run-Time (Overriding)** | Same method, different behavior | Different birds flying differently |

✅ **Polymorphism = One Action, Many Forms.** 💯🔥


---

## 💯 Key Interview Questions
1. **What is Polymorphism in Java?**
2. **What are the two types of Polymorphism?**
3. **Explain Method Overloading with an example.**
4. **Explain Method Overriding with an example.**
5. **Why doesn't Java support multiple inheritance using classes?**
6. **What is the advantage of Run-Time Polymorphism?**


---