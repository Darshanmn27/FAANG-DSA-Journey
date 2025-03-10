# 📜 Number to Words - Convert Digits to Words

✅ **Example:**
- Input: `7824` → Output: **seven thousand eight hundred twenty four**
- Input: `370` → Output: **three hundred seventy**


## 💡 Approaches to Solve This Problem

### 🐢 Brute Force Approach

### ✅ Steps:
1. Break the number into thousands, hundreds, tens, and units place.
2. Use multiple if-else conditions to check the place value.
3. Append the words based on the place value.
4. Handle special cases like 11-19 using a separate condition.
5. Trim the final result to avoid unwanted spaces.

### ✅ Pseudocode:
```java
if (num / 1000 > 0) {
    result += units[num / 1000] + " thousand ";
    num %= 1000;
}
if (num / 100 > 0) {
    result += units[num / 100] + " hundred ";
    num %= 100;
}
if (num >= 11 && num <= 19) {
    result += teens[num - 10] + " ";
} else {
    result += tens[num / 10] + " ";
    result += units[num % 10] + " ";
}
```

### ✅ Time Complexity (TC):
- **O(1)** → Constant time as the maximum digits allowed is 4 (9999).

### ✅ Space Complexity (SC):
- **O(1)** → Constant space as we are using only predefined arrays.

### 🚫 Drawbacks of Brute Force:
- No scalability for larger numbers (more than 4 digits).
- Code becomes repetitive.

---

## ⚡ Optimal Solution

### ✅ Steps:
1. Use pre-defined arrays (`units[]`, `teens[]`, `tens[]`, `thousands[]`).
2. Break the number based on place value (thousands, hundreds, tens, ones).
3. Handle special cases like 11-19 directly using the `teens[]` array.
4. Append words to the `result` string in one go.
5. Trim the final result to remove unwanted spaces.

### ✅ Pseudocode:
```java
static String convertToWords(int num) {
    String result = "";
    if (num / 1000 > 0) {
        result += units[num / 1000] + " thousand ";
        num %= 1000;
    }
    if (num / 100 > 0) {
        result += units[num / 100] + " hundred ";
        num %= 100;
    }
    if (num >= 11 && num <= 19) {
        result += teens[num - 10] + " ";
    } else {
        result += tens[num / 10] + " ";
        result += units[num % 10] + " ";
    }
    return result.trim();
}
```

### ✅ Time Complexity (TC):
- **O(1)** → Constant time since maximum 4 digits are allowed.

### ✅ Space Complexity (SC):
- **O(1)** → Constant space as we use fixed arrays.

### ✅ Advantages of Optimal Solution:
- Cleaner and more readable code.
- Handles up to 4 digits efficiently.
- Can be extended easily to larger numbers.

---

## 🧑‍💻 Input/Output Example
| Input     | Output                                |
|------------|--------------------------------------|
| **7824**   | **seven thousand eight hundred twenty four** |
| **370**    | **three hundred seventy**            |
| **5**      | **five**                            |
| **11**     | **eleven**                          |
| **2001**   | **two thousand one**                |

