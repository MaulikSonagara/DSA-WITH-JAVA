/*
 * Java Loops - a02_Loops.java
 * This program covers different types of loops in Java, including:
 * - For Loop
 * - While Loop
 * - Do-While Loop
 * - Break and Continue Statements
 */

 public class a03_Loops {
    public static void main(String[] args) {
        // For Loop
        System.out.println("=== For Loop ===");
        /*
         * A for loop is used to iterate a set number of times.
         * It consists of three parts: initialization, condition, and increment/decrement.
         */
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }
        System.out.println();

        // While Loop
        System.out.println("=== While Loop ===");
        /*
         * A while loop runs as long as the given condition is true.
         * It is useful when the number of iterations is unknown beforehand.
         */
        int count = 1;
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }
        System.out.println();

        // Do-While Loop
        System.out.println("=== Do-While Loop ===");
        /*
         * A do-while loop executes at least once, then continues while the condition is true.
         */
        int num = 1;
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num <= 5);
        System.out.println();

        // Break Statement
        System.out.println("=== Break Statement ===");
        /*
         * The break statement exits the loop prematurely when a condition is met.
         */
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                System.out.println("Breaking the loop at " + i);
                break;
            }
            System.out.println("Iteration: " + i);
        }
        System.out.println();

        // Continue Statement
        System.out.println("=== Continue Statement ===");
        /*
         * The continue statement skips the current iteration and proceeds to the next one.
         */
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println("Odd number: " + i);
        }
    }
}
