/*
 * Java Inheritance - a09_Inheritance.java
 * This program demonstrates inheritance in Java.
 */

/*
 * Inheritance in Java:
 * Inheritance is a mechanism in which one class acquires the property of another class.
 * The class whose properties are inherited by other class is called the superclass (parent class)
 * and the class that inherits the properties is called subclass (child class).
 *
 * Key Benefits of Inheritance:
 * 1. Code reusability: You can reuse the methods and fields of the parent class.
 * 2. Establishes IS-A relationship: It represents the IS-A relationship (e.g., Dog IS-A Animal).
 * 3. Method Overriding: Subclasses can override the methods of the superclass to provide specific implementations.
 */

 public class a10_Inheritance {

    public static void main(String[] args) {
        System.out.println("=== Inheritance Example ===");

        // Creating objects of different classes
        Animal animal = new Animal("Generic Animal");
        Dog dog = new Dog("Buddy", "Golden Retriever");
        Cat cat = new Cat("Whiskers", "Siamese");

        // Calling methods on the objects
        animal.eat(); // From Animal class
        dog.eat();    // Inherited from Animal, but can be overridden
        dog.bark();   // From Dog class
        cat.eat();    // Inherited from Animal, but can be overridden
        cat.meow();   // From Cat class

        System.out.println(); // For spacing
    }
}

/*
 * Animal Class (Superclass):
 * This class represents a generic animal with common properties and behaviors.
 */
class Animal {
    private String name;

    /*
     * Constructor:
     * Initializes the name of the animal.
     */
    public Animal(String name) {
        this.name = name;
    }

    /*
     * Getter for Name
     */
    public String getName() {
        return name;
    }

    /*
     * Method: eat()
     * Represents the eating behavior of an animal.
     */
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

/*
 * Dog Class (Subclass):
 * This class inherits from the Animal class and adds specific properties and behaviors for dogs.
 */
class Dog extends Animal {
    private String breed;

    /*
     * Constructor:
     * Calls the superclass constructor to initialize the name and then initializes the breed.
     */
    public Dog(String name, String breed) {
        super(name); // Calling the constructor of the superclass (Animal)
        this.breed = breed;
    }

    /*
     * Method: bark()
     * Represents the barking behavior of a dog.
     */
    public void bark() {
        System.out.println(getName() + " (a " + breed + ") is barking.");
    }

    /*
     * Method Overriding: eat()
     * This method overrides the eat() method in the Animal class to provide a specific implementation for dogs.
     */
    @Override
    public void eat() {
        System.out.println(getName() + " (a " + breed + ") is eating dog food.");
    }
}

/*
 * Cat Class (Subclass):
 * This class inherits from the Animal class and adds specific properties and behaviors for cats.
 */
class Cat extends Animal {
    private String breed;

    /*
     * Constructor:
     * Calls the superclass constructor to initialize the name and then initializes the breed.
     */
    public Cat(String name, String breed) {
        super(name); // Calling the constructor of the superclass (Animal)
        this.breed = breed;
    }

    /*
     * Method: meow()
     * Represents the meowing behavior of a cat.
     */
    public void meow() {
        System.out.println(getName() + " (a " + breed + ") is meowing.");
    }

        /*
     * Method Overriding: eat()
     * This method overrides the eat() method in the Animal class to provide a specific implementation for dogs.
     */
    @Override
    public void eat() {
        System.out.println(getName() + " (a " + breed + ") is eating cat food.");
    }
}

/*
 * Key Concepts:
 * - Inheritance allows a class to inherit properties and behaviors from another class.
 * - The subclass inherits all public and protected members of the superclass.
 * - The subclass can override the methods of the superclass to provide specific implementations.
 * - The 'super' keyword is used to call the constructor or methods of the superclass.
 */
