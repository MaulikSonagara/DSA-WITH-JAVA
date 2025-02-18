/*
 * Java Data Types - a01_DataTypes.java
 * This program covers Java's fundamental data types, including:
 * - Primitive Data Types
 * - Wrapper Classes
 * - Type Casting
 * - Parsing Strings to Numbers
 */

/*
 * Data Types in Java:
 * Java has two main categories of data types:
 * 1. Primitive Data Types - Basic types such as int, double, char, and boolean.
 * 2. Non-Primitive Data Types - Includes classes, arrays, and interfaces.
 */

 public class a01_DataTypes {
    public static void main(String[] args) {
        // Primitive Data Types
        System.out.println("=== Primitive Data Types ===");
        /*
         * Primitive data types are the most basic types of data. They are predefined by Java.
         * - int: Stores integers (whole numbers) without decimals.
         * - double: Stores floating-point numbers with decimals.
         * - char: Stores a single character.
         * - boolean: Stores true or false values.
         */
        int intValue = 10;       // Integer type
        double doubleValue = 5.5; // Double (floating point) type
        char charValue = 'A';    // Character type
        boolean boolValue = true; // Boolean type

        // Display primitive data types
        System.out.println("Integer: " + intValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Character: " + charValue);
        System.out.println("Boolean: " + boolValue);
        System.out.println();

        // Wrapper Classes (Boxing and Unboxing)
        System.out.println("=== Wrapper Classes ===");
        /*
         * Wrapper classes provide a way to use primitive data types as objects.
         * - Each primitive type has a corresponding wrapper class (e.g., Integer for int, Double for double).
         * - Boxing: Converting a primitive value into its corresponding wrapper class object.
         * - Unboxing: Extracting the primitive value from the wrapper class object.
         */
        Integer wrappedInt = Integer.valueOf(intValue); // Boxing
        int unwrappedInt = wrappedInt.intValue(); // Unboxing
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Unwrapped Integer: " + unwrappedInt);
        System.out.println();

        // Type Casting
        System.out.println("=== Type Casting ===");
        /*
         * Type casting is converting a variable from one data type to another.
         * - Implicit Casting: Automatically converting a smaller type to a larger type (e.g., int to double).
         * - Explicit Casting: Manually converting a larger type to a smaller type (e.g., double to int).
         */
        double castedDouble = intValue; // Implicit casting (int to double)
        int castedInt = (int) doubleValue; // Explicit casting (double to int)
        System.out.println("Implicit Casting (int to double): " + castedDouble);
        System.out.println("Explicit Casting (double to int): " + castedInt);
        System.out.println();

        // Parsing Strings to Numbers
        System.out.println("=== Parsing Strings to Numbers ===");
        /*
         * Parsing is converting a string representation of a number into a numeric data type.
         * - Integer.parseInt(): Converts a string to an int.
         * - Double.parseDouble(): Converts a string to a double.
         */
        String numStr = "100";
        int parsedInt = Integer.parseInt(numStr); // Convert string to int
        double parsedDouble = Double.parseDouble("3.14"); // Convert string to double
        System.out.println("Parsed Integer: " + parsedInt);
        System.out.println("Parsed Double: " + parsedDouble);
    }
}
