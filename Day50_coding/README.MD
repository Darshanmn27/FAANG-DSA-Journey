# Palindrome and String Manipulation Challenges

This README covers the following string-based coding challenges in Java along with their Time Complexity (TC) and Space Complexity (SC):

1. **Check if a given string is palindrome or not**
2. **Count number of vowels, consonants, and spaces in a string**
3. **Find the ASCII value of a character**
4. **Remove all vowels from the string**
5. **Remove spaces from a string**
6. **Remove characters from a string except alphabets**
7. **Reverse a string**

---

## ✅ 1. Check if a given string is palindrome or not
### **Problem Statement:**
Given a string, check if it reads the same backward as forward. Ignore case and special characters if required.

### **Example:**
```plaintext
Input: madam
Output: Palindrome

Input: hello
Output: Not a Palindrome
```

### **Code:**
```java
public static boolean isPalindrome(String str) {
    str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    int left = 0, right = str.length() - 1;
    while (left < right) {
        if (str.charAt(left++) != str.charAt(right--)) {
            return false;
        }
    }
    return true;
}
```

### **Time Complexity:** O(N)
### **Space Complexity:** O(1)

---

## ✅ 2. Count number of vowels, consonants, and spaces in a string
### **Problem Statement:**
Given a string, count how many vowels, consonants, and spaces are present in it.

### **Example:**
```plaintext
Input: Hello World
Output: Vowels: 3, Consonants: 7, Spaces: 1
```

### **Code:**
```java
public static void countVowelsConsonantsSpaces(String str) {
    int vowels = 0, consonants = 0, spaces = 0;
    str = str.toLowerCase();
    for (char ch : str.toCharArray()) {
        if (ch == ' ') spaces++;
        else if ("aeiou".indexOf(ch) != -1) vowels++;
        else if (Character.isLetter(ch)) consonants++;
    }
    System.out.println("Vowels: " + vowels + ", Consonants: " + consonants + ", Spaces: " + spaces);
}
```

### **Time Complexity:** O(N)
### **Space Complexity:** O(1)

---

## ✅ 3. Find the ASCII value of a character
### **Problem Statement:**
Given a character, find its ASCII value.

### **Example:**
```plaintext
Input: A
Output: 65

Input: a
Output: 97
```

### **Code:**
```java
public static int getASCII(char ch) {
    return (int) ch;
}
```

### **Time Complexity:** O(1)
### **Space Complexity:** O(1)

---

## ✅ 4. Remove all vowels from the string
### **Problem Statement:**
Given a string, remove all vowels (a, e, i, o, u) from it.

### **Example:**
```plaintext
Input: Hello World
Output: Hll Wrld
```

### **Code:**
```java
public static String removeVowels(String str) {
    return str.replaceAll("[aeiouAEIOU]", "");
}
```

### **Time Complexity:** O(N)
### **Space Complexity:** O(N)

---

## ✅ 5. Remove spaces from a string
### **Problem Statement:**
Given a string, remove all spaces from it.

### **Example:**
```plaintext
Input: Hello World
Output: HelloWorld
```

### **Code:**
```java
public static String removeSpaces(String str) {
    return str.replaceAll(" ", "");
}
```

### **Time Complexity:** O(N)
### **Space Complexity:** O(N)

---

## ✅ 6. Remove characters from a string except alphabets
### **Problem Statement:**
Given a string, remove all non-alphabetic characters (like digits, special characters, etc.).

### **Example:**
```plaintext
Input: He11o W@rld!
Output: HelloWorld
```

### **Code:**
```java
public static String removeNonAlphabets(String str) {
    return str.replaceAll("[^a-zA-Z]", "");
}
```

### **Time Complexity:** O(N)
### **Space Complexity:** O(N)

---

## ✅ 7. Reverse a string
### **Problem Statement:**
Given a string, reverse it.

### **Example:**
```plaintext
Input: Hello
Output: olleH
```

### **Code:**
```java
public static String reverseString(String str) {
    return new StringBuilder(str).reverse().toString();
}
```

### **Time Complexity:** O(N)
### **Space Complexity:** O(N)
