package Z_OOC;
// Base class

// Inheritance is a mechanism wherein a new class (derived class) inherits the properties and behaviors (methods) of an existing
// class (base class). This allows for code reusability and the creation of a hierarchical relationship between classes.
class Animal {
    void eat() {
        System.out.println("This animal is eating.");
    }
}

// Derived class
class Dog extends Animal {
    void bark() {
        System.out.println("The dog is barking.");
    }
}

public class _3Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Inherited method from Animal class
        myDog.bark(); // Method from Dog class
    }
}
