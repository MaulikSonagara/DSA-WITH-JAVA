// a05_Function.java

/*
 * This program focuses on demonstrating functions (also known as methods) in Java.
 * It covers the following aspects:
 *   - What are functions and why are they used?
 *   - Function declaration and definition (syntax).
 *   - Function parameters (arguments).
 *   - Function return types.
 *   - Calling (invoking) functions.
 *   - The 'void' return type.
 *   - Function Overloading (demonstrated but explained in comments).
 */

 public class a05_Function {

    public static void main(String[] args) {
        System.out.println("=== Functions (Methods) in Java ===");

        // 1. Calling a function (invoking a method)
        // The 'greetUser' function is called with the argument "Alice".
        greetUser("Alice"); // Calling greetUser with a String argument

        // 2. Calling a function that returns a value
        // The 'add' function is called with arguments 5 and 3.  The *returned* value is stored in the 'sum' variable.
        int sum = add(5, 3); // Calling add and storing the returned value
        System.out.println("The sum of 5 and 3 is: " + sum);

        // 3. Calling a function with no arguments (and void return type)
        printSeparator(); // Calling printSeparator (no arguments, void return)

        // 4. Demonstrating function overloading (same name, different parameters)
        // The 'add' function is overloaded.  We have one version that adds two integers,
        // and another version that adds three integers.  The compiler knows which one to call
        // based on the arguments you provide.

        int sumThree = add(2, 4, 6); //Calling the three-parameter 'add' function
        System.out.println("The sum of 2, 4, and 6 is: " + sumThree);

        double sumDouble = add(2.5, 3.7); //Calling the add function with double
        System.out.println("The sum of 2.5 and 3.7 is: " + sumDouble);
    }

    // === Function Definitions ===

    // 1. Function with a parameter and void return type
    // 'void' means the function does *not* return any value.
    // This function takes a String as input (the user's name) and prints a greeting.
    static void greetUser(String name) {
        /*
         * Function Signature: static void greetUser(String name)
         *   - static:  Indicates that the function belongs to the class itself, not to any specific object of the class.
         *   - void:    The return type.  'void' means this function does not return a value. It performs an action but doesn't give anything back.
         *   - greetUser: The name of the function.  Choose descriptive names that indicate what the function does.
         *   - (String name):  The parameter list. This function takes one parameter: a String named 'name'.  Parameters are input values that the function uses.
         */
        System.out.println("Hello, " + name + "!");
    }

    // 2. Function with parameters and an int return type
    // This function takes two integers as input and returns their sum.
    static int add(int a, int b) {
        /*
         * Function Signature: static int add(int a, int b)
         *   - static: As above.
         *   - int:     The return type.  This function *returns* an integer value.  The 'return' keyword is used to specify the value that is returned.
         *   - add:     The name of the function.
         *   - (int a, int b): The parameter list.  This function takes two integer parameters, 'a' and 'b'.
         */
        int sum = a + b;
        return sum; // The 'return' keyword specifies the value to be returned
    }

    // 3. Function with no parameters and void return type
    // This function simply prints a separator line.
    static void printSeparator() {
        /*
         * Function Signature: static void printSeparator()
         *   - static: As above.
         *   - void:    The return type (no value is returned).
         *   - printSeparator: The name of the function.
         *   - ():      The parameter list.  This function takes *no* parameters.
         */
        System.out.println("--------------------");
    }

    // 4. Function Overloading Example (Functions with the same name but different parameters)

    // Overloaded 'add' function that takes three integers
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded 'add' function that takes two doubles
    static double add(double a, double b) {
        return a + b;
    }

    /*
     * Theory/Summary of Functions (Methods):
     *
     * - Functions are reusable blocks of code that perform a specific task.
     * - They help to organize code, make it more readable, and reduce redundancy.
     * - A function has a name, a list of parameters (inputs), and a return type (output).
     * - The 'void' return type indicates that the function does not return any value.
     * - The 'return' keyword is used to specify the value that a function returns.
     * - Function overloading allows you to define multiple functions with the same name but different parameter lists.
     *   (The number, types, or order of parameters must be different).
     */
}
