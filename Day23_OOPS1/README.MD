# 💻 Day 23 - Object & Class in Java (OOPS)

## 🚀 What is Object-Oriented Programming (OOPS)?
Object-Oriented Programming (OOP) is a programming paradigm based on the concept of "objects," which contain **data (fields)** and **methods (functions)**. It models real-world objects and their interactions in the form of **code**.

---

## ✅ What is an Object in Java?
### 📌 Definition:
An **object** is an instance of a class that has **state (attributes)** and **behavior (methods)**.

### 📌 Real-World Examples:
| Real-World Object | State (Attributes) | Behavior (Methods) |
|------------------|--------------------|--------------------|
| 🚗 Car             | Color, Model, Speed  | Start(), Stop(), Accelerate() |
| 🏠 House           | Address, Color, Rooms | OpenDoor(), CloseWindow() |
| 📱 Mobile Phone   | Brand, Model, Battery | Call(), Text(), Charge() |

---

## ✅ What is a Class in Java?
### 📌 Definition:
A **class** is a blueprint or template that defines the **properties (variables)** and **behaviors (methods)** of an object.

### 📌 Real-World Example:
Imagine you are building a **Car Showroom**.
- The **Car** is an Object.
- The **Car Blueprint (Design)** is the Class.
- The Car Blueprint contains: **Color, Model, Brand, Speed**, etc.

---

## ✅ How Object & Class Work Together?
### 📜 Simple Example Code:
```java
class Car {
    // Attributes (State)
    String color;
    String model;

    // Method (Behavior)
    void drive() {
        System.out.println("The car is driving");
    }

    void brake() {
        System.out.println("The car has stopped");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an Object of Car Class
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.model = "Tesla Model S";

        // Accessing Methods
        myCar.drive();
        myCar.brake();
    }
}
```

### ✅ Output:
```
The car is driving
The car has stopped
```

### ✅ Explanation:
- We created a **Car class** with **attributes** (color, model) and **methods** (drive(), brake()).
- We then created an **Object (myCar)** and accessed its properties and methods.

---

## ✅ How Does Object Work Internally In Java?
### 📜 Internal Flow:
1. **Class is loaded into JVM (Java Virtual Machine)**.
2. When you use the `new` keyword, memory is allocated in the Heap.
3. JVM creates an Object Reference.
4. The Reference is used to access the Object's State and Behavior.

### ✅ Behind The Scenes:
```
Car myCar = new Car();
```
- `new Car()` → Allocates Memory in Heap.
- `myCar` → Holds Reference of the Object.
- JVM links Reference → Object in Heap.

---

## ✅ Real-World Example: Amazon E-commerce Website
### 📜 Scenario:
Imagine you are building **Amazon** where users can **Add To Cart**.

### ✅ Object:
- **Product** → Mobile Phone
- **Attributes:** Name, Brand, Price, Stock
- **Behavior:** AddToCart(), BuyNow()

### ✅ Class:
```java
class Product {
    String name;
    String brand;
    int price;

    void addToCart() {
        System.out.println(name + " added to cart");
    }

    void buyNow() {
        System.out.println("Purchased " + name);
    }
}
```

### ✅ Output:
```
iPhone 15 added to cart
Purchased iPhone 15
```

---

## ✅ Key Points to Remember
| Feature       | Object            | Class            |
|---------------|-------------------|-------------------|
| Definition     | Real-World Entity | Blueprint/Template|
| Example       | Car, Mobile, House | Design of Car     |
| Memory        | Allocated in Heap  | No Memory Allocation|
| Instance      | Can Create Multiple | Single Blueprint  |

---

## ✅ Professional-Level Interview Question
### 💎 Q1: What is the Difference Between Object & Class?
- **Object:** Real-World Entity (Car, House, Mobile).
- **Class:** Blueprint to create an object.

### 💎 Q2: Can You Create An Object Without Class?
- **No**, because the class is the blueprint that defines the object.

### 💎 Q3: What Happens If You Don't Create An Object?
- The class exists but cannot perform any action without an object.

### 💎 Q4: How Is Memory Allocated For An Object?
- Memory is allocated in the **Heap Area** during runtime.

### 💎 Q5: Can One Class Have Multiple Objects?
- ✅ YES! One Class Can Have Unlimited Objects.

Example:
```java
Car car1 = new Car();
Car car2 = new Car();
Car car3 = new Car();
```

---

## ✅ Best Practice To Remember
1. **Always use meaningful class names.** ✔
2. **Follow camelCase naming conventions.** ✔
3. **Separate logic using methods.** ✔
4. **Always create objects using `new` keyword.** ✔

---

## ✅ 🔥 BONUS - Real Life Example You Can Relate
### 🛒 E-commerce Website (Flipkart/Amazon):
- ✅ **Product is an Object.**
- ✅ **Product Blueprint is a Class.**
- ✅ **AddToCart() is Behavior.**
- ✅ **Price, Name are Attributes.**

