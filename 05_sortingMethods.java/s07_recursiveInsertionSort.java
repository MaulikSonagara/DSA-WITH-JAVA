/*
===========================================
🔹 RECURSIVE INSERTION SORT ALGORITHM (O(n²))
===========================================

📌 **Introduction**:
Insertion Sort is a **comparison-based** sorting algorithm that builds the sorted array one element at a time by shifting elements as needed.

- **Time Complexity**:
  - **Best Case**: O(n) (when the array is already sorted)
  - **Worst & Average Case**: O(n²) (when the array is in reverse order)
- **Space Complexity**: O(n) (due to recursive stack space)
- **Stable Sort?**: Yes (equal elements maintain their relative order)
- **Best Use Case**: When sorting small datasets or nearly sorted arrays.

*/

public class s07_recursiveInsertionSort {

    // Recursive function for Insertion Sort
    public static void insertionSortRecursive(int[] arr, int n) {
        // Base case: If array has only one element, return
        if (n <= 1) {
            return;
        }

        // Step 1: Recursively sort first (n-1) elements
        insertionSortRecursive(arr, n - 1);

        // Step 2: Insert the last element at its correct position
        int last = arr[n - 1]; // Store last element
        int j = n - 2; // Start comparing from previous element

        // Shift elements to make space for last element
        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }

        // Place the last element at its correct position
        arr[j + 1] = last;
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main function to test Recursive Insertion Sort
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original Array:");
        printArray(arr);

        insertionSortRecursive(arr, arr.length); // Perform Recursive Insertion Sort

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}

/*
===========================================
🔹 RECURSIVE INSERTION SORT STEPS (EXAMPLE)
===========================================

🔹 **Example**: Sorting `[64, 25, 12, 22, 11]` in ascending order.

✅ **Step 1**: Recursively sort first 4 elements `[64, 25, 12, 22]`
    - Sort `[64, 25, 12, 22]` → `[25, 64, 12, 22]` → `[12, 25, 64, 22]` → `[12, 22, 25, 64]`

✅ **Step 2**: Insert `11` in the sorted array `[12, 22, 25, 64]`
    - **Shift**: `[12, 22, 25, 64, 64]`
    - **Shift**: `[12, 22, 25, 25, 64]`
    - **Shift**: `[12, 22, 22, 25, 64]`
    - **Shift**: `[12, 12, 22, 25, 64]`
    - **Insert `11` at correct position**: `[11, 12, 22, 25, 64]`

===========================================
🔹 FINAL SORTED ARRAY: `[11, 12, 22, 25, 64]`
===========================================

📌 **Key Observations:**
✔ Recursive Insertion Sort **is conceptually the same as iterative Insertion Sort**, but implemented using recursion.  
✔ It is **efficient for small datasets or nearly sorted arrays** due to O(n) best-case time complexity.  
✔ It **requires additional recursive stack space** (O(n) in the worst case).  
✔ **Best case (O(n)) occurs when the array is already sorted**.  

*/
