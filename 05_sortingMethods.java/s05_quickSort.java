/*
===========================================
🔹 QUICK SORT ALGORITHM (O(n log n))
===========================================

📌 **Introduction**:
Quick Sort is a **divide and conquer** sorting algorithm. It selects a pivot element, partitions the array such that elements smaller than the pivot are on the left and larger ones on the right, and then recursively sorts the partitions.

- **Time Complexity**:
  - **Best & Average Case**: O(n log n)
  - **Worst Case**: O(n²) (when the pivot is always the smallest or largest element)
- **Space Complexity**: O(log n) (recursive stack)
- **Stable Sort?**: No (relative order of equal elements may change)
- **Best Use Case**: Efficient for large datasets and in-place sorting.
*/

public class s05_quickSort {

    // Function to perform Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Step 1: Partition the array and get pivot index
            int pivotIndex = partition(arr, low, high);

            // Step 2: Recursively sort left and right subarrays
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Function to partition the array
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing the last element as the pivot
        int i = low - 1; // Pointer for smaller elements

        // Step 3: Rearrange elements based on pivot
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // Step 4: Place pivot in the correct position
        swap(arr, i + 1, high);
        return i + 1; // Return the partition index
    }

    // Function to swap two elements
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

    // Main function to test Quick Sort
    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        System.out.println("Original Array:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1); // Perform Quick Sort

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}

/*
===========================================
🔹 QUICK SORT STEPS (EXAMPLE)
===========================================

🔹 **Example**: Sorting `[10, 7, 8, 9, 1, 5]` in ascending order.

✅ **Step 1**: Choose the pivot (e.g., `5` in this case) and partition the array:
    - **Before Partitioning**: `[10, 7, 8, 9, 1, 5]`
    - **Partitioning Around Pivot `5`**:
        - Move smaller elements to the left: `[1, 5, 8, 9, 10, 7]`
    - **Pivot Index After Partition**: `1`

✅ **Step 2**: Recursively apply Quick Sort on left and right partitions.
    - Left partition `[1]` (Already sorted)
    - Right partition `[8, 9, 10, 7]`

✅ **Step 3**: Choose the next pivot (`7`), partition and sort:
    - **Before Partitioning**: `[8, 9, 10, 7]`
    - **Partitioning Around Pivot `7`**:
        - Move smaller elements to the left: `[7, 8, 9, 10]`
    - **Pivot Index After Partition**: `2`

✅ **Step 4**: Recursively sort the remaining subarrays.

===========================================
🔹 FINAL SORTED ARRAY: `[1, 5, 7, 8, 9, 10]`
===========================================

📌 **Key Observations:**
✔ Quick Sort **has an average time complexity of O(n log n)**, making it very efficient.  
✔ It is an **in-place sorting algorithm** (no extra memory required).  
✔ It is **not stable**, meaning the order of equal elements might change.  
✔ **Worst case (O(n²)) occurs when the pivot selection is poor**, such as always picking the smallest or largest element.  
✔ **Best pivot strategy**: Choose a random pivot or use the median-of-three method.  

*/
