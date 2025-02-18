/*
 * Java 'super' and 'this' Keywords - a08_SuperThis.java
 * A simplified demonstration of 'super' and 'this' in Java.
 */

/*
 * 'this' Keyword:
 * - Refers to the *current object* (instance) of the class.
 * - Used to access the object's variables (attributes) and methods.
 *
 * 'super' Keyword:
 * - Refers to the *parent class* of the current class.
 * - Used to call methods or constructors from the parent class.
 */

 public class a08_SuperThis {

    public static void main(String[] args) {
        System.out.println("=== 'super' and 'this' Example ===");

        // Creating a Dog object
        Dog dog = new Dog("Buddy", "Golden");
        dog.displayInfo(); // Demonstrates 'super' by calling Animal's displayInfo

        System.out.println(); // For spacing
    }
}

/*
 * Animal Class (Parent Class):
 * - Demonstrates the use of 'this' to refer to instance variables.
 */
class Animal {
    String name; // Simplified:  no longer private

    public Animal(String name) {
        // 'this.name' refers to the Animal's 'name' variable.
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Animal name: " + this.name); // 'this' is optional here, but good practice
    }
}

/*
 * Dog Class (Child Class):
 * - Demonstrates 'super' to call the parent class constructor and method.
 */
class Dog extends Animal {
    String breed;

    public Dog(String name, String breed) {
        // Call the Animal class's constructor using 'super'.
        super(name); // 'super(name)' calls Animal(String name)
        this.breed = breed; // 'this' is necessary to distinguish from the parameter
    }

    @Override
    public void displayInfo() {
        // Call the Animal class's displayInfo method using 'super'.
        super.displayInfo();  // Calls Animal's displayInfo
        System.out.println("Breed: " + this.breed);
    }
}
