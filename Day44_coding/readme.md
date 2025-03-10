# Rank of Elements in Array

## Problem Statement
Given an array of integers `arr[]` of size `n`, the task is to find the **rank of each element** in the array.
- The rank of an element is defined as the **position of the element** if the array was sorted in increasing order.
- If two elements have the same value, they get the **same rank**.

## Example
### Example 1:
**Input:** arr[] = [20,15,26,2,98,6]  
**Output:** 4 3 5 1 6 2

**Explanation:** After sorting the array:
- [2, 6, 15, 20, 26, 98]
- Ranks: [1, 2, 3, 4, 5, 6]
- According to the input array: [20,15,26,2,98,6] → [4,3,5,1,6,2]

## ✅ Approach 1: Brute Force Approach (O(N^2))
### Idea:
- Traverse the array.
- For each element `arr[i]`, traverse the array again to count elements smaller than `arr[i]`.
- The size of this set plus 1 is the **rank** of the element.

### Java Code (Brute Force)
```java
import java.util.*;
public class Main {
  public static void main(String args[]) {
    int n = 6;
    int arr[] = {20,15,26,2,98,6};

    for (int i = 0; i < n; i++) {
      Set < Integer > s = new HashSet < Integer > ();
      for (int j = 0; j < n; j++) {
        if (arr[j] < arr[i]) {
          s.add(arr[j]);
        }
      }
      int rank = s.size() + 1;
      System.out.print(rank + " ");
    }
  }
}
```

### Time & Space Complexity
| Approach      | Time Complexity | Space Complexity |
|---------------|-----------------|------------------|
| **Brute Force** | O(N^2)           | O(N)             |

---

## ✅ Approach 2: Better Solution (Using Sorting)
### Idea:
- Create a temporary array and copy all elements.
- Sort the temporary array.
- Use a HashMap to store the rank of each element.
- Traverse the input array again and get the rank from the map.

### Java Code (Better Solution)
```java
import java.util.*;
public class Main {
  public static void main(String args[]) {
    int arr[] = {20,15,26,2,98,6};
    int n = arr.length;

    int temp[] = Arrays.copyOf(arr, n);
    Arrays.sort(temp);

    HashMap<Integer, Integer> rankMap = new HashMap<>();
    for (int i = 0; i < n; i++) {
      rankMap.put(temp[i], i + 1);
    }

    for (int i = 0; i < n; i++) {
      System.out.print(rankMap.get(arr[i]) + " ");
    }
  }
}
```

### Time & Space Complexity
| Approach       | Time Complexity | Space Complexity |
|----------------|-----------------|------------------|
| **Sorting + Map** | O(N log N)      | O(N)             |

---

## ✅ Approach 3: Optimal Solution (O(N)) Using Counting Sort
### Idea:
- Find the maximum element of the array.
- Use a frequency/counting array to calculate the rank.
- Traverse the input array and print the rank.

### Java Code (Optimal Solution)
```java
import java.util.*;
public class Main {
  public static void main(String args[]) {
    int arr[] = {20,15,26,2,98,6};
    int n = arr.length;

    int max = Arrays.stream(arr).max().getAsInt();
    int count[] = new int[max + 1];

    for (int i = 0; i < n; i++) {
      count[arr[i]]++;
    }

    int rank = 1;
    for (int i = 0; i <= max; i++) {
      if (count[i] > 0) {
        count[i] = rank++;
      }
    }

    for (int i = 0; i < n; i++) {
      System.out.print(count[arr[i]] + " ");
    }
  }
}
```

### Time & Space Complexity
| Approach            | Time Complexity | Space Complexity |
|---------------------|-----------------|------------------|
| **Counting Sort**    | O(N)             | O(max element)   |

---

## ✅ Test Cases
| Test Case # | Input Array             | Output Rank       |
|-------------|------------------------|-------------------|
| 1           | [20,15,26,2,98,6]       | 4 3 5 1 6 2       |
| 2           | [5,1,6,2]               | 3 1 4 2           |
| 3           | [100, 100, 100]         | 1 1 1             |
| 4           | [1,2,3,4,5]             | 1 2 3 4 5         |

