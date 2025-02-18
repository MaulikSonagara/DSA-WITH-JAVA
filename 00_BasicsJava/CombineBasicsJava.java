/*
 * Java Basics - a00_BasicsJava.java
 * This program covers all the fundamental concepts of Java, including:
 * - Comment Syntax
 * - Printing Output
 * - Data Types
 * - Parsing
 * - Conditional Statements
 * - Loops (for, while, do-while)
 * - Functions
 * - OOP Concepts (Class, Objects, Inheritance, Polymorphism, Encapsulation, Abstraction)
 * - Arrays
 * - Exception Handling
 * - Interfaces
 * - Break and Continue Statements
 * - Constants
 */

// Single-line comment
/* Multi-line 
   comment */

   public class CombineBasicsJava {

    // Main method - entry point of Java programs
    public static void main(String[] args) {
        
        // 1. Printing Output
        System.out.println("=== Printing Output ===");
        /*
         * Printing output to the console is done using System.out.println() 
         * for printing with a new line and System.out.print() for printing 
         * without a new line. This is fundamental for displaying results.
         */
        System.out.println("Hello, World!"); // Print with new line
        System.out.print("Java Basics \n\n"); // Print without new line

        // 2. Data Types & Variables
        System.out.println("=== Data Types & Variables ===");
        /*
         * Java supports various data types such as int, double, char, boolean,
         * and String. Variables are used to store data values of these types.
         */
        int num = 10; // Integer
        double pi = 3.14; // Double (decimal)
        char letter = 'A'; // Character
        boolean isJavaFun = true; // Boolean
        String name = "Java"; // String

        // 3. Parsing (String to int, double, etc.)
        System.out.println("=== Parsing ===");
        /*
         * Parsing is the process of converting a string representation of a 
         * number into its corresponding numeric type using methods like 
         * Integer.parseInt() and Double.parseDouble().
         */
        String numStr = "100";
        int parsedNum = Integer.parseInt(numStr); // Convert string to int
        double parsedDouble = Double.parseDouble("3.14"); // Convert string to double
        
        System.out.println("Parsed Integer: " + parsedNum);
        System.out.println("Parsed Double: " + parsedDouble + "\n");

        // 4. Conditional Statements
        System.out.println("=== Conditional Statements ===");
        /*
         * Conditional statements allow the program to execute different 
         * blocks of code based on certain conditions using if-else statements.
         */
        if (num > 5) {
            System.out.println("Number is greater than 5");
        } else if (num == 5) {
            System.out.println("Number is 5");
        } else {
            System.out.println("Number is less than 5");
        }
        
        System.out.println(); // For spacing

        // 5. Loops
        System.out.println("=== Loops ===");
        /*
         * Loops are used to execute a block of code repeatedly. The common 
         * types of loops in Java are for loop, while loop, and do-while loop.
         */
        
        System.out.println("For Loop with Break and Continue:");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Breaking the loop at i = " + i);
                break; // Exit the loop when i equals 5
            }
            if (i % 2 == 0) {
                System.out.println("Even number: " + i);
                continue; // Skip the rest of the loop iteration for even numbers
            }
            System.out.println("Odd number: " + i);
        }

        System.out.println(); // For spacing

        System.out.println("While Loop:");
        int count = 0;
        while (count < 3) {
            System.out.println("Count: " + count);
            count++;
        }

        System.out.println(); // For spacing

        System.out.println("Do-While Loop:");
        int doCount = 0;
        do {
            System.out.println("Do-While Count: " + doCount);
            doCount++;
        } while (doCount < 2);

        System.out.println(); // For spacing

        // 6. Functions (Methods)
        System.out.println("=== Functions (Methods) ===");
        /*
         * Functions or methods are blocks of code that perform a specific task.
         * They can take parameters and return values.
         */
        printMessage("Java is Awesome!");

        System.out.println(); // For spacing

        // 7. OOP Concepts
        System.out.println("=== OOP Concepts ===");
        /*
         * Object-Oriented Programming (OOP) allows modeling real-world entities 
         * using classes and objects. Key concepts include inheritance,
         * encapsulation, polymorphism, and abstraction.
         */
        
        Person person = new Person("Alice", 25);
        person.displayInfo();

        // Demonstrating Inheritance
        Student student = new Student("Bob", 20, "CS");
        student.displayInfo();

        System.out.println(); // For spacing

        // 8. Arrays Example
        System.out.println("=== Arrays ===");
        /*
         * Arrays are used to store multiple values in a single variable,
         * instead of declaring separate variables for each value.
         */
        
        int[] numbers = {1, 2, 3, 4, 5}; // Array declaration and initialization
       
       for (int number : numbers) { // Enhanced for loop to iterate through the array
           System.out.print(number + " ");
       }
       System.out.println("\n"); // New line after array output

       // 9. Exception Handling Example
       System.out.println("=== Exception Handling ===");
       /*
       * Exception handling in Java provides a mechanism to handle runtime errors,
       * allowing the program to continue executing or terminate gracefully.
       */
       try {
           int result = divide(10, 0); // This will cause an ArithmeticException
           System.out.println("Result: " + result);
       } catch (ArithmeticException e) {
           System.out.println("Error: Cannot divide by zero.");
       }

       System.out.println(); // For spacing

       // 10. Interface Example
       System.out.println("=== Interface Example ===");
       /*
       * An interface in Java is a reference type similar to a class that can 
       * contain only constants, method signatures, default methods, static methods,
       * and nested types. Interfaces cannot contain instance fields.
       */
       
       Animal dog = new Dog(); // Creating an instance of Dog which implements Animal interface
       dog.makeSound();

       System.out.println(); // For spacing

       // 11. Constants Example using final keyword
       System.out.println("=== Constants ===");
       /*
       * Constants are variables whose values cannot be changed once assigned.
       * They are declared using the final keyword in Java.
       */
       
       final int MAX_USERS = 100; // Declaring a constant using final keyword
       System.out.println("Maximum Users Allowed: " + MAX_USERS);
    }

    // Function Example
    static void printMessage(String message) {
      /*
      This method prints a message passed as an argument to it.
      It demonstrates how functions can be defined and called in Java.
      */
      System.out.println("Message: " + message);
    }

    // Method for division with exception handling demonstration
    static int divide(int a, int b) {
      /*
      This method performs division operation on two integers.
      It demonstrates how methods can return values in Java.
      */
      return a / b; // Potential division by zero exception here.
    }
}

