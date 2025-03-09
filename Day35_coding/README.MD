# Regular Expressions (Regex) and DateTime Module in Java

## 📜 Table of Contents
- [1. Regular Expressions (Regex)](#1-regular-expressions-regex)
  - [1.1 What is Regular Expression (Regex)?](#11-what-is-regular-expression-regex)
  - [1.2 Why Use Regular Expressions in Java?](#12-why-use-regular-expressions-in-java)
  - [1.3 Java Regex Package](#13-java-regex-package)
  - [1.4 Predefined Character Classes](#14-predefined-character-classes)
  - [1.5 Quantifiers in Regex](#15-quantifiers-in-regex)
  - [1.6 Common Regex Patterns Examples](#16-common-regex-patterns-examples)
- [2. DateTime Module in Java](#2-datetime-module-in-java)
  - [2.1 What is DateTime in Java?](#21-what-is-datetime-in-java)
  - [2.2 LocalDate, LocalTime, LocalDateTime](#22-localdate-localtime-localdatetime)
  - [2.3 DateTimeFormatter Class](#23-datetimeformatter-class)
  - [2.4 Practical Examples](#24-practical-examples)

---

## 1. Regular Expressions (Regex)

### 1.1 What is Regular Expression (Regex)?
A **Regular Expression (Regex)** is a sequence of characters that forms a search pattern. It is widely used to search, match, and manipulate strings based on specific patterns.

In **Java**, the `java.util.regex` package is used for working with Regular Expressions.

---

### 1.2 Why Use Regular Expressions in Java?
- Validate user input (like Email, Phone Number, Username, Password, etc.)
- Search and extract text based on patterns
- Replace text within a string

---

### 1.3 Java Regex Package
The `java.util.regex` package contains two main classes:

- **Pattern Class**: Defines the pattern for regular expressions.
- **Matcher Class**: Used to search and perform operations based on the pattern.

**Syntax:**
```java
import java.util.regex.*;

Pattern pattern = Pattern.compile("[a-zA-Z]+@[a-zA-Z]+\.[a-zA-Z]{2,}");
Matcher matcher = pattern.matcher("test@gmail.com");

if(matcher.matches()) {
    System.out.println("Valid Email");
} else {
    System.out.println("Invalid Email");
}
```

---

### 1.4 Predefined Character Classes
| Character Class | Description |
|-----------------|-------------|
| `\d`             | Any digit (0-9) |
| `\D`             | Any non-digit character |
| `\w`             | Any word character (a-z, A-Z, 0-9) |
| `\W`             | Any non-word character |
| `\s`             | Any whitespace character |
| `\S`             | Any non-whitespace character |

---

### 1.5 Quantifiers in Regex
| Quantifier | Description |
|------------|-------------|
| `*`        | Zero or more times |
| `+`        | One or more times |
| `?`        | Zero or one time |
| `{n}`      | Exactly n times |
| `{n,}`     | At least n times |
| `{n,m}`    | Between n and m times |

---

### 1.6 Common Regex Patterns Examples

#### ✅ Validate Email
```java
String email = "test@gmail.com";
String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}";

if(email.matches(regex)) {
    System.out.println("Valid Email");
} else {
    System.out.println("Invalid Email");
}
```

#### ✅ Validate Phone Number (10 Digits)
```java
String phone = "9876543210";
String regex = "\d{10}";

if(phone.matches(regex)) {
    System.out.println("Valid Phone Number");
} else {
    System.out.println("Invalid Phone Number");
}
```

#### ✅ Extract Numbers from Text
```java
Pattern pattern = Pattern.compile("\d+");
Matcher matcher = pattern.matcher("Order 123 placed");

while(matcher.find()) {
    System.out.println(matcher.group());
}
```

---

## 2. DateTime Module in Java

### 2.1 What is DateTime in Java?
The **DateTime Module** in Java is used to work with Date, Time, and DateTime. It is provided by the `java.time` package.

---

### 2.2 LocalDate, LocalTime, LocalDateTime

#### ✅ LocalDate (Only Date)
```java
import java.time.LocalDate;

LocalDate date = LocalDate.now();
System.out.println(date);
```

#### ✅ LocalTime (Only Time)
```java
import java.time.LocalTime;

LocalTime time = LocalTime.now();
System.out.println(time);
```

#### ✅ LocalDateTime (Date and Time)
```java
import java.time.LocalDateTime;

LocalDateTime dateTime = LocalDateTime.now();
System.out.println(dateTime);
```

---

### 2.3 DateTimeFormatter Class
The `DateTimeFormatter` class is used to format date and time according to custom patterns.

**Example:**
```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

LocalDateTime dateTime = LocalDateTime.now();
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

System.out.println(dateTime.format(formatter));
```

Output:
```
10-03-2025 14:45:20
```

---

### 2.4 Practical Examples

#### ✅ Convert String to LocalDate
```java
String dateString = "2025-03-10";
LocalDate date = LocalDate.parse(dateString);
System.out.println(date);
```

#### ✅ Add/Subtract Days/Months/Years
```java
LocalDate today = LocalDate.now();
LocalDate nextWeek = today.plusDays(7);
LocalDate lastMonth = today.minusMonths(1);

System.out.println("Next Week: " + nextWeek);
System.out.println("Last Month: " + lastMonth);
```

#### ✅ Compare Two Dates
```java
LocalDate date1 = LocalDate.of(2025, 3, 10);
LocalDate date2 = LocalDate.now();

if(date1.isBefore(date2)) {
    System.out.println("Date1 is before Date2");
} else {
    System.out.println("Date1 is after Date2");
}
```

---

## 💻 Conclusion
In this document, we learned:
- ✅ What is Regular Expression (Regex) in Java
- ✅ How to use predefined patterns for validation
- ✅ Real-world practical examples of Regex
- ✅ What is DateTime Module in Java
- ✅ Working with LocalDate, LocalTime, LocalDateTime
- ✅ Formatting and Parsing DateTime
