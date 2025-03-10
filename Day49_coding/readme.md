# String Manipulation and Character Frequency Challenges

This README covers the following advanced string-based coding challenges in Java with complete code and explanation:

1. **Remove brackets from an algebraic expression**
2. **Sum of the numbers in a string**
3. **Capitalize the first and last character of each word**
4. **Calculate the frequency of characters in a string**
5. **Find non-repeating characters in a string**
6. **Check if two strings are anagrams of each other**
7. **Count the common sub-sequence in two strings**

---

## ✅ 1. Remove brackets from an algebraic expression
### **Problem Statement:**
Given an algebraic expression as a string, remove all brackets (`()`, `{}`, `[]`) from it.

### **Example:**
```plaintext
Input: (a+b)-(c-d)
Output: a+b-c-d
```

### **Java Code:**
```java
public static String removeBrackets(String str) {
    StringBuilder sb = new StringBuilder();
    for (char ch : str.toCharArray()) {
        if (ch != '(' && ch != ')' && ch != '{' && ch != '}' && ch != '[' && ch != ']') {
            sb.append(ch);
        }
    }
    return sb.toString();
}
```

### **Time Complexity:** O(N)
### **Space Complexity:** O(N)

---

## ✅ 2. Sum of the numbers in a string
### **Problem Statement:**
Given a string containing both alphabets and numbers, extract and sum all the numbers.

### **Example:**
```plaintext
Input: abc123def45
Output: 168
```

### **Java Code:**
```java
public static int sumOfNumbers(String str) {
    int sum = 0;
    String temp = "";
    for (char ch : str.toCharArray()) {
        if (Character.isDigit(ch)) {
            temp += ch;
        } else {
            if (!temp.equals("")) {
                sum += Integer.parseInt(temp);
                temp = "";
            }
        }
    }
    if (!temp.equals("")) {
        sum += Integer.parseInt(temp);
    }
    return sum;
}
```

### **Time Complexity:** O(N)
### **Space Complexity:** O(1)

---

## ✅ 3. Capitalize the first and last character of each word
### **Problem Statement:**
Given a string, capitalize the first and last character of each word.

### **Example:**
```plaintext
Input: hello world
Output: HellO WorlD
```

### **Java Code:**
```java
public static String capitalizeFirstAndLast(String str) {
    String[] words = str.split(" ");
    StringBuilder result = new StringBuilder();
    for (String word : words) {
        if (word.length() == 1) {
            result.append(Character.toUpperCase(word.charAt(0))).append(" ");
        } else {
            result.append(Character.toUpperCase(word.charAt(0)))
                  .append(word.substring(1, word.length()-1))
                  .append(Character.toUpperCase(word.charAt(word.length()-1)))
                  .append(" ");
        }
    }
    return result.toString().trim();
}
```

### **Time Complexity:** O(N)
### **Space Complexity:** O(N)

---

## ✅ 4. Calculate the frequency of characters in a string
### **Problem Statement:**
Given a string, calculate the frequency of each character.

### **Example:**
```plaintext
Input: hello
Output: h:1 e:1 l:2 o:1
```

### **Java Code:**
```java
import java.util.HashMap;

public static void frequencyCount(String str) {
    HashMap<Character, Integer> map = new HashMap<>();
    for (char ch : str.toCharArray()) {
        map.put(ch, map.getOrDefault(ch, 0) + 1);
    }
    for (char key : map.keySet()) {
        System.out.println(key + ":" + map.get(key));
    }
}
```

### **Time Complexity:** O(N)
### **Space Complexity:** O(N)

---

## ✅ 5. Find non-repeating characters in a string
### **Problem Statement:**
Given a string, find all non-repeating characters.

### **Example:**
```plaintext
Input: hello
Output: h e o
```

### **Java Code:**
```java
import java.util.HashMap;

public static void nonRepeatingChars(String str) {
    HashMap<Character, Integer> map = new HashMap<>();
    for (char ch : str.toCharArray()) {
        map.put(ch, map.getOrDefault(ch, 0) + 1);
    }
    for (char ch : str.toCharArray()) {
        if (map.get(ch) == 1) {
            System.out.print(ch + " ");
        }
    }
}
```

### **Time Complexity:** O(N)
### **Space Complexity:** O(N)

---

## ✅ 6. Check if two strings are anagrams of each other
### **Problem Statement:**
Given two strings, check if they are anagrams (contain the same characters in different orders).

### **Example:**
```plaintext
Input: listen, silent
Output: Anagrams
```

### **Java Code:**
```java
import java.util.Arrays;

public static boolean areAnagrams(String str1, String str2) {
    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    return Arrays.equals(arr1, arr2);
}
```

### **Time Complexity:** O(N log N)
### **Space Complexity:** O(1)

---

## ✅ 7. Count the common sub-sequence in two strings
### **Problem Statement:**
Given two strings, count the number of common subsequences.

### **Example:**
```plaintext
Input: abcde, ace
Output: 3
```

### **Java Code:**
```java
public static int commonSubsequence(String s1, String s2) {
    int[][] dp = new int[s1.length() + 1][s2.length() + 1];
    for (int i = 1; i <= s1.length(); i++) {
        for (int j = 1; j <= s2.length(); j++) {
            if (s1.charAt(i-1) == s2.charAt(j-1)) {
                dp[i][j] = dp[i-1][j-1] + 1;
            } else {
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
    }
    return dp[s1.length()][s2.length()];
}
```

### **Time Complexity:** O(N*M)
### **Space Complexity:** O(N*M)

