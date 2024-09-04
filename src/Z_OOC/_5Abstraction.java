package Z_OOC;
//  Abstraction is the concept of hiding the complex implementation details and showing only the essential features of an
//  object. Abstraction can be achieved in Java using abstract classes and interfaces.

abstract class Animal2 {
    // Abstract method (does not have a body)
    abstract void sound();

    // Regular method
    void eat() {
        System.out.println("This animal is eating.");
    }
}

class Dog2 extends Animal2 {
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}

public class _5Abstraction {
    public static void main(String[] args) {
        Dog2 myDog = new Dog2();
        myDog.sound(); // Output: The dog barks.
        myDog.eat();   // Output: This animal is eating.
    }
}

// Summary
//Class and Object: Basic building blocks, with objects being instances of classes.
//Encapsulation: Hides internal details, exposing only necessary parts of the object.
//Inheritance: Allows classes to inherit properties and methods from other classes.
//Polymorphism: Enables methods to perform different functions based on the object calling them.
//Abstraction: Focuses on hiding complex implementation and exposing only the necessary parts.

//1. Definition
//Encapsulation: Encapsulation is the process of bundling data (variables) and methods that operate on the data into a single
// unit or class. It restricts direct access to some of an object's components, which is a means of preventing accidental
// interference and misuse of the data. Encapsulation is achieved by using access modifiers like private, protected, and public.
//
//Abstraction: Abstraction is the concept of hiding the complex implementation details and showing only the essential features
// of an object. It focuses on what the object does instead of how it does it. Abstraction is typically achieved through
// abstract classes and interfaces.
//
//2. Purpose
//Encapsulation: The main purpose of encapsulation is to protect the data. It ensures that the internal representation
// of an object is hidden from the outside world and can only be accessed or modified through a well-defined interface
// (methods). This helps to maintain the integrity of the data and prevents unauthorized access or modification.
//
// Abstraction: The main purpose of abstraction is to simplify complexity by exposing only the relevant details
// of an object to the outside world. It allows developers to focus on the interactions and operations they need
// to perform, without worrying about the underlying implementation details.

// 3. How It Works
//Encapsulation: Encapsulation works by defining the class fields (variables) as private and providing public getter and
// setter methods to access and modify these fields. This way, you control how the data is accessed and modified.

/* class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }
}
*/

/* Abstraction: Abstraction works by using abstract classes or interfaces to define a set of operations without providing
the implementation. The actual implementation is provided by concrete classes that inherit from the abstract class or
 implement the interface.

Example:

java
Copy code
abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
} */