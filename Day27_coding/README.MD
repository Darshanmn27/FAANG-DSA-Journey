# 🚀 Day 27: Encapsulation in Java 💯🔥

## 📜 What is Encapsulation?
**Encapsulation** is one of the core principles of **Object-Oriented Programming (OOP)** that is used to **wrap up data (variables) and code (methods) together** as a single unit (class). It helps in **hiding the internal details of how an object works** and only exposes what is necessary.

In simple terms:
- ✅ **Binding Data (variables) and Methods (functions) together**.
- ✅ **Hiding internal details (data hiding)** and only showing required functionality.
- ✅ Achieved using **private variables** and **public getter/setter methods**.

---

## 📊 Why is Encapsulation Important?
### ✔ Data Hiding
- Protects the internal state of the object from unauthorized access.
- Keeps your data safe from unwanted modifications.

### ✔ Control Over Data
- Using getter and setter methods, you can **control how the data is modified**.
- Prevent unwanted changes to sensitive data.

### ✔ Flexibility and Maintenance
- Easy to modify the code without affecting other parts of the program.
- Increases code **reusability and maintainability**.

---

## 💻 Real-World Example of Encapsulation
### 🎓 Example 1: ATM Machine
- **Data** (your bank balance, account number, etc.) is **hidden**.
- **Methods** (withdrawMoney(), checkBalance()) **control** access to the data.
- You cannot directly access your bank balance; you can only access it through the ATM interface.

### 🚗 Example 2: Car
- **Data:** Engine, Speed, Fuel Level, etc. (hidden)
- **Methods:** startCar(), stopCar(), accelerate() (controls access)
- You can’t directly access the engine’s internal components; you can only use the controls.

---

## ✅ How to Achieve Encapsulation in Java?
Encapsulation is achieved by:
1. **Making class variables (fields) private**.
2. **Providing public getter and setter methods** to access and modify the variables.

---

## 💻 Example Code of Encapsulation
### 💯 Example 1: Bank Account (Data Hiding)
```java
class BankAccount {
    private double balance; // Data Hiding

    // Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Getter Method - To Access Balance
    public double getBalance() {
        return balance;
    }

    // Setter Method - To Deposit Money
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid Amount!");
        }
    }

    // Setter Method - To Withdraw Money
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance or Invalid Amount!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        // Accessing Balance Using Getter
        System.out.println("Initial Balance: $" + account.getBalance());

        // Depositing Money
        account.deposit(500);
        System.out.println("Balance after deposit: $" + account.getBalance());

        // Withdrawing Money
        account.withdraw(200);
        System.out.println("Balance after withdrawal: $" + account.getBalance());
    }
}
```

### 💻 Output:
```
Initial Balance: $1000.0
Balance after deposit: $1500.0
Balance after withdrawal: $1300.0
```

✅ **Explanation:**
- We made the `balance` variable private.
- We provided **getter** to access the balance and **setter** to modify it.
- This ensures the **balance** variable is not directly accessible.

---

## ✅ Example 2: Car (Encapsulation)
```java
class Car {
    private String engine;
    private int speed;

    public Car(String engine) {
        this.engine = engine;
        this.speed = 0;
    }

    public void startCar() {
        System.out.println("Car Started with " + engine);
    }

    public void accelerate() {
        speed += 10;
        System.out.println("Car Accelerated. Speed: " + speed + " km/h");
    }

    public void stopCar() {
        System.out.println("Car Stopped.");
        speed = 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("V8 Engine");

        car.startCar();
        car.accelerate();
        car.accelerate();
        car.stopCar();
    }
}
```

### 💻 Output:
```
Car Started with V8 Engine
Car Accelerated. Speed: 10 km/h
Car Accelerated. Speed: 20 km/h
Car Stopped.
```

✅ **Explanation:**
- The **engine** and **speed** are private (encapsulated).
- We can only modify them using the public methods (startCar, accelerate, stopCar).
- This ensures the car’s internal data is protected.

---

## 📊 Advantages of Encapsulation
| Feature                | Benefit                                                                 |
|------------------------|-------------------------------------------------------------------------|
| ✅ Data Hiding         | Protects internal data from unauthorized access.                        |
| ✅ Controlled Access  | Provides controlled access through getter and setter methods.           |
| ✅ Improved Flexibility| Easy to modify and maintain code.                                       |
| ✅ Enhanced Security   | Sensitive data is not exposed directly.                                |

---

## ✅ Summary (One-Liner)
👉 **Encapsulation = Data Hiding + Controlled Access.** 💯🔥  
👉 You can only access or modify data through getter and setter methods. 💻🔥  
👉 It increases security, flexibility, and better maintainability in code. 💯🔥

---

## 💯 Interview Questions on Encapsulation
### Q1. What is Encapsulation?
- Encapsulation is the OOP concept of **binding data (variables) and methods (functions) together** and hiding the internal details from the user.

### Q2. How do you achieve Encapsulation in Java?
- By **declaring variables as private** and **providing public getter/setter methods** to access and modify them.

### Q3. What is the major advantage of Encapsulation?
- **Data Hiding** and **Controlled Access**.
- Protects internal data from unauthorized access.

### Q4. Is Encapsulation like Data Hiding?
- Yes, **Encapsulation = Data Hiding + Controlled Access**.
- Data can only be accessed or modified using getter and setter methods.

### Q5. Can we achieve Encapsulation without getter and setter?
- No, because without getter/setter, we cannot control access to private data.

---