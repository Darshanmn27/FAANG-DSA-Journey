# Maximum Sum Subarray

## Problem Statement
Given an integer array `arr[]` of size `n`, the task is to find the **maximum sum subarray** (continuous subarray) from the array. The sum should be maximum among all possible subarrays.

### Example 1:
**Input:** arr[] = [-2,1,-3,4,-1,2,1,-5,4]  
**Output:** 6  
**Explanation:** The subarray [4,-1,2,1] has the maximum sum = 6.

### Example 2:
**Input:** arr[] = [1,2,3,-2,5]  
**Output:** 9  
**Explanation:** The subarray [1,2,3,-2,5] has the maximum sum = 9.

### Example 3:
**Input:** arr[] = [-1,-2,-3,-4]  
**Output:** -1  
**Explanation:** The subarray [-1] has the maximum sum = -1.

---

## ✅ Approach 1: Brute Force Approach
### Idea:
- Iterate through all possible subarrays.
- Calculate the sum of each subarray and keep track of the maximum sum.
- Time Complexity: O(N^2)
- Space Complexity: O(1)

### Java Code (Brute Force)
```java
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }
}
```

### Time & Space Complexity
| Approach      | Time Complexity | Space Complexity |
|---------------|-----------------|------------------|
| **Brute Force** | O(N^2)           | O(1)             |

---

## ✅ Approach 2: Optimal Approach (Kadane's Algorithm)
### Idea:
- Traverse the array once.
- Use a variable `currentSum` to track the sum of the current subarray.
- Use `maxSum` to track the maximum sum encountered.
- If `currentSum` becomes negative, reset it to zero.

### Steps:
1. Initialize `maxSum = Integer.MIN_VALUE` and `currentSum = 0`.
2. Traverse the array:
   - Add the current element to `currentSum`.
   - If `currentSum > maxSum`, update `maxSum`.
   - If `currentSum < 0`, reset `currentSum` to 0.
3. Return `maxSum`.

### Java Code (Optimal Solution)
```java
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            maxSum = Math.max(maxSum, currentSum);

            if (currentSum < 0)
                currentSum = 0;
        }
        return maxSum;
    }
}
```

### Time & Space Complexity
| Approach          | Time Complexity | Space Complexity |
|-------------------|-----------------|------------------|
| **Kadane's Algo**  | O(N)             | O(1)             |

---

## ✅ Test Cases
| Test Case # | Input Array                                      | Maximum Sum Subarray |
|-------------|------------------------------------------------|---------------------|
| 1           | [-2,1,-3,4,-1,2,1,-5,4]                         | 6                   |
| 2           | [1,2,3,-2,5]                                     | 9                   |
| 3           | [-1,-2,-3,-4]                                   | -1                  |
| 4           | [5,4,-1,7,8]                                     | 23                  |
| 5           | [-2,-3,4,-1,-2,1,5,-3]                           | 7                   |

---

## ✅ Edge Cases
1. **All elements are negative:** Return the maximum negative element.
2. **Array contains zero:** It should still calculate the maximum sum.
3. **Single element array:** Return the element itself.



## Problem Statement
Given an integer array `arr[]` of size `n`, the task is to find the **maximum product subarray** (continuous subarray) from the array. The product should be maximum among all possible subarrays.

### Example 1:
**Input:** arr[] = [2,3,-2,4]  
**Output:** 6  
**Explanation:** The subarray [2,3] has the maximum product = 6.

### Example 2:
**Input:** arr[] = [-2,0,-1]  
**Output:** 0  
**Explanation:** The subarray [0] has the maximum product = 0.

### Example 3:
**Input:** arr[] = [1,2,-3,4,-5,-6]  
**Output:** 720  
**Explanation:** The subarray [4,-5,-6] has the maximum product = 720.

---

## ✅ Approach 1: Brute Force Approach
### Idea:
- Iterate through all possible subarrays.
- Calculate the product of each subarray and keep track of the maximum product.
- Time Complexity: O(N^2)
- Space Complexity: O(1)

### Java Code (Brute Force)
```java
class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int currentProduct = 1;
            for (int j = i; j < nums.length; j++) {
                currentProduct *= nums[j];
                maxProduct = Math.max(maxProduct, currentProduct);
            }
        }
        return maxProduct;
    }
}
```

### Time & Space Complexity
| Approach      | Time Complexity | Space Complexity |
|---------------|-----------------|------------------|
| **Brute Force** | O(N^2)           | O(1)             |

---

## ✅ Approach 2: Optimal Approach (Dynamic Programming)
### Idea:
- Traverse the array once.
- Use two variables `maxProduct` and `minProduct` to keep track of the maximum and minimum product.
- If the current element is negative, swap `maxProduct` and `minProduct`.
- Calculate the maximum product subarray.

### Steps:
1. Initialize `maxProduct = nums[0]` and `minProduct = nums[0]`.
2. Traverse the array:
   - Track the temporary max and min.
   - Update `maxProduct` and `minProduct`.
   - Track the global `maxProduct`.
3. Return `maxProduct`.

### Java Code (Optimal Solution)
```java
class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);

            result = Math.max(result, maxProduct);
        }
        return result;
    }
}
```

### Time & Space Complexity
| Approach               | Time Complexity | Space Complexity |
|------------------------|-----------------|------------------|
| **Dynamic Programming** | O(N)             | O(1)             |

---

## ✅ Test Cases
| Test Case # | Input Array                                  | Maximum Product Subarray |
|-------------|-----------------------------------------------|-------------------------|
| 1           | [2,3,-2,4]                                   | 6                       |
| 2           | [-2,0,-1]                                    | 0                       |
| 3           | [1,2,-3,4,-5,-6]                             | 720                     |
| 4           | [-2,-3,7,0,2,-1,4,-5]                         | 420                     |
| 5           | [1,-2,3,-4,5,-6,7]                           | 2520                    |

---

## ✅ Edge Cases
1. **All elements are negative:** Track the maximum negative element.
2. **Array contains zero:** Handle subarray breaking with zeros.
3. **Single element array:** Return the element itself.



