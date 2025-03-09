# 🚀 Day 26: Mastering **Abstraction in Java**

---

## ✅ What is **Abstraction** in Java?

### 💡 Definition:
**Abstraction** is a process of **hiding the implementation details** from the user and **only showing the essential features** of the object. It focuses on **what an object does** instead of **how it does it.**

In Java, **Abstraction** is achieved in two ways:
- ✅ **Abstract Class**
- ✅ **Interface**

**Real-World Example:**

| Real-World Scenario       | Abstraction Explained                                            |
|--------------------------|------------------------------------------------------------------|
| **Driving a Car**        | You only know how to drive (accelerate, brake, steer) but don’t know the engine's internal working. |
| **Using a Mobile Phone** | You only know how to call, text, and browse the internet. You don’t know the internal circuit working. |

👉 In programming, **abstraction** hides the complex logic and shows only the required functionality to the user.

---

## ✅ Why Do We Need Abstraction?
- ✅ Reduces complexity by hiding implementation details.
- ✅ Improves code maintainability and flexibility.
- ✅ Promotes loose coupling (low dependency).
- ✅ Provides a clear structure to the program.

---

## ✅ Types of Abstraction in Java

| Type                | Achieved By      | Can Have Constructor? | Can Have Abstract Method? | Can Have Non-Abstract Method? |
|--------------------|-------------------|-----------------------|----------------------------|-------------------------------|
| **Abstract Class**  | Using `abstract` keyword in class | ✅ YES                       | ✅ YES                         | ✅ YES                        |
| **Interface**      | Using `interface` keyword       | ❌ NO                         | ✅ YES                         | ✅ (only from Java 8 onwards) |

---

## ✅ **1. Abstraction using Abstract Class (Partial Abstraction)**

### 👉 **What is Abstract Class?**
- An **abstract class** in Java is a class that **cannot be instantiated (can't create objects)**.
- It can contain **abstract methods (without body)** and **non-abstract methods (with body)**.
- It is **achieved by using the `abstract` keyword** in the class declaration.

### ✅ Syntax:
```java
abstract class Animal {
    // Abstract Method (no body)
    abstract void sound();

    // Non-Abstract Method (with body)
    void eat() {
        System.out.println("I am eating...");
    }
}
```

### ✅ Real-World Example of Abstract Class
**Scenario:** Imagine you are designing a software for an animal zoo.

### ✅ Code:
```java
abstract class Animal {
    // Abstract Method
    abstract void sound();

    // Non-Abstract Method
    void eat() {
        System.out.println("I am eating...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.eat();

        Cat cat = new Cat();
        cat.sound();
        cat.eat();
    }
}
```

### ✅ Output:
```
Dog barks
I am eating...
Cat meows
I am eating...
```

### ✅ Explanation:
- We created an **abstract class `Animal`** with one abstract method `sound()` and one normal method `eat()`.
- We provided different implementations for `sound()` in the subclasses (`Dog` and `Cat`).
- **This is called Abstraction** because we only focused on the sound behavior, hiding the complex logic.

---

## ✅ **2. Abstraction using Interface (100% Abstraction)**

### 👉 **What is Interface?**
- An **interface** in Java is a **completely abstract class** that contains only abstract methods (without body) by default.
- From Java 8 onwards, it can have **default methods (with body)**.
- It is achieved using the `interface` keyword.

### ✅ Syntax:
```java
interface Vehicle {
    void start();
    void stop();
}
```

### ✅ Real-World Example of Interface
**Scenario:** Imagine you are designing software for different types of vehicles.

### ✅ Code:
```java
interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }

    public void stop() {
        System.out.println("Car is stopping...");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting...");
    }

    public void stop() {
        System.out.println("Bike is stopping...");
    }
}

public class Transport {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();

        Vehicle bike = new Bike();
        bike.start();
        bike.stop();
    }
}
```

### ✅ Output:
```
Car is starting...
Car is stopping...
Bike is starting...
Bike is stopping...
```

### ✅ Explanation:
- The `Vehicle` interface defined the common behavior (`start()` and `stop()`).
- Different classes (`Car` and `Bike`) provided their own implementation.
- **This is called 100% Abstraction**.

---

## ✅ Key Differences: Abstract Class vs Interface

| Feature                | Abstract Class                     | Interface                             |
|------------------------|------------------------------------|-----------------------------------------|
| **Abstraction Level**  | Partial Abstraction                | 100% Abstraction                     |
| **Methods**            | Can have both abstract & non-abstract methods | Only abstract methods (by default)   |
| **Multiple Inheritance** | Not supported                      | Supported                           |
| **Constructor**        | Can have constructors               | Cannot have constructors            |
| **Access Modifier**    | Can have any access modifier        | Only public methods allowed          |

---

## ✅ Why Use Interface Over Abstract Class?
- ✅ **Achieves 100% Abstraction**.
- ✅ Supports **multiple inheritance**.
- ✅ Promotes **loose coupling** in the code.

## ✅ Why Use Abstract Class Over Interface?
- ✅ Allows both **abstract and non-abstract methods**.
- ✅ Can have **constructors**.
- ✅ Provides a common base class for related classes.

---

## ✅ Time Complexity of Abstraction

| Operation       | Time Complexity      |
|-----------------|---------------------|
| Method Call     | O(1)                 |
| Object Creation | O(1)                 |

## ✅ Space Complexity of Abstraction

| Space Usage     | Space Complexity     |
|-----------------|---------------------|
| Memory Usage    | O(1) (Reference Object) |

---

## ✅ Conclusion 🚀
- ✅ **Abstraction** hides the complex implementation and shows only essential functionality.
- ✅ **Abstract Class** provides **partial abstraction**, whereas **Interface** provides **100% abstraction**.
- ✅ It helps in achieving **loose coupling**, **code reusability**, and **better maintainability**.

---
