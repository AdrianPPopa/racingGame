package org.fasttrackit;

/**
 * Hellooooooooooooooooooooooooooooooooooooooo world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Engine engine = new Engine();
        engine.manufacturer = "Renault";

        Car car = new Car(engine);
        car.setName("Dacia");
        car.setColor("blue");
        car.doorCount = 4;
        car.setMileage(9.5);
        car.setFuelLevel(50);
        car.setRunning(true);


        Car car1 = new Car(new Engine());
        car1.setName("Volvo");
        car1.setColor("green");
        car1.doorCount = 4;
        car1.setMileage(10);
        car1.setFuelLevel(60);
        car1.setRunning(true);

        Car car2 = car;

        System.out.println(car.getName());
        System.out.println(car2.getName());

        System.out.println("Changing Values...");

        car.setName("Dacia Logan");

        System.out.println(car.getName());
        System.out.println(car2.getName());



        System.out.println("Our engine...");
        System.out.println(car.engine.manufacturer);


        double distance = car.accelerate(60, 0.5);

        System.out.println("Studying static variables ...");

        //demo for static variables (class variables)
//        car.totalCount = 1;
//        System.out.println("Total count from car: " + car.totalCount);
//
//        car1.totalCount = 2;
//        System.out.println("Total count from car: " + car.totalCount);
//        System.out.println("Total count from car1: " + car1.totalCount);
//        System.out.println("Total count from Vehicle class: " + Vehicle.totalCount);

        System.out.println("Total cars ... " + car.getTotalCount());

        car2.accelerate(100);
    }


}