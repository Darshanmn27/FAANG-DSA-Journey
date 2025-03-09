# 🚀 Exception Handling in Java - Professional Documentation

## 📖 Table of Contents
- [What is Exception Handling?](#what-is-exception-handling)
- [Why Use Exception Handling?](#why-use-exception-handling)
- [Hierarchy of Exceptions in Java](#hierarchy-of-exceptions-in-java)
- [Types of Exceptions](#types-of-exceptions)
- [Commonly Used Exceptions](#commonly-used-exceptions)
- [Exception Handling Keywords](#exception-handling-keywords)
- [Try-Catch Block](#try-catch-block)
- [Finally Block](#finally-block)
- [Throw and Throws Keyword](#throw-and-throws-keyword)
- [Checked vs Unchecked Exceptions](#checked-vs-unchecked-exceptions)
- [Custom Exceptions](#custom-exceptions)
- [Exception Propagation](#exception-propagation)
- [Best Practices for Exception Handling](#best-practices-for-exception-handling)
- [Real World Examples](#real-world-examples)
- [Interview Questions](#interview-questions)

---

## 📌 What is Exception Handling?
Exception handling is a mechanism in Java to handle runtime errors so that the normal flow of the application can be maintained.

In simple words, **when an error occurs during the execution of a program, it terminates abnormally.** Exception handling allows us to catch those errors and handle them gracefully.

Example:
```java
int a = 10;
int b = 0;
int c = a / b;  // This will throw ArithmeticException
```

Without exception handling, the above code will throw an error and terminate the program.

---

## 📌 Why Use Exception Handling?
1. **Prevents program crash** in case of unexpected errors.
2. Ensures that the **application flow is maintained.**
3. Helps in **identifying bugs and logical errors.**
4. Provides a way to communicate error messages.

---

## 📌 Hierarchy of Exceptions in Java
The root class of all exceptions in Java is **Throwable.** It has two major branches:

- **Exception** - Represents recoverable exceptions.
- **Error** - Represents unrecoverable errors.

```plaintext
Throwable
│
├── Exception
│   ├── IOException
│   ├── SQLException
│   ├── ArithmeticException
│   ├── NullPointerException
│
└── Error
    ├── OutOfMemoryError
    ├── StackOverflowError
```

---

## 📌 Types of Exceptions
### 1. Checked Exceptions
- These exceptions are checked at compile-time.
- If not handled, it results in a compilation error.

Example: IOException, SQLException

### 2. Unchecked Exceptions
- These exceptions are checked at runtime.
- They are also known as **Runtime Exceptions.**

Example: ArithmeticException, NullPointerException

---

## 📌 Commonly Used Exceptions
| Exception Class         | Description |
|------------------------|--------------|
| ArithmeticException    | Thrown when divided by zero. |
| NullPointerException   | Thrown when referencing a null object. |
| IOException            | Thrown when an I/O operation fails. |
| SQLException           | Thrown when there is a database error. |
| ArrayIndexOutOfBounds  | Thrown when accessing an invalid array index. |

---

## 📌 Exception Handling Keywords
Java provides **5 major keywords** for exception handling:

1. **try**
2. **catch**
3. **finally**
4. **throw**
5. **throws**

### ✅ Try-Catch Block
This is the most commonly used block for handling exceptions.

```java
try {
    int a = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero.");
}
```

### ✅ Finally Block
The **finally block** always executes, regardless of whether an exception occurs or not.

```java
try {
    int a = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Exception caught");
} finally {
    System.out.println("This block will always execute");
}
```

### ✅ Throw Keyword
The **throw** keyword is used to throw an exception manually.

```java
throw new ArithmeticException("Division by zero");
```

### ✅ Throws Keyword
The **throws** keyword is used to declare exceptions in the method signature.

```java
public void readFile() throws IOException {
    FileReader file = new FileReader("file.txt");
}
```

---

## 📌 Checked vs Unchecked Exceptions
| Checked Exceptions    | Unchecked Exceptions   |
|---------------------|------------------------|
| Checked at compile-time. | Checked at runtime.   |
| Must be handled using try-catch or throws. | No need to handle explicitly. |
| Example: IOException, SQLException. | Example: NullPointerException, ArithmeticException. |

---

## 📌 Custom Exceptions
You can create your own custom exceptions by extending the `Exception` class.

```java
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyException("Custom Exception Occurred");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

---

## 📌 Exception Propagation
Exception propagation means **passing the exception from one method to another.**

```java
public class Main {
    public void method1() {
        method2();
    }

    public void method2() {
        int a = 10 / 0;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.method1();
    }
}
```
The exception will propagate from **method2** → **method1** → **main.**

---

## 📌 Best Practices for Exception Handling
1. **Never catch generic Exception (catch(Exception e)).**
2. Always catch specific exceptions.
3. Use `finally` to close resources.
4. Avoid using exceptions for control flow.
5. Log exceptions properly.

---

## 📌 Real World Examples
### Example 1: File Handling
```java
import java.io.*;

public class FileRead {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("file.txt");
            BufferedReader br = new BufferedReader(file);
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("File not found.");
        }
    }
}
```

### Example 2: Custom Exception
```java
class AgeException extends Exception {
    AgeException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            int age = 15;
            if (age < 18) {
                throw new AgeException("Age is less than 18.");
            }
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

---

## 📌 Interview Questions
1. What is exception handling in Java?
2. Explain checked and unchecked exceptions.
3. What is the difference between `throw` and `throws`?
4. Can we have multiple catch blocks?
5. Explain custom exceptions with an example.
6. What is exception propagation?
7. Why is the finally block used?

---
