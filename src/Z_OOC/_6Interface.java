package Z_OOC;

// Define an interface

interface Animal6 {
    void sound();  // abstract method
    void sleep();  // abstract method
}

// Implement the interface in a class
class Dog6 implements Animal6 {

    // Providing implementation for the abstract method sound()
    public void sound() {
        System.out.println("Dog barks");
    }

    // Providing implementation for the abstract method sleep()
    public void sleep() {
        System.out.println("Dog sleeps");
    }
    public void eat() {
        System.out.println("Dog is eating");
    }
}

// Main class to test the implementation
public class _6Interface {
    public static void main(String[] args) {
        Dog6 myDog = new Dog6();
        myDog.sound();  // Calls the sound method
        myDog.sleep();  // Calls the sleep method
        myDog.eat();  // Calls the eat method
        myDog.eat();  // Calls the eat method
        myDog.eat();  // Calls the eat method
        myDog.eat();  // Calls the eat method
    }
}

