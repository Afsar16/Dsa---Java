package Z_OOC;

interface Drivable {
    void drive(); // abstract method
}

class Car implements Drivable {
    public void drive() {
        System.out.println("Car is driving.");
    }
}

class Bike implements Drivable {
    public void drive() {
        System.out.println("Bike is driving.");
    }
}

public class Main {
    public static void main(String[] args) {
        Drivable myCar = new Car();
        Drivable myBike = new Bike();

        myCar.drive();  // Output: Car is driving.
        myBike.drive(); // Output: Bike is driving.
    }
}
