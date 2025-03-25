# Reverse String and Recursion Programs in Java

## Description
This repository contains various Java programs demonstrating recursion techniques for different problems, including:

- Checking if a string is a palindrome
- Printing a greeting message multiple times recursively
- Counting numbers with recursion
- Printing even and odd numbers in a given range
- Printing a series of numbers in ascending and descending order
- Reversing an array using recursion

These programs help understand recursion, base cases, and recursive calls in Java.

---

## Table of Contents
- [Reverse String Check](#reverse-string-check)
- [Recursive Factorial and Counting](#recursive-factorial-and-counting)
- [Even and Odd Numbers in a Range](#even-and-odd-numbers-in-a-range)
- [Number Series](#number-series)
- [Reverse an Array](#reverse-an-array)
- [How to Run](#how-to-run)
- [Author](#author)

---

## Reverse String Check
### File: `ReverseString.java`
This program checks whether a given string is a palindrome using recursion.

```java
public class ReverseString {
    public static boolean ispali(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return ispali(str, start + 1, end - 1);
    }
    
    public static void main(String[] args) {
        String s = "malayalam";
        System.out.println(ispali(s, 0, s.length() - 1));
    }
}
```

---

## Recursive Factorial and Counting
### File: `RecFact.java`
This program prints a greeting message recursively and performs a counting operation using recursion.

```java
import java.util.*;
public class RecFact {
    public static void basecase(int num) {
        if (num == 0) {
            return;
        }
        System.out.println("Darshan good morning");
        basecase(num - 1);
    }
    
    public static void count(int count) {
        if (count == 50) {
            return;
        }
        System.out.println(count + 4);
        count(count + 4);
    }
    
    public static void main(String[] args) {
        basecase(5);
        count(6);
    }
}
```

---

## Even and Odd Numbers in a Range
### File: `EvenOddNumbers.java`
This program prints even and odd numbers within a given range using recursion.

```java
import java.util.*;
public class EvenOddNumbers {
    public static void evenNumbersInRange(int num) {
        if (num < 0) {
            return;
        }
        System.out.print(num + " ");
        evenNumbersInRange(num - 2);
    }
    
    public static void oddNumbersInRange(int num) {
        if (num < 1) {
            return;
        }
        System.out.print(num + " ");
        oddNumbersInRange(num - 2);
    }
    
    public static void main(String[] args) {
        evenNumbersInRange(30);
        System.out.println("\nOdd numbers from range:");
        oddNumbersInRange(27);
    }
}
```

---

## Number Series
### File: `NumberSeries.java`
This program prints a series of numbers from 1 to N and then in reverse order.

```java
public class NumberSeries {
    public static void seriesNumber(int i, int j) {
        if (i > j) {
            return;
        }
        System.out.print(i + " ");
        seriesNumber(i + 1, j);
    }
    
    public static void reverseSeries(int i, int j) {
        if (i < j) {
            return;
        }
        System.out.print(i + " ");
        reverseSeries(i - 1, j);
    }
    
    public static void main(String[] args) {
        System.out.println("Number series from 1 to 5:");
        seriesNumber(1, 5);
        System.out.println("\nNumber series from 5 to 1:");
        reverseSeries(5, 1);
    }
}
```

---

## Reverse an Array
### File: `ReverseArray.java`
This program reverses an array using recursion.

```java
import java.util.*;
public class ReverseArray {
    public static void reverseArray(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(arr));
        reverseArray(arr, 0, arr.length - 1);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
```

---

## How to Run
### Steps to run the programs:
1. Install [Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
2. Compile the Java file:
   ```sh
   javac ReverseString.java
   javac RecFact.java
   javac EvenOddNumbers.java
   javac NumberSeries.java
   javac ReverseArray.java
   ```
3. Run the compiled Java class:
   ```sh
   java ReverseString
   java RecFact
   java EvenOddNumbers
   java NumberSeries
   java ReverseArray
   ```

---

## Author
- **Darshan M N** 🚀
- Connect on [GitHub](https://github.com/Darshanmn27)
- Reach out on [LinkedIn](https://www.linkedin.com/in/darshan-m-n-7546b632b/)

---

This repository demonstrates fundamental recursion concepts in Java. Feel free to fork, modify, and contribute! Happy coding! 😊

