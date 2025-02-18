/*
 * Java Constructors - a08_Constructor.java
 * This program demonstrates the use of constructors in Java.
 */

/*
 * Constructors in Java:
 * A constructor is a special method that is called when an object of a class is created.
 * It is used to initialize the object's state (attributes).
 *
 * Key features of constructors:
 * 1. A constructor has the same name as the class.
 * 2. A constructor does not have a return type (not even void).
 * 3. If you don't define a constructor, Java provides a default constructor (no-argument constructor).
 * 4. You can have multiple constructors with different parameters (constructor overloading).
 */

 public class a07_Constructor {

    public static void main(String[] args) {
        System.out.println("=== Constructor Example ===");

        // Creating objects using different constructors
        Person person1 = new Person("Alice", 30); // Using the parameterized constructor
        Person person2 = new Person("Bob");    // Using the overloaded constructor with one parameter
        Person person3 = new Person();       // Using the default (no-argument) constructor

        // Displaying information about the objects
        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();

        System.out.println(); // For spacing
    }
}

/*
 * Person Class:
 * This class demonstrates constructors with and without parameters.
 */
class Person {
    private String name;
    private int age;

    /*
     * Default Constructor (No-Argument Constructor):
     * If no constructor is defined, Java provides a default constructor.
     * In this example, we explicitly define a no-argument constructor that initializes the name to "Unknown" and age to 0.
     */
    public Person() {
        System.out.println("Default constructor called");
        this.name = "Unknown";
        this.age = 0;
    }

    /*
     * Parameterized Constructor:
     * This constructor takes two parameters (name and age) to initialize the object.
     */
    public Person(String name, int age) {
        System.out.println("Parameterized constructor called with name and age");
        this.name = name;
        this.age = age;
    }

    /*
     * Overloaded Constructor:
     * This constructor takes only the name as a parameter and initializes the age to a default value (e.g., -1).
     * This demonstrates constructor overloading (multiple constructors with different parameters).
     */
    public Person(String name) {
        System.out.println("Parameterized constructor called with name only");
        this.name = name;
        this.age = -1; // Default age
    }

    /*
     * Method to display person information:
     * This method displays the name and age of the person.
     */
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    /*
     * Key Concepts:
     * - Constructors initialize the object's state when it is created.
     * - A constructor has the same name as the class and no return type.
     * - Java provides a default constructor if you don't define one.
     * - Constructor overloading allows you to have multiple constructors with different parameters.
     */
}
