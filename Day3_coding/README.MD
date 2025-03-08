# 🚀 Day 3: Number Conversions (Binary, Octal, Hexadecimal)

## ✅ Objective
In this session, we will learn how to perform various number conversions using **different approaches** including:
- **Built-in Methods** (Quick & Easy)
- **Manual Conversion (Logic)** (For Strong Core Concept)
- **Time Complexity (TC)** & **Space Complexity (SC)**
- **Clean Java Code with Proper Documentation**

---

## 📊 Conversion Types
### 1. Decimal to Binary
### 2. Decimal to Octal
### 3. Decimal to Hexadecimal
### 4. Binary to Decimal
### 5. Octal to Decimal
### 6. Hexadecimal to Decimal
---

## 💻 Conversion 1: Decimal to Binary
### ✅ Method 1: Using Built-in Function (Integer.toBinaryString)

### **Code:**
```java
public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 15;
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary Representation: " + binary);
    }
}
```

### ✅ Output:
```
Binary Representation: 1111
```

### ✅ Time Complexity (TC):
- **O(log2(N))**  because each division by 2 reduces the input size by half.

### ✅ Space Complexity (SC):
- **O(1)** because no extra space is used apart from output.

---

### ✅ Method 2: Manual Conversion (Logic)

### **Code:**
```java
public class DecimalToBinaryManual {
    public static void main(String[] args) {
        int decimal = 15;
        String binary = "";

        while (decimal > 0) {
            binary = (decimal % 2) + binary;
            decimal /= 2;
        }

        System.out.println("Binary Representation: " + binary);
    }
}
```

### ✅ Output:
```
Binary Representation: 1111
```

### ✅ Time Complexity (TC):
- **O(log2(N))**

### ✅ Space Complexity (SC):
- **O(1)**

---

## 💻 Conversion 2: Decimal to Octal
### ✅ Method 1: Using Built-in Function (Integer.toOctalString)

### **Code:**
```java
public class DecimalToOctal {
    public static void main(String[] args) {
        int decimal = 15;
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal Representation: " + octal);
    }
}
```

### ✅ Output:
```
Octal Representation: 17
```

### ✅ Time Complexity (TC):
- **O(log8(N))**

### ✅ Space Complexity (SC):
- **O(1)**

---

### ✅ Method 2: Manual Conversion (Logic)

### **Code:**
```java
public class DecimalToOctalManual {
    public static void main(String[] args) {
        int decimal = 15;
        String octal = "";

        while (decimal > 0) {
            octal = (decimal % 8) + octal;
            decimal /= 8;
        }

        System.out.println("Octal Representation: " + octal);
    }
}
```

### ✅ Output:
```
Octal Representation: 17
```

### ✅ Time Complexity (TC):
- **O(log8(N))**

### ✅ Space Complexity (SC):
- **O(1)**

---

## 💻 Conversion 3: Decimal to Hexadecimal
### ✅ Method 1: Using Built-in Function (Integer.toHexString)

### **Code:**
```java
public class DecimalToHexadecimal {
    public static void main(String[] args) {
        int decimal = 15;
        String hex = Integer.toHexString(decimal);
        System.out.println("Hexadecimal Representation: " + hex);
    }
}
```

### ✅ Output:
```
Hexadecimal Representation: f
```

### ✅ Time Complexity (TC):
- **O(log16(N))**

### ✅ Space Complexity (SC):
- **O(1)**

---

### ✅ Method 2: Manual Conversion (Logic)

### **Code:**
```java
public class DecimalToHexadecimalManual {
    public static void main(String[] args) {
        int decimal = 15;
        String hex = "";
        char[] hexArray = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while (decimal > 0) {
            hex = hexArray[decimal % 16] + hex;
            decimal /= 16;
        }

        System.out.println("Hexadecimal Representation: " + hex);
    }
}
```

### ✅ Output:
```
Hexadecimal Representation: F
```

### ✅ Time Complexity (TC):
- **O(log16(N))**

### ✅ Space Complexity (SC):
- **O(1)**


## 🚀 4. Binary to Decimal
### ✅ Method 1: Using Built-in Function (Integer.parseInt)

```java
public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "1111";
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal Representation: " + decimal);
    }
}
```

**Output:**
```
Decimal Representation: 15
```

### ✅ Method 2: Manual Conversion (Logic)
```java
public class BinaryToDecimalManual {
    public static void main(String[] args) {
        String binary = "1111";
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        System.out.println("Decimal Representation: " + decimal);
    }
}
```

**Output:**
```
Decimal Representation: 15
```

---

## 🚀 5. Octal to Decimal
### ✅ Method 1: Using Built-in Function (Integer.parseInt)

```java
public class OctalToDecimal {
    public static void main(String[] args) {
        String octal = "17";
        int decimal = Integer.parseInt(octal, 8);
        System.out.println("Decimal Representation: " + decimal);
    }
}
```

**Output:**
```
Decimal Representation: 15
```

### ✅ Method 2: Manual Conversion (Logic)
```java
public class OctalToDecimalManual {
    public static void main(String[] args) {
        String octal = "17";
        int decimal = 0;
        int power = 0;

        for (int i = octal.length() - 1; i >= 0; i--) {
            decimal += (octal.charAt(i) - '0') * Math.pow(8, power);
            power++;
        }

        System.out.println("Decimal Representation: " + decimal);
    }
}
```

**Output:**
```
Decimal Representation: 15
```

---

## 🚀 6. Hexadecimal to Decimal
### ✅ Method 1: Using Built-in Function (Integer.parseInt)

```java
public class HexadecimalToDecimal {
    public static void main(String[] args) {
        String hex = "F";
        int decimal = Integer.parseInt(hex, 16);
        System.out.println("Decimal Representation: " + decimal);
    }
}
```

```

### ✅ Method 2: Manual Conversion (Logic)
```
java
public class HexadecimalToDecimalManual {
    public static void main(String[] args) {
        String hex = "F";
        int decimal = 0;
        int power = 0;

        for (int i = hex.length() - 1; i >= 0; i--) {
            char ch = hex.charAt(i);
            int value;

            if (ch >= '0' && ch <= '9') {
                value = ch - '0';
            } else {
                value = ch - 'A' + 10;
            }

            decimal += value * Math.pow(16, power);
            power++;
        }

        System.out.println("Decimal Representation: " + decimal);
    }
}
```
```
## 💯 Key Learning Outcomes
- ✅ You learned how to **convert numbers** between different number systems.
- ✅ Understood **Time Complexity (TC)** and **Space Complexity (SC)**.
- ✅ Practiced both **Built-in Methods** and **Manual Conversions**.
- ✅ Improved **Core Java Coding Skills** 💻💎

**Stay tuned! 💯🚀🔥** ```

