# 📜 Day 24: Inheritance in Java - Complete Mastery 🚀💻

## ✅ What is Inheritance?
Inheritance in Java is a concept where one class can acquire (reuse) the properties and behaviors (methods) of another class. This promotes **code reusability** and minimizes code duplication.

In simple terms:
- 📄 **Parent Class (Base Class):** The class that provides properties and methods.
- 📜 **Child Class (Derived Class):** The class that inherits the properties and methods.

### 📊 Key Points About Inheritance
- 🚀 **It provides Code Reusability.**
- 💻 Reduces Redundant Code.
- 💡 Makes maintenance easier.
- ⚙ Supports Polymorphism and Encapsulation.

---

## ✅ Why Do We Use Inheritance In Real Life?
### **Real-Life Example:**
- 📱 Imagine you have a base class called **Mobile** that contains properties like:
  ```java
  class Mobile {
      String brand;
      int batteryCapacity;

      public void call() {
          System.out.println("Calling...");
      }
  }
  ```
- Now, if you want to create **Smartphone, iPhone, FeaturePhone**, you can simply extend the **Mobile class** instead of writing code from scratch.


---

## ✅ Types of Inheritance in Java

### 📌 1. Single Inheritance
👉 **One Parent Class - One Child Class**

**Example:**
```java
class Animal {
    void eat() {
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
```
**Output:**
```
This animal eats food
Dog barks
```

**Real-World Example:**
- 🚗 **Car** class --> **ElectricCar** class
- 📞 **Mobile** class --> **Smartphone** class

✅ **Time Complexity:** O(1)
✅ **Space Complexity:** O(1)

---

### 📌 2. Multilevel Inheritance
👉 **Grandparent → Parent → Child**

**Example:**
```java
class Animal {
    void eat() {
        System.out.println("This animal eats food");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammals can walk");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.walk();
        d.bark();
    }
}
```

**Output:**
```
This animal eats food
Mammals can walk
Dog barks
```

**Real-World Example:**
- 📱 **Device → Mobile → Smartphone**
- 🚗 **Vehicle → Car → ElectricCar**

✅ **Time Complexity:** O(1)
✅ **Space Complexity:** O(1)

---

### 📌 3. Hierarchical Inheritance
👉 **One Parent - Multiple Child Classes**

**Example:**
```java
class Animal {
    void eat() {
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.eat();
        d.bark();
        c.eat();
        c.meow();
    }
}
```

**Output:**
```
This animal eats food
Dog barks
This animal eats food
Cat meows
```

**Real-World Example:**
- 🧠 **Person → Doctor, Engineer, Teacher**
- 🚗 **Vehicle → Bike, Car, Truck**

✅ **Time Complexity:** O(1)
✅ **Space Complexity:** O(1)

---

### 📌 4. Multiple Inheritance Using Interface
👉 **Java Does NOT Support Multiple Inheritance Using Classes BUT Supports It Using Interface.**

**Example:**
```java
interface Animal {
    void eat();
}

interface Bird {
    void fly();
}

class Bat implements Animal, Bird {
    public void eat() {
        System.out.println("Bat eats insects");
    }

    public void fly() {
        System.out.println("Bat can fly");
    }
}

public class Main {
    public static void main(String[] args) {
        Bat b = new Bat();
        b.eat();
        b.fly();
    }
}
```

**Output:**
```
Bat eats insects
Bat can fly
```

✅ **Time Complexity:** O(1)
✅ **Space Complexity:** O(1)

**Real-World Example:**
- 🛩 **Bird → Can Fly** & **Animal → Can Eat** → **Bat**
- 🚀 **Vehicle → Can Move** & **Ship → Can Sail** → **Amphibious Vehicle**

---

### 📌 5. Hybrid Inheritance Using Interface
👉 **Combination of Multilevel + Hierarchical + Multiple Inheritance**

**Example:**
```java
interface Animal {
    void eat();
}

interface Mammal {
    void walk();
}

class Dog implements Animal, Mammal {
    public void eat() {
        System.out.println("Dog eats food");
    }

    public void walk() {
        System.out.println("Dog can walk");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.walk();
    }
}
```

**Output:**
```
Dog eats food
Dog can walk
```

✅ **Time Complexity:** O(1)
✅ **Space Complexity:** O(1)

**Real-World Example:**
- 🚗 **ElectricCar → Car + Battery + Vehicle**
- 📞 **Smartphone → Mobile + Camera + Touchscreen**

---

## ✅ Why Is Multiple Inheritance Using Classes Not Possible In Java?
- **Java does not support Multiple Inheritance using classes** to avoid **ambiguity problem**.
- If two parent classes have the same method and the child class inherits both, it causes confusion about which method to use.
- To avoid this, Java provides **Interface-based Multiple Inheritance**.

---

## ✅ Final Thought 💯🚀
💯 **Inheritance** is the most powerful concept in Java for **Code Reusability**, **Minimizing Redundant Code**, and **Easy Maintenance**. 🚀

