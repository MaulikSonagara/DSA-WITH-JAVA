/*
 * Java Interfaces - a06_Interfaces.java
 * This program demonstrates the use of interfaces in Java.
 */

/*
 * Interfaces in Java:
 * An interface is a completely abstract class. It contains only abstract methods.
 * The purpose of an interface is to specify a capability that multiple classes can implement.
 * They are used to achieve abstraction and multiple inheritance in Java.
 */

 public class a06_Interfaces {
    public static void main(String[] args) {
       // Interface Example
       System.out.println("=== Interface Example ===");
       /*
        * In this example, we create an Animal interface and a Dog class that implements it.
        * The interface defines the makeSound() method, and the Dog class provides a concrete
        * implementation of this method.
        */

       Animal dog = new Dog(); // Creating an instance of Dog which implements Animal interface
       dog.makeSound(); // Calling the makeSound() method on the Dog object

       System.out.println(); // For spacing
    }
}

/*
 * Defining an Interface:
 * The 'Animal' interface defines a contract that any class implementing it must adhere to.
 * In this case, the contract is to provide an implementation for the 'makeSound()' method.
 */
interface Animal {
    /*
     * Abstract method:
     * An abstract method is a method that is declared without an implementation.
     * Classes that implement the interface must provide an implementation for this method.
     */
    void makeSound(); // Abstract method (no body)
}

/*
 * Implementing an Interface:
 * The 'Dog' class implements the 'Animal' interface, providing a concrete implementation
 * for the 'makeSound()' method.
 */
class Dog implements Animal {
    /*
     * Implementing the abstract method:
     * The 'makeSound()' method is implemented in the Dog class, providing the specific
     * behavior for a dog making a sound (Woof! Woof!).
     */
    @Override
    public void makeSound() {
      /* Implementation of makeSound method specific to Dog class. */
      System.out.println("Woof! Woof!");
    }
}

/*
 * Key Concepts:
 * - Interfaces define a contract for classes to implement.
 * - Classes can implement multiple interfaces.
 * - Interfaces promote loose coupling and abstraction in code.
 * - An interface can contain abstract methods, default methods, and constants.
 */

 