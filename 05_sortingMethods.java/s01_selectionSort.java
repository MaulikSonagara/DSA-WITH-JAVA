/*
===========================================
🔹 SELECTION SORT ALGORITHM (O(n²))
===========================================

📌 **Introduction**:
Selection Sort is a **comparison-based** sorting algorithm. It repeatedly selects the **smallest (or largest)** element from the unsorted part and swaps it with the first unsorted element.

- **Time Complexity**: O(n²) (even in the best case)
- **Space Complexity**: O(1) (in-place sorting)
- **Stable Sort?**: No (because swapping may change the relative order of equal elements)
- **Best Use Case**: When memory is limited and swapping is minimal

*/

public class s01_selectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Step 1: Iterate through each element in the array
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the first element is the smallest

            // Step 2: Find the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update minIndex if a smaller element is found
                }
            }

            // Step 3: Swap the found minimum element with the first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main function to test Selection Sort
    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        System.out.println("Original Array:");
        printArray(arr);

        selectionSort(arr); // Perform selection sort

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}

/*
 * 
 * ===========================================
 * 🔹 SELECTION SORT STEPS (EXAMPLE)
 * ===========================================
 * 
 * 🔹 **Example**: Sorting an array `[64, 25, 12, 22, 11]` in ascending order.
 * 
 * ✅ **Step 1**: Find the minimum element from index `0` to `n-1` and swap it
 * with the first element.
 * - **Unsorted Part**: `[64, 25, 12, 22, 11]`
 * - **Minimum Element**: `11`
 * - **Swap** `64` ↔ `11`
 * - **Array After Swap**: `[11, 25, 12, 22, 64]`
 * 
 * ✅ **Step 2**: Find the minimum element from index `1` to `n-1` and swap it
 * with the second element.
 * - **Unsorted Part**: `[25, 12, 22, 64]`
 * - **Minimum Element**: `12`
 * - **Swap** `25` ↔ `12`
 * - **Array After Swap**: `[11, 12, 25, 22, 64]`
 * 
 * ✅ **Step 3**: Find the minimum element from index `2` to `n-1` and swap it
 * with the third element.
 * - **Unsorted Part**: `[25, 22, 64]`
 * - **Minimum Element**: `22`
 * - **Swap** `25` ↔ `22`
 * - **Array After Swap**: `[11, 12, 22, 25, 64]`
 * 
 * ✅ **Step 4**: Find the minimum element from index `3` to `n-1` and swap it
 * with the fourth element.
 * - **Unsorted Part**: `[25, 64]`
 * - **Minimum Element**: `25`
 * - **Swap** `25` ↔ `25` (No change)
 * - **Array After Swap**: `[11, 12, 22, 25, 64]`
 * 
 * ✅ **Step 5**: The last element is already sorted.
 * 
 * ===========================================
 * 🔹 FINAL SORTED ARRAY: `[11, 12, 22, 25, 64]`
 * ===========================================
 * 
 * 📌 **Key Observations:**
 * ✔ Selection sort **does not require extra space (O(1) space complexity)**.
 * ✔ It performs well when **swaps need to be minimized**.
 * ✔ It is **not efficient for large datasets** due to its O(n²) complexity.
 * ✔ It is **not stable** (swapping can disrupt the relative order of equal
 * elements).
 * 
 */