// Object-Oriented Programming (OOP) Concepts

// Encapsulation & Class
class Person {
    private String name;
    private int age;

    /* Constructor */
    public Person(String name, int age) {
      /*
      Constructor initializes the object with name and age when it is created.
      It demonstrates how constructors work in Java classes.
      */
      this.name = name;
      this.age = age;
    }

    /* Getter Methods */
    public String getName() {
      return name;
    }

    public int getAge() {
      return age;
    }

    /* Method to display information */
    public void displayInfo() {
      /*
      This method displays the name and age of the person object.
      It showcases how methods can be used within classes in OOP.
      */
      System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Inheritance (Student extends Person)
class Student extends Person {
    private String major;

    public Student(String name, int age, String major) {
      /*
      Constructor initializes the student object with name, age,
      and major while calling the parent class constructor.
      It demonstrates constructor chaining in inheritance.
      */
      super(name, age); 
      this.major = major;
    }

    @Override /* Polymorphism - Overriding method */
    public void displayInfo() {
      /*
      This method overrides the displayInfo method from Person class 
      to include major information about the student.
      It illustrates polymorphism in OOP by overriding methods.
      */
      super.displayInfo(); 
      System.out.println("Major: " + major);
    }
}

// Interface Example for Animals
interface Animal {
    void makeSound(); /* Abstract method for making sound. */
}

// Dog class implementing Animal interface.
class Dog implements Animal {
    @Override 
    public void makeSound() { 
      /* Implementation of makeSound method specific to Dog class. */
      System.out.println("Woof! Woof!"); 
     }
}
