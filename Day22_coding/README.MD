# Day 22: Sorting Algorithms - Mastering Sorting Techniques 🚀💡

## 📜 Introduction
Sorting algorithms are fundamental techniques in computer science that arrange elements in a particular order (ascending/descending). Mastering sorting algorithms is essential for cracking coding interviews, competitive programming, and understanding underlying data structures.

In this document, we will cover the following sorting algorithms with:
- **Step-by-step Process**
- **Time Complexity (TC)**
- **Space Complexity (SC)**
- **Optimized Code Snippets**

---

## 📊 1. Selection Sort
### 💡 Process (Step-by-Step)
1. Find the minimum element from the unsorted array.
2. Swap it with the first element of the unsorted array.
3. Move the boundary of the sorted and unsorted array by one position.
4. Repeat the above steps until the entire array is sorted.

### ✅ Time Complexity
| Case      | Time Complexity |
|-----------|-----------------|
| Best      | O(n^2)            |
| Average   | O(n^2)            |
| Worst     | O(n^2)            |

### ✅ Space Complexity
- **O(1)** (In-place sorting)

### ✅ Code
```java
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
```

---

## 💨 2. Bubble Sort
### 💡 Process (Step-by-Step)
1. Start from the first index, compare the adjacent elements.
2. If the current element is greater than the next element, swap them.
3. Continue until the array is sorted.
4. Largest element bubbles up to the end after each pass.

### ✅ Time Complexity
| Case      | Time Complexity |
|-----------|-----------------|
| Best      | O(n) (Optimized) |
| Average   | O(n^2)           |
| Worst     | O(n^2)           |

### ✅ Space Complexity
- **O(1)** (In-place sorting)

### ✅ Code
```java
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
```

---

## 🧱 3. Insertion Sort
### 💡 Process (Step-by-Step)
1. Start from the second element.
2. Compare the current element with the left side elements.
3. Shift the elements if they are larger than the current element.
4. Place the current element in its correct position.

### ✅ Time Complexity
| Case      | Time Complexity |
|-----------|-----------------|
| Best      | O(n)              |
| Average   | O(n^2)           |
| Worst     | O(n^2)           |

### ✅ Space Complexity
- **O(1)** (In-place sorting)

### ✅ Code
```java
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
```

---

## 🔥 4. Merge Sort
### 💡 Process (Step-by-Step)
1. Divide the array into two halves.
2. Recursively sort each half.
3. Merge the two sorted halves to produce the final sorted array.

### ✅ Time Complexity
| Case      | Time Complexity |
|-----------|-----------------|
| Best      | O(n log n)       |
| Average   | O(n log n)       |
| Worst     | O(n log n)       |

### ✅ Space Complexity
- **O(n)** (Extra space for temporary arrays)

### ✅ Code
```java
public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++)
            leftArr[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        while (i < n1) arr[k++] = leftArr[i++];
        while (j < n2) arr[k++] = rightArr[j++];
    }
}
```

---

## ⚡ 5. Quick Sort
### 💡 Process (Step-by-Step)
1. Choose a **pivot** element.
2. Partition the array such that elements less than the pivot are on the left and greater are on the right.
3. Recursively apply the same logic to the left and right subarrays.

### ✅ Time Complexity
| Case      | Time Complexity |
|-----------|-----------------|
| Best      | O(n log n)       |
| Average   | O(n log n)       |
| Worst     | O(n^2)           |

### ✅ Space Complexity
- **O(log n)** (Recursive stack space)

### ✅ Code
```java
public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
}
```

