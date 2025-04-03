# Java Pattern Printing Programs

## Overview
This repository contains various Java programs for printing different patterns using loops. These patterns include stars, numbers, and more.

## Patterns Included

### 1. Square Star Pattern
```java
public static void pat1() {
    System.out.println("Pattern 1:");
    int num = 5;
    for (int i = 1; i <= num; i++) {
        for (int j = 1; j <= num; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
```
#### Output:
```
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
```

### 2. Right-Angled Triangle Pattern
```java
public static void pat2() {
    System.out.println("Pattern 2:");
    int num = 6;
    for (int i = 1; i <= num; i++) {
        for (int j = 1; j < i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
```
#### Output:
```
*
* *
* * *
* * * *
* * * * *
```

### 3. Number Triangle Pattern
```java
public static void pat3() {
    System.out.println("Pattern 3:");
    int num = 6;
    for (int i = 1; i <= num; i++) {
        for (int j = 1; j < i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
```
#### Output:
```
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

### 4. Repeating Number Triangle Pattern
```java
public static void pat4() {
    System.out.println("Pattern 4:");
    int num = 6;
    for (int i = 1; i <= num; i++) {
        for (int j = 1; j < i; j++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
```
#### Output:
```
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
```

### 5. Inverted Right-Angled Triangle
```java
public static void pat5() {
    System.out.println("Pattern 5:");
    int num = 6;
    for (int i = 1; i <= num; i++) {
        for (int j = 1; j <= num - i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
```
#### Output:
```
* * * * *
* * * *
* * *
* *
*
```

# Java Pattern Printing Programs

## Overview
This repository contains Java programs for printing different patterns using loops.

## Patterns Included

### 6. Number Pyramid Pattern
```java
public static void pat6() {
    System.out.println("Pattern 6:");
    int num = 6;
    for (int i = 1; i <= num; i++) {
        for (int j = 1; j <= num - i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
```
#### Output:
```
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
```

### 7. Pyramid Star Pattern
```java
public static void pat7() {
    System.out.println("Pattern 7:");
    int num = 5;
    for (int i = 0; i < num; i++) {
        for (int j = 0; j < num - i - 1; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < 2 * i + 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
```
#### Output:
```
    *    
   ***   
  *****  
 ******* 
*********
```

### 8. Reverse Diamond Pattern
```java
public static void pat8() {
    System.out.println("Pattern 8:");
    int num = 5;
    for (int i = num; i >= 0; i--) {
        for (int j = 0; j < num - i - 1; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < 2 * i + 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
```
#### Output:
```
*********
 ******* 
  *****  
   ***   
    *    
```

### 9. Diamond Pattern
```java
public static void pat9() {
    System.out.println("Pattern 9:");
    int num = 5;
    for (int i = 0; i < num; i++) {
        for (int j = 0; j < num - i - 1; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < 2 * i + 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    for (int i = num - 1; i >= 0; i--) {
        for (int j = 0; j < num - i - 1; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < 2 * i + 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
```
#### Output:
```
    *    
   ***   
  *****  
 ******* 
*********
*********
 ******* 
  *****  
   ***   
    *    
```

### 10. Hourglass Star Pattern
```java
public static void pat10() {
    System.out.println("Pattern 10:");
    int num = 6;
    for (int i = 0; i < num; i++) {
        for (int j = 0; j < i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    for (int i = num; i >= 0; i--) {
        for (int j = 0; j < i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
```
#### Output:
```
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
```



# Java Pattern Printing Programs

## Overview
This repository contains various Java programs for printing different patterns using loops. These patterns include binary triangles, number patterns, Floyd's Triangle, and alphabet patterns.

## Patterns Included

### 11. Binary Triangle Pattern
```java
public static void pat11BinaryTrianglePattern() {
    System.out.println("Pattern 11:");
    int num = 5;
    for (int i = 1; i <= num; i++) {
        int start = (i % 2 == 0) ? 0 : 1;
        for (int j = 1; j <= i; j++) {
            System.out.print(start + " ");
            start = 1 - start;
        }
        System.out.println();
    }
}
```
#### Output:
```
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
```

### 12. Number Palindrome Pyramid Pattern
```java
public static void pattern12() {
    System.out.println("Pattern 12:");
    int num = 5;
    for (int i = 1; i <= num; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }
        for (int j = i; j < num; j++) {
            System.out.print(" ");
        }
        for (int j = i; j >= 1; j--) {
            System.out.print(j);
        }
        System.out.println();
    }
}
```
#### Output:
```
1 1
12 21
123 321
1234 4321
12345 54321
```

### 13. Floyd's Triangle Pattern
```java
public static void pattern13() {
    System.out.println("Pattern 13:");
    int num = 5;
    int count = 1;
    for (int i = 1; i <= num; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();
    }
}
```
#### Output:
```
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```

### 14. Alphabet Pyramid Pattern
```java
public static void pattern14() {
    System.out.println("Pattern 14:");
    for (int i = 1; i < 5; i++) {
        for (char c = 'A'; c <= 'A' + i; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
```
#### Output:
```
A
A B
A B C
A B C D
```

### 15. Inverted Alphabet Pattern
```java
public static void pattern15() {
    System.out.println("Pattern 15:");
    for (int i = 5; i >= 1; i--) {
        for (char c = 'A'; c <= 'A' + i; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
```
#### Output:
```
A B C D E
A B C D
A B C
A B
A
```


# Pattern Programs 16 to 20

This repository contains Java implementations of pattern programs 16 to 20.

## Patterns Included
1. **Pattern 16 - Alphabet Pyramid**
2. **Pattern 17 - Symmetric Alphabet Triangle**
3. **Pattern 18 - Decreasing Alphabet Sequence**
4. **Pattern 19 - Star Diamond Pattern**
5. **Pattern 20 - Pascal's Triangle**

---

## 1️⃣ Pattern 16 - Alphabet Pyramid
```java
public static void pattern16() {
    System.out.println("Pattern 16:");
    for (int i = 0; i < 5; i++) {
        char ch = (char) ('A' + i);
        for (int j = 0; j <= i; j++) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
```
**Output:**
```
A
B B
C C C
D D D D
E E E E E
```

---

## 2️⃣ Pattern 17 - Symmetric Alphabet Triangle
```java
public static void pattern17() {
    System.out.println("Pattern 17:");
    int n = 5;
    for (int i = 0; i < n; i++) {
        for (int j = n - i; j > 1; j--) {
            System.out.print(" ");
        }
        for (int j = 0; j <= i; j++) {
            System.out.print((char) ('A' + j));
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print((char) ('A' + j));
        }
        System.out.println();
    }
}
```
**Output:**
```
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA
```

---

## 3️⃣ Pattern 18 - Decreasing Alphabet Sequence
```java
public static void pattern18() {
    System.out.println("Pattern 18:");
    int n = 5;
    for (int i = 0; i < n; i++) {
        char ch = (char) ('E' - i);
        for (int j = 0; j <= i; j++) {
            System.out.print((char) (ch + j) + " ");
        }
        System.out.println();
    }
}
```
**Output:**
```
E
D E
C D E
B C D E
A B C D E
```

---

## 4️⃣ Pattern 19 - Star Diamond Pattern
```java
public static void pattern19() {
    System.out.println("Pattern 19:");
    int n = 5;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j <= i; j++) {
            System.out.print("*");
        }
        for (int j = (n - i - 1) * 2; j > 0; j--) {
            System.out.print(" ");
        }
        for (int j = 0; j <= i; j++) {
            if (i != n - 1 || j != i)
                System.out.print("*");
        }
        System.out.println();
    }
    for (int i = n - 2; i >= 0; i--) {
        for (int j = 0; j <= i; j++) {
            System.out.print("*");
        }
        for (int j = (n - i - 1) * 2; j > 0; j--) {
            System.out.print(" ");
        }
        for (int j = 0; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
```
**Output:**
```
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
```

---

## 5️⃣ Pattern 20 - Pascal's Triangle
```java
public static void pattern20printPascal(int n) {
    System.out.println("Pattern 20:");
    for (int i = 0; i < n; i++) {
        int number = 1;
        for (int j = 0; j <= i; j++) {
            System.out.print(number + " ");
            number = number * (i - j) / (j + 1);
        }
        System.out.println();
    }
}
```
**Output:**
```
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
```

---

## How to Run the Code
1. Copy any of the pattern functions into a Java program.
2. Call the function inside `main` method.
3. Compile and run the Java program.

```java
public class PatternDemo {
    public static void main(String[] args) {
        pattern16();
        pattern17();
        pattern18();
        pattern19();
        pattern20printPascal(5);
    }
}
```
