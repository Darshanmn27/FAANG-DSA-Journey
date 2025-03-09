class Car 
{
    // Attributes (State)
    String color;
    String model;

    // Method (Behavior)
    void drive() 
    {
        System.out.println("The car is driving");
    }

    void brake() 
    {
        System.out.println("The car has stopped");
    }
}

public class Object_class
 {
    public static void main(String[] args) 
    {
        // Creating an Object of Car Class
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.model = "Tesla Model S";

        // Accessing Methods
        myCar.drive();
        myCar.brake();
    }
}