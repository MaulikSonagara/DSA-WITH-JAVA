/*
===========================================
🔹 BUBBLE SORT ALGORITHM (O(n²))
===========================================

📌 **Introduction**:
Bubble Sort is a **comparison-based** sorting algorithm. It repeatedly **swaps adjacent elements** if they are in the wrong order. The largest elements "bubble up" to their correct positions.

- **Time Complexity**: 
  - Best Case: O(n) (when the array is already sorted)
  - Worst/Average Case: O(n²) (when the array is reversed or unsorted)
- **Space Complexity**: O(1) (in-place sorting)
- **Stable Sort?**: Yes (does not change the relative order of equal elements)
- **Best Use Case**: When data is nearly sorted or when stability is required.
*/

public class s02_bubbleSort {

    // Function to perform Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Step 1: Iterate through the array
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // Optimization: Check if swapping occurred

            // Step 2: Compare adjacent elements and swap if needed
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Step 3: If no swaps occurred, array is already sorted
            if (!swapped)
                break;
        }
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main function to test Bubble Sort
    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        System.out.println("Original Array:");
        printArray(arr);

        bubbleSort(arr); // Perform Bubble Sort

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}

/*
 * ===========================================
 * 🔹 BUBBLE SORT STEPS (EXAMPLE)
 * ===========================================
 * 
 * 🔹 **Example**: Sorting an array `[64, 25, 12, 22, 11]` in ascending order.
 * 
 * ✅ **Step 1**: Compare adjacent elements and swap if needed.
 * - **Pass 1**: `[25, 12, 22, 11, 64]`
 * - **Pass 2**: `[12, 22, 11, 25, 64]`
 * - **Pass 3**: `[12, 11, 22, 25, 64]`
 * - **Pass 4**: `[11, 12, 22, 25, 64]` (Sorted)
 * 
 * ===========================================
 * 🔹 FINAL SORTED ARRAY: `[11, 12, 22, 25, 64]`
 * ===========================================
 * 
 * 📌 **Key Observations:**
 * ✔ Bubble Sort is **easy to implement** but inefficient for large datasets.
 * ✔ It is **stable** (does not change the relative order of equal elements).
 * ✔ Best case performance is **O(n)** when the array is already sorted.
 * ✔ It is **not efficient** for large inputs due to its O(n²) complexity.
 * 
 */
