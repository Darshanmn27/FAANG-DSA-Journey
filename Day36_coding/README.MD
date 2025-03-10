# Two Sum Problem

## Problem Statement
Given an array of integers **nums** and an integer **target**, return *indices* of the two numbers such that they add up to **target**.

You may assume that each input would have **exactly one solution**, and you may not use the same element twice.

You can return the answer in any order.

### Example 1:
```
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
```

### Example 2:
```
Input: nums = [3,2,4], target = 6
Output: [1,2]
```

### Example 3:
```
Input: nums = [3,3], target = 6
Output: [0,1]
```

---

## Approach 1: Brute Force Solution (O(N^2))
### Logic:
- Traverse the array with two nested loops.
- Check if any two elements sum up to the target.
- If found, return the indices.

### Code:
```java
public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] == target) {
                return new int[] { i, j };
            }
        }
    }
    return new int[] {}; // No solution found
}
```

### Time Complexity: O(N^2)
### Space Complexity: O(1)

---

## Approach 2: Better Solution using HashMap (O(N))
### Logic:
- Use a HashMap to store the element and its index.
- Traverse the array once.
- Check if (target - currentElement) exists in the map.
- If yes, return the indices.

### Code:
```java
import java.util.HashMap;

public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[] { map.get(complement), i };
        }
        map.put(nums[i], i);
    }
    return new int[] {}; // No solution found
}
```

### Time Complexity: O(N)
### Space Complexity: O(N)

---

## Approach 3: Optimal Solution using Two Pointers (O(N log N))
### Logic:
- Sort the array along with index.
- Use two pointers (left, right) to find the target sum.
- If sum is greater, move right.
- If sum is smaller, move left.

### Code:
```java
import java.util.Arrays;

class Pair {
    int value;
    int index;
    Pair(int value, int index) {
        this.value = value;
        this.index = index;
    }
}

public int[] twoSum(int[] nums, int target) {
    Pair[] pairs = new Pair[nums.length];
    for (int i = 0; i < nums.length; i++) {
        pairs[i] = new Pair(nums[i], i);
    }
    Arrays.sort(pairs, (a, b) -> a.value - b.value);

    int left = 0, right = nums.length - 1;
    while (left < right) {
        int sum = pairs[left].value + pairs[right].value;
        if (sum == target) {
            return new int[] { pairs[left].index, pairs[right].index };
        } else if (sum < target) {
            left++;
        } else {
            right--;
        }
    }
    return new int[] {}; // No solution found
}
```

### Time Complexity: O(N log N)
### Space Complexity: O(N)

---

## Which Solution is Best?
| Approach | Time Complexity | Space Complexity | Best For |
|-----------|----------------|-----------------|-----------|
| Brute Force | O(N^2)         | O(1)             | Small Inputs |
| HashMap    | O(N)           | O(N)             | Large Inputs (Best Choice) |
| Two Pointers | O(N log N)    | O(N)             | Sorted Array or Large Inputs |

✅ The **best and most optimal approach** for this problem is using **HashMap (Approach 2)**, as it handles large inputs in linear time with constant space.

---

## Interviewer Insights 💡
- Always mention the brute force solution first, then optimize it.
- Explain why HashMap is preferred (O(N) time complexity).
- In case of sorted arrays, two-pointer technique is a hidden gem.

💯 Now you are ready to ace this question in your **Cognizant** interview! 🚀🔥

