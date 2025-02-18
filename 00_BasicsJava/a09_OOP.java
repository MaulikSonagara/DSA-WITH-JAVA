/*
 * a07_OOP.java - Object-Oriented Programming in Java
 *
 * This program demonstrates core OOP concepts:
 *   - Encapsulation
 *   - Abstraction
 *   - Inheritance (Implementation and Extension)
 *   - Polymorphism (Method Overriding & Interfaces)
 *   - Adapters (Demonstrating Adapter Pattern)
 */

/*
 * Object-Oriented Programming (OOP) Principles:
 *
 * 1. Encapsulation: Bundling data (attributes) and methods that operate on that data into a single unit (class).
 *    - Prevents direct access to internal data, promoting data integrity. Achieved through access modifiers (private, protected, public).
 *
 * 2. Abstraction: Hiding complex implementation details and showing only necessary information (interface) to the user.
 *    - Simplifies the user's interaction with the object. Achieved using abstract classes and interfaces.
 *
 * 3. Inheritance: Creating new classes (subclasses) based on existing classes (superclasses).
 *    - Subclasses inherit attributes and methods from the superclass, promoting code reuse and a "is-a" relationship.
 *    - Java supports single inheritance (a class can extend only one class) but can implement multiple interfaces.
 *
 * 4. Polymorphism: The ability of an object to take on many forms. Achieved through:
 *    - Method Overriding: Subclasses providing a specific implementation of a method already defined in the superclass.
 *    - Method Overloading: Defining multiple methods in the same class with the same name but different parameters.
 *    - Interfaces:  Allowing objects of different classes to be treated as objects of a common interface type.
 *
 * 5. Adapters: A design pattern that allows classes with incompatible interfaces to work together.  An adapter
 *    wraps an existing class and provides a new interface that clients can use.  This allows you to reuse
 *    existing code without modifying it.
 */

 public class a09_OOP {

    public static void main(String[] args) {
        System.out.println("=== Object-Oriented Programming Demonstration ===");

        // === Encapsulation & Abstraction ===
        Animal myDog = new Dog("Buddy", "Golden Retriever");
        myDog.displayInfo(); // Accessing data through methods (encapsulation)
        myDog.makeSound();   // Abstraction: We don't need to know *how* the dog makes sound

        // === Inheritance (Extends) ===
        // 'Dog' inherits from 'Animal', adding a breed.
        ((Dog)myDog).wagTail();

        // === Inheritance (Implements) & Polymorphism (Interface) ===
        // Using an interface reference to access different types of objects.
        Movable myCar = new Car();
        myCar.move(); // Polymorphic call: 'Car' implements 'move' differently.

        Movable myFlyingCar = new FlyingCar();
        myFlyingCar.move();

        // === Adapters ===
        // Using an adapter to make an incompatible class work with the Movable interface
        LegacyCode legacy = new LegacyCode();
        Movable legacyAdapter = new LegacyCodeAdapter(legacy);
        legacyAdapter.move(); // Adapter makes LegacyCode compatible with Movable

        System.out.println("=== OOP Demonstration Complete ===");
    }
}

// === Encapsulation & Abstraction: Animal (Abstract Class) ===

/*
 * Abstract Class: Animal
 * - Demonstrates encapsulation (private attributes) and abstraction (abstract method).
 * - Cannot be instantiated directly. Serves as a base class for other animals.
 */
abstract class Animal {

    private String name;    // Encapsulation: Private attribute
    private String type;

    public Animal(String name,String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() { // Getter method (Encapsulation)
        return name;
    }

    public String getType() {
        return type;
    }


    // Abstract method (Abstraction): Subclasses *must* implement this.
    public abstract void makeSound();

    public void displayInfo() {
        System.out.println("Name: " + name + ", Animal Type: " + type);
    }
}

// === Inheritance (Extends): Dog (Concrete Class) ===

/*
 * Inheritance: Dog extends Animal
 * - 'Dog' inherits 'name' from 'Animal', extending its functionality.
 * - Demonstrates method overriding (makeSound).
 */
class Dog extends Animal {

    public Dog(String name, String breed) {
        super(name, "Dog"); // Call Animal's constructor.
        this.breed = breed;
    }

    private String breed;   // Dog-specific attribute

    public String getBreed() {
        return breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    public void wagTail() {
        System.out.println(getName() + " is wagging its tail!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
}

// === Inheritance (Implements) & Polymorphism (Interface) ===

/*
 * Interface: Movable
 * - Defines a contract for movement (abstraction).
 * - Classes that implement Movable *must* provide a 'move' method.
 */
interface Movable {
    void move();
}

/*
 * Car (Implements Movable):
 * - A concrete class that implements the Movable interface.
 * - Provides a specific implementation of the 'move' method.
 */
class Car implements Movable {
    @Override
    public void move() {
        System.out.println("Car is driving on the road.");
    }
}

class FlyingCar implements Movable{

    @Override
    public void move() {
        System.out.println("Flying Car is flying");
    }
}
// === Adapters ===

/*
 * LegacyCode: An existing class with an incompatible interface.
 * - We want to use this class with the Movable interface *without* modifying it.
 */
class LegacyCode {
    public void doSomethingElse() {
        System.out.println("Legacy code is doing something completely different.");
    }
}

/*
 * LegacyCodeAdapter (Adapter):
 * - Implements the Movable interface.
 * - Wraps a LegacyCode object and adapts its functionality to fit the Movable interface.
 */
class LegacyCodeAdapter implements Movable {

    private LegacyCode legacyCode;

    public LegacyCodeAdapter(LegacyCode legacyCode) {
        this.legacyCode = legacyCode;
    }

    @Override
    public void move() {
        System.out.println("Adapter: Converting LegacyCode's action to a 'move'.");
        legacyCode.doSomethingElse(); // Delegate the move to the legacy code.
    }
}
