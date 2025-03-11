## 🚀 Java User Input Techniques for Placements

This repository contains various methods to take input from the **command line (console)** in Java. It covers multiple scenarios for taking input, which is frequently asked in technical rounds of placements like **Cognizant, Infosys, TCS, Wipro, Capgemini, etc.**

This documentation also includes different ways to process input formats such as:
- ✅ Single Integer Input
- ✅ Multiple Space-separated Integers
- ✅ Comma-separated Integers
- ✅ Space-separated String Array
- ✅ Comma-separated String Array
- ✅ Square-bracket Input like `[1,2,3,4]`
- ✅ Mixed Input like `int, string, int, char, string`

---

## 💻 Java Code

Create a file called **`UserInputs.java`** and use the code below:

```java
import java.util.*;

public class UserInputs {

    // ✅ 1. Single Integer Input
    public static void singleIntegerInput(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("You entered: " + num);
    }

    // ✅ 2. Multiple Space-separated Integers Input
    public static void spaceSeparatedInput(Scanner sc) {
        String input = sc.nextLine();
        String[] arr = input.split(" ");
        int[] numbers = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            numbers[i] = Integer.parseInt(arr[i]);
        }

        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    // ✅ 3. Comma-separated Integer Input
    public static void commaSeparatedInput(Scanner sc) {
        String input = sc.nextLine();
        String[] arr = input.split(",");
        int[] numbers = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            numbers[i] = Integer.parseInt(arr[i].trim());
        }

        System.out.println("Comma-separated elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    // ✅ 4. Space-separated String Input
    public static void spaceSeparatedStringInput(Scanner sc) {
        String input = sc.nextLine();
        String[] names = input.split(" ");

        System.out.println("Names are:");
        for (String name : names) {
            System.out.print(name + " ");
        }
    }

    // ✅ 5. Comma-separated String Input
    public static void commaSeparatedStringInput(Scanner sc) {
        String input = sc.nextLine();
        String[] names = input.split(",");

        System.out.println("Names are:");
        for (String name : names) {
            System.out.print(name.trim() + " ");
        }
    }

    // ✅ 6. Square-bracket Input [1,2,3,4]
    public static void squareBracketInput(Scanner sc) {
        String input = sc.nextLine();
        input = input.replace("[", "").replace("]", "");
        String[] arr = input.split(",");
        int[] numbers = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            numbers[i] = Integer.parseInt(arr[i].trim());
        }

        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    // ✅ 7. Mixed Input like (int, String, int, char, String)
    public static void mixedInput(Scanner sc) {
        String[] input = sc.nextLine().split(" ");

        int n = Integer.parseInt(input[0]);
        String name = input[1];
        int age = Integer.parseInt(input[2]);
        char grade = input[3].charAt(0);
        String gender = input[4];

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Gender: " + gender);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Input Type:");
        System.out.println("1. Single Integer Input");
        System.out.println("2. Space-separated Integer Input");
        System.out.println("3. Comma-separated Integer Input");
        System.out.println("4. Space-separated String Input");
        System.out.println("5. Comma-separated String Input");
        System.out.println("6. Square-bracket Integer Input");
        System.out.println("7. Mixed Input (int, String, int, char, String)");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1: singleIntegerInput(sc); break;
            case 2: spaceSeparatedInput(sc); break;
            case 3: commaSeparatedInput(sc); break;
            case 4: spaceSeparatedStringInput(sc); break;
            case 5: commaSeparatedStringInput(sc); break;
            case 6: squareBracketInput(sc); break;
            case 7: mixedInput(sc); break;
            default: System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
```

---

## 📊 Input/Output Examples

### ✅ 1. Single Integer Input
**Input:**
```
5
```
**Output:**
```
You entered: 5
```

### ✅ 2. Space-separated Integer Input
**Input:**
```
1 2 3 4 5
```
**Output:**
```
Array elements:
1 2 3 4 5
```

### ✅ 3. Comma-separated Integer Input
**Input:**
```
1,2,3,4,5
```
**Output:**
```
Comma-separated elements:
1 2 3 4 5
```

### ✅ 4. Square-bracket Input
**Input:**
```
[1,2,3,4]
```
**Output:**
```
Array elements:
1 2 3 4
```

### ✅ 5. Mixed Input (int, String, int, char, String)
**Input:**
```
5 John 23 A Male
```
**Output:**
```
Name: John
Age: 23
Grade: A
Gender: Male
```

---

## 💯 Why This Code is Important for Placements
- 💻 **Frequently Asked in Technical Rounds** during campus placements.
- 📜 Covers all types of inputs from **basic to advanced.**
- 🎓 Helps you clear coding assessments with proper input-handling methods.
- ✅ Provides better understanding of `Scanner` class and `String.split()`.
