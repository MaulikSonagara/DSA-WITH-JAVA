/*
===========================================
🔹 RECURSIVE BUBBLE SORT ALGORITHM (O(n²))
===========================================

📌 **Introduction**:
Bubble Sort is a **comparison-based** sorting algorithm. It repeatedly compares adjacent elements and swaps them if they are in the wrong order. This process is repeated until the array is sorted.

- **Time Complexity**:
  - **Best Case**: O(n) (when the array is already sorted)
  - **Worst & Average Case**: O(n²) (when the array is in reverse order)
- **Space Complexity**: O(n) (recursive stack space)
- **Stable Sort?**: Yes (equal elements maintain their relative order)
- **Best Use Case**: When a simple and stable sorting method is needed for small datasets.

*/

public class s06_recursiveBubbleSort {

    // Recursive function for Bubble Sort
    public static void bubbleSortRecursive(int[] arr, int n) {
        // Base case: If only one element is left, return
        if (n == 1) {
            return;
        }

        // Step 1: Perform one pass of bubble sort
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // Swap adjacent elements if they are in the wrong order
                swap(arr, i, i + 1);
            }
        }

        // Step 2: Recursively call bubble sort for the remaining elements
        bubbleSortRecursive(arr, n - 1);
    }

    // Function to swap two elements in the array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main function to test Recursive Bubble Sort
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original Array:");
        printArray(arr);

        bubbleSortRecursive(arr, arr.length); // Perform Recursive Bubble Sort

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}

/*
===========================================
🔹 RECURSIVE BUBBLE SORT STEPS (EXAMPLE)
===========================================

🔹 **Example**: Sorting `[64, 34, 25, 12, 22, 11, 90]` in ascending order.

✅ **Step 1**: Perform one pass of Bubble Sort:
    - Compare and swap adjacent elements if needed:
    - `[34, 25, 12, 22, 11, 64, 90]`

✅ **Step 2**: Recursively sort the first `n-1` elements:
    - `[25, 12, 22, 11, 34, 64, 90]`
    
✅ **Step 3**: Repeat the process until the array is sorted:
    - `[12, 22, 11, 25, 34, 64, 90]`
    - `[12, 11, 22, 25, 34, 64, 90]`
    - `[11, 12, 22, 25, 34, 64, 90]`

===========================================
🔹 FINAL SORTED ARRAY: `[11, 12, 22, 25, 34, 64, 90]`
===========================================

📌 **Key Observations:**
✔ Recursive Bubble Sort **is conceptually the same as iterative Bubble Sort**, but implemented using recursion.  
✔ It is **not efficient for large datasets** due to its O(n²) time complexity.  
✔ It **requires additional recursive stack space** (O(n) in the worst case).  
✔ **Best case (O(n)) occurs when the array is already sorted**.  

*/
