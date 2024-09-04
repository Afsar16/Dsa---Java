package Z_OOC;
//Polymorphism allows objects to be treated as instances of their parent class. It also allows methods to do different
//things based on the object that is calling them. There are two types of polymorphism in Java:
//
//Compile-time Polymorphism (Method Overloading)
//Runtime Polymorphism (Method Overriding)

class Animal1 {
    void sound() {
        System.out.println("This animal makes a sound.");
    }
}

class Dog1 extends Animal1 {
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}

public class _4Polymorphism_methodOverriding {
    public static void main(String[] args) {
        Animal1 myAnimal = new Dog1();
        myAnimal.sound(); // Output: The dog barks.
    }
}
