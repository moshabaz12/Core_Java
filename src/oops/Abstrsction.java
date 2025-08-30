package oops;

abstract class Vehicle {
    abstract void start(); // Abstract method (no body)

    void fuel() {          // Concrete method (has body)
        System.out.println("Vehicle is fueled");
    }
}

class Car extends Vehicle {
    void start() {         // Providing implementation
        System.out.println("Car is starting");
    }
}

public class Abstrsction {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();  // Output: Car is starting
        v.fuel();   // Output: Vehicle is fueled
    }
}

