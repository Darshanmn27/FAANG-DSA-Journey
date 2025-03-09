class Car {
    private String engine;
    private int speed;

    public Car(String engine) 
    {
        this.engine = engine;
        this.speed = 0;
    }

    public void startCar() 
    {
        System.out.println("Car Started with " + engine);
    }

    public void accelerate() 
    {
        speed += 10;
        System.out.println("Car Accelerated. Speed: " + speed + " km/h");
    }

    public void stopCar() 
    {
        System.out.println("Car Stopped.");
        speed = 0;
    }
}

public class encapsulation 
{
    public static void main(String[] args) 
    {
        Car car = new Car("V8 Engine");

        car.startCar();
        car.accelerate();
        car.accelerate();
        car.stopCar();
    }
}