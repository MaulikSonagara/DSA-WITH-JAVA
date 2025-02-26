/*
===========================================
🔹 MERGE SORT ALGORITHM (O(n log n))
===========================================

📌 **Introduction**:
Merge Sort is a **divide and conquer** sorting algorithm. It recursively divides the array into two halves, sorts each half, and then merges them back together in sorted order.

- **Time Complexity**: O(n log n) (for all cases)
- **Space Complexity**: O(n) (extra space for merging)
- **Stable Sort?**: Yes (preserves the relative order of equal elements)
- **Best Use Case**: When stability is required, and large datasets need efficient sorting.
*/

public class s04_mergeSort {

    // Function to perform Merge Sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2; // Find the middle index

            // Step 1: Recursively sort both halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Step 2: Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Function to merge two sorted subarrays
    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1; // Size of the left subarray
        int n2 = right - mid; // Size of the right subarray

        // Create temporary arrays
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        // Merge the two sorted arrays
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArr (if any)
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArr (if any)
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main function to test Merge Sort
    public static void main(String[] args) {
        int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
        System.out.println("Original Array:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1); // Perform Merge Sort

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}

/*
===========================================
🔹 MERGE SORT STEPS (EXAMPLE)
===========================================

🔹 **Example**: Sorting `[38, 27, 43, 3, 9, 82, 10]` in ascending order.

✅ **Step 1**: Divide the array into two halves:
    - Left: `[38, 27, 43, 3]`
    - Right: `[9, 82, 10]`

✅ **Step 2**: Recursively divide until single elements:
    - `[38, 27]` → `[38]` & `[27]`
    - `[43, 3]` → `[43]` & `[3]`
    - `[9, 82, 10]` → `[9]`, `[82, 10]` → `[82]` & `[10]`

✅ **Step 3**: Merge back in sorted order:
    - Merge `[38]` & `[27]` → `[27, 38]`
    - Merge `[43]` & `[3]` → `[3, 43]`
    - Merge `[27, 38]` & `[3, 43]` → `[3, 27, 38, 43]`
    - Merge `[82]` & `[10]` → `[10, 82]`
    - Merge `[9]` & `[10, 82]` → `[9, 10, 82]`
    - Merge `[3, 27, 38, 43]` & `[9, 10, 82]` → `[3, 9, 10, 27, 38, 43, 82]`

===========================================
🔹 FINAL SORTED ARRAY: `[3, 9, 10, 27, 38, 43, 82]`
===========================================

📌 **Key Observations:**
✔ Merge Sort has a **consistent O(n log n) time complexity** for all cases.  
✔ It is a **stable sorting algorithm** (preserves order of equal elements).  
✔ It **requires additional memory (O(n))** due to temporary arrays.  
✔ **Preferred for large datasets**, but **not ideal for in-place sorting** due to extra space usage.  

*/
