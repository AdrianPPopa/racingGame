package org.fasttrackit;

/**
 * Hellooooooooooooooooooooooooooooooooooooooo world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car car = new Car();
        car.name = "Dacia";
        car.color = "blue";
        car.doorCount = 4;
        car.mileage = 9.5;
        car.fuelLevel = 50;
        car.running = true;

        Engine engine = new Engine();
        engine.manufacturer = "Renault";

        car.engine = engine;

        Car car1 = new Car();
        car1.name ="Volvo";
        car1.color = "green";
        car1.doorCount = 4;
        car1.mileage = 10;
        car1.fuelLevel = 60;
        car1.running = true;

        Car car2 = car;

        System.out.println(car.name);
        System.out.println(car2.name);

        System.out.println("Changing Values...");

        car.name = "Dacia Logan";

        System.out.println(car.name);
        System.out.println(car2.name);



        System.out.println("Our engine...");
        System.out.println(car.engine.manufacturer);


        double distance = car.accelerate(60, 0.5);
    }
}