# Find the Smallest and Largest Number in an Array

## Problem Statement
### Task 1: Find the Smallest Number in an Array
Given an array of integers **nums**, find the **smallest number** in the array and return it.

### Task 2: Find the Largest Number in an Array
Given an array of integers **nums**, find the **largest number** in the array and return it.

### Example 1:
```
Input: nums = [5, 2, 8, 1, 6]
Smallest Number: 1
Largest Number: 8
```

### Example 2:
```
Input: nums = [3, 7, 2, 9, 4]
Smallest Number: 2
Largest Number: 9
```

---

## Task 1: Find the Smallest Number in an Array

### Approach 1: Brute Force Solution (O(N^2))
### Logic:
- Traverse the array using nested loops.
- Compare each element with others to find the minimum.
- Return the minimum element.

### Code:
```java
public int findSmallest(int[] nums) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < nums.length; i++) {
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] < min) {
                min = nums[j];
            }
        }
    }
    return min;
}
```

### Time Complexity: O(N^2)
### Space Complexity: O(1)

---

### Approach 2: Better Solution (O(N))
### Logic:
- Traverse the array once.
- Compare each element with a variable `min`.
- Update `min` if the current element is smaller.
- Return `min`.

### Code:
```java
public int findSmallest(int[] nums) {
    int min = nums[0];
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] < min) {
            min = nums[i];
        }
    }
    return min;
}
```

### Time Complexity: O(N)
### Space Complexity: O(1)

---

### Approach 3: Optimal Solution using Arrays.stream() (O(N))
### Logic:
- Use Java 8 Streams API to find the minimum element.

### Code:
```java
import java.util.Arrays;

public int findSmallest(int[] nums) {
    return Arrays.stream(nums).min().getAsInt();
}
```

### Time Complexity: O(N)
### Space Complexity: O(1)

---

## Task 2: Find the Largest Number in an Array

### Approach 1: Brute Force Solution (O(N^2))
### Logic:
- Traverse the array using nested loops.
- Compare each element with others to find the maximum.
- Return the maximum element.

### Code:
```java
public int findLargest(int[] nums) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > max) {
                max = nums[j];
            }
        }
    }
    return max;
}
```

### Time Complexity: O(N^2)
### Space Complexity: O(1)

---

### Approach 2: Better Solution (O(N))
### Logic:
- Traverse the array once.
- Compare each element with a variable `max`.
- Update `max` if the current element is larger.
- Return `max`.

### Code:
```java
public int findLargest(int[] nums) {
    int max = nums[0];
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] > max) {
            max = nums[i];
        }
    }
    return max;
}
```

### Time Complexity: O(N)
### Space Complexity: O(1)

---

### Approach 3: Optimal Solution using Arrays.stream() (O(N))
### Logic:
- Use Java 8 Streams API to find the maximum element.

### Code:
```java
import java.util.Arrays;

public int findLargest(int[] nums) {
    return Arrays.stream(nums).max().getAsInt();
}
```

### Time Complexity: O(N)
### Space Complexity: O(1)

---

## Comparison of All Solutions
| Task          | Approach   | Time Complexity | Space Complexity | Best Choice     |
|---------------|------------|-----------------|-----------------|-----------------|
| Smallest      | Brute Force | O(N^2)           | O(1)             | ❌ Worst        |
| Smallest      | Better      | O(N)             | O(1)             | ✅ Best         |
| Smallest      | Optimal     | O(N)             | O(1)             | ✅ Best         |
| Largest       | Brute Force | O(N^2)           | O(1)             | ❌ Worst        |
| Largest       | Better      | O(N)             | O(1)             | ✅ Best         |
| Largest       | Optimal     | O(N)             | O(1)             | ✅ Best         |

---

## Interviewer Insights 💡
- ✅ Always mention the **Brute Force** approach, then optimize it.
- ✅ If the interviewer expects a modern solution, mention **Java 8 Streams API**.
- ✅ For competitive programming, always use **O(N) Time Complexity**.
