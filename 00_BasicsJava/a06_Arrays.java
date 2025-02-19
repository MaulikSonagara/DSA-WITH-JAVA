// a06_Arrays.java

public class a06_Arrays {

    public static void main(String[] args) {

        // 1. Array Declaration and Initialization
        // There are a few ways to declare and initialize arrays in Java.

        // a. Declare an array of integers with a fixed size:
        int[] numbers = new int[5];  // Creates an array that can hold 5 integers.
        // The default value for each element is 0.

        // b. Initialize the array with specific values during declaration:
        int[] moreNumbers = {10, 20, 30, 40, 50};

        // c. Declare and then initialize the array later:
        int[] evenNumbers;
        evenNumbers = new int[] {2, 4, 6, 8, 10};

        // 2. Accessing Array Elements
        // Array elements are accessed using their index, which starts from 0.

        System.out.println("First element of numbers array: " + numbers[0]); // Output: 0
        System.out.println("Third element of moreNumbers array: " + moreNumbers[2]); // Output: 30

        // 3. Modifying Array Elements
        numbers[0] = 100; // Change the first element of the 'numbers' array to 100.
        System.out.println("Modified first element of numbers array: " + numbers[0]); // Output: 100

        // 4. Array Length
        // The 'length' property gives the number of elements in the array.
        System.out.println("Length of moreNumbers array: " + moreNumbers.length); // Output: 5

        // 5. Iterating through an Array (using a for loop)
        System.out.print("Elements of evenNumbers array: ");
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.print(evenNumbers[i] + " "); // Output: 2 4 6 8 10
        }
        System.out.println(); // New line for better formatting

        // 6. Iterating through an Array (using a for-each loop - enhanced for loop)
        // This provides a simpler way to iterate through an array when you only need the values, not the index.
        System.out.print("Elements of numbers array (using for-each loop): ");
        for (int number : numbers) {
            System.out.print(number + " "); // Output: 100 0 0 0 0
        }
        System.out.println();

        // 7. Multi-dimensional Arrays (Arrays of Arrays)
        // Example:  A 2x3 array (2 rows, 3 columns)

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("Element at matrix[0][1]: " + matrix[0][1]); // Output: 2
        System.out.println("Element at matrix[1][2]: " + matrix[1][2]); // Output: 6

        // Iterating through a multi-dimensional array:
        System.out.println("Elements of the matrix:");
        for (int i = 0; i < matrix.length; i++) {  // Iterate through rows
            for (int j = 0; j < matrix[i].length; j++) { // Iterate through columns in the current row
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }

        // 8. Arrays Class (java.util.Arrays) - Useful utility methods
        //  This requires importing java.util.Arrays (which is implicit in many IDEs and not explicitly needed in this simple example)

        // a.  Arrays.toString() - Convert array to a string for easy printing
        System.out.println("numbers array as a string: " + java.util.Arrays.toString(numbers)); // Output: [100, 0, 0, 0, 0]

        // b. Arrays.sort() - Sort an array in ascending order (modifies the original array)
        int[] unsorted = {5, 2, 8, 1, 9};
        java.util.Arrays.sort(unsorted);
        System.out.println("Sorted unsorted array: " + java.util.Arrays.toString(unsorted)); // Output: [1, 2, 5, 8, 9]

        // c. Arrays.copyOf() - Create a copy of an array
        int[] copiedNumbers = java.util.Arrays.copyOf(numbers, numbers.length); // Creates a complete copy.
        copiedNumbers[0] = 500; // Modify the copied array

        System.out.println("Original numbers array: " + java.util.Arrays.toString(numbers));   // Output: [100, 0, 0, 0, 0] (unmodified)
        System.out.println("Copied numbers array: " + java.util.Arrays.toString(copiedNumbers)); // Output: [500, 0, 0, 0, 0] (modified)

    }
}
