# 📜 Convert Words to Number in Java


| Input (Words) | Output (Number) |
|---------------|-----------------|
| five thousand six hundred seventy eight | 5678              |
| one hundred twenty three               | 123               |
| nine million one hundred fifty         | 9000150           |
| two hundred seventy five               | 275               |

This problem is often asked in **FAANG-level interviews** because it tests your understanding of:
- **HashMap usage** 📊
- **String manipulation** 📜
- **Mathematical logic for large multipliers** 💯
- **For-each loop traversal** 🔥

---

## 📊 **How This Code Works (Step-by-Step)**

### ✅ Step 1: Convert Input to Lowercase and Split
```java
String[] tokens = words.toLowerCase().split(" ");
```
This line does two things:
- Converts the input to **lowercase** (for case-insensitive processing)
- Splits the input based on space (" ") and stores it in an array.

### 📜 Example
Input:
```
Five thousand six hundred seventy eight
```
Array:
```
tokens = ["five", "thousand", "six", "hundred", "seventy", "eight"]
```

---

### ✅ Step 2: Process Each Token (Word)
```java
for (String token : tokens) {
```
This `for-each` loop goes through every word (token) in the array.

Example:
- First token → "five"
- Second token → "thousand"
- Third token → "six"
- ...so on

---

### ✅ Step 3: Check If the Word Exists in HashMap
The logic checks if the word (like "five") exists in the HashMap.

```java
if (map.containsKey(token)) {
   int value = map.get(token);
```
If it exists, it gets its corresponding integer value.

Example:
| Word       | Value   |
|------------|---------|
| five       | 5       |
| thousand   | 1000    |
| six        | 6       |
| hundred    | 100     |

---

### ✅ Step 4: Handle Multipliers like "hundred" or "thousand"
The code has special conditions to handle **multipliers** like:
```java
if (value == 100) {
   currentNumber *= 100;
}
else if (value >= 1000) {
   totalNumber += (currentNumber * value);
   currentNumber = 0;
}
```
- If the token is **"hundred"**, multiply `currentNumber` by 100.
- If the token is **"thousand"** or above, multiply the current value and add it to `totalNumber`.

Example:
```
five thousand six hundred seventy eight
```
Processing:
- 5 * 1000 = 5000
- 6 * 100 = 600
- 70 + 8 = 78
- Final Result: 5000 + 600 + 78 = **5678**

---

### ✅ Step 5: Final Addition
At the end of the loop, any remaining `currentNumber` is added to the total.
```java
totalNumber += currentNumber;
```
This handles the last remaining number part.


