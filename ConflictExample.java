// Interface with a default method
interface Movable {
    default void move() {
        System.out.println("Moving from Movable interface (default).");
    }
}

// Abstract class with an abstract method
abstract class Vehicle {
    abstract void move(); // Abstract method
}

// Concrete class extending the abstract class and implementing the interface
class Car extends Vehicle implements Movable {
    // This will cause a compile-time error if not overridden
    // because Car inherits an abstract move() from Vehicle
    // and a default move() from Movable.
    // The abstract method takes precedence, requiring an implementation.
    @Override
    public void move() {
        System.out.println("Car is moving (implemented in Car).");
    }
}

public class ConflictExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.move();
    }
}