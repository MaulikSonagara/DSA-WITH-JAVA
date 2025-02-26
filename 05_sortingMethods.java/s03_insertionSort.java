/*
===========================================
🔹 INSERTION SORT ALGORITHM (O(n²))
===========================================

📌 **Introduction**:
Insertion Sort is a **comparison-based** sorting algorithm that builds the sorted array one element at a time. It picks an element and **inserts** it at the correct position in the already sorted part of the array.

- **Time Complexity**: 
  - Best Case: O(n) (when the array is already sorted)
  - Worst/Average Case: O(n²) (when the array is reversed or unsorted)
- **Space Complexity**: O(1) (in-place sorting)
- **Stable Sort?**: Yes (maintains the relative order of equal elements)
- **Best Use Case**: When the array is **small or nearly sorted**.
*/

public class s03_insertionSort {

    // Function to perform Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Step 1: Iterate through the array starting from the second element
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // The element to be placed correctly
            int j = i - 1;

            // Step 2: Move elements that are greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Step 3: Place the key in its correct position
            arr[j + 1] = key;
        }
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main function to test Insertion Sort
    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        System.out.println("Original Array:");
        printArray(arr);

        insertionSort(arr); // Perform Insertion Sort

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}

/*
 * ===========================================
 * 🔹 INSERTION SORT STEPS (EXAMPLE)
 * ===========================================
 * 
 * 🔹 **Example**: Sorting an array `[64, 25, 12, 22, 11]` in ascending order.
 * 
 * ✅ **Step 1**: Start from the second element and insert it in the correct
 * position.
 * - **Key = 25**, Compare with 64 → Move 64 → Insert 25
 * - **Array After Step 1**: `[25, 64, 12, 22, 11]`
 * 
 * ✅ **Step 2**: Insert 12 at the correct position.
 * - **Key = 12**, Compare with 64, 25 → Move both → Insert 12
 * - **Array After Step 2**: `[12, 25, 64, 22, 11]`
 * 
 * ✅ **Step 3**: Insert 22 at the correct position.
 * - **Key = 22**, Compare with 64, 25 → Move both → Insert 22
 * - **Array After Step 3**: `[12, 22, 25, 64, 11]`
 * 
 * ✅ **Step 4**: Insert 11 at the correct position.
 * - **Key = 11**, Compare with 64, 25, 22, 12 → Move all → Insert 11
 * - **Array After Step 4**: `[11, 12, 22, 25, 64]`
 * 
 * ===========================================
 * 🔹 FINAL SORTED ARRAY: `[11, 12, 22, 25, 64]`
 * ===========================================
 * 
 * 📌 **Key Observations:**
 * ✔ Insertion Sort is **efficient for small or nearly sorted arrays**.
 * ✔ It is **stable** (maintains the order of equal elements).
 * ✔ Best case performance is **O(n)** (when the array is already sorted).
 * ✔ It is **not efficient** for large inputs due to its O(n²) complexity.
 * 
 